package medigram.medigram;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.FileProvider;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.maps.model.LatLng;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AddRecordActivity extends Activity {
    /**
     * This activity displays the problems specified by the user as a list. The list of problems is
     * retrieved from the User given by the parent activity, and then filtered by keywords. Adding or
     * editing a problem is done by a child activity.
     * After adding or editing is done, the User data is updated over the network if available.
     */
    private Uri imageUri;
    private String provider;
    public static final int TAKE_PHOTO = 1;
    private Button geolocation;
    private Button addpicture;
    private Button save;
    private EditText commentEditText;
    private EditText titleEditText;
    private AccountManager accoutmanager;
    private Problem problem;
    private Record newrecord;
    private Patient patient;
    private LatLng location;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_record);

        accoutmanager = new AccountManager(getApplicationContext());

        commentEditText = findViewById(R.id.commentText);
        titleEditText = findViewById(R.id.recordTitle);
        geolocation = findViewById(R.id.Geo_location);
        addpicture = findViewById(R.id.Picture_Add);
        save = findViewById(R.id.save);



        // get current problem(using intent from the record view part to get problem id and patient id )
        //problem = Patient.getProblems().getProblem(0);
        patient = (Patient) getIntent().getSerializableExtra("Patient");
        problem = (Problem )getIntent().getSerializableExtra("Problem");
        newrecord = new Record();

        // add a new geolocation
        geolocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MapsActivity.class);
                startActivityForResult(intent, 1);
            }
        });


//        //here we are going to take a picture use the camera
//        addpicture.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
//             // build file to save the image
//                String saveingname = "JPEG_Record" + timeStamp + ".jpg";
//                File outputImage = new File(Environment.
//                        getExternalStorageDirectory(), saveingname);
//                try {
//                    if (outputImage.exists()) {
//                        outputImage.delete();
//                    }
//                    outputImage.createNewFile();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//                imageUri = Uri.fromFile(outputImage);
//                Intent intent = new Intent("android.media.action. IMAGE_CAPTURE");
//                intent.putExtra(MediaStore.EXTRA_OUTPUT, imageUri);
//                startActivityForResult(intent, TAKE_PHOTO); // activite the camera
//                newrecord.setPhotos(outputImage);
//            }
//        });

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title = titleEditText.getText().toString();
                String comment = commentEditText.getText().toString();
                newrecord = new Record(title, new Comment(comment, patient.getUserID()), new Date());
                if (location != null){
                    newrecord.setGeoLocation(location);
                }

                Log.d("New Record", newrecord.getComments().get(0).getText());
                Log.d("Patient jestID", patient.getJestID());

                Intent intent = new Intent();
                intent.putExtra("newRecord", newrecord);

                setResult(Activity.RESULT_OK, intent);
                finish();
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == Activity.RESULT_OK){
            if (requestCode == 1){
                location = data.getExtras().getParcelable("Location");

                Toast toast = Toast.makeText(AddRecordActivity.this, "Location successfully added.", Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER, 0, 320);
                toast.show();
            }
        }
    }
}
