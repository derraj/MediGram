## Use Cases

## Project name: MediGram

## Team 22


---------------------------------------------------------------------------------------------------------------------
### **UC-01**  (US 08.01.01)
|Use case name | Sign in  |
|------------- | :------ |
|Actors |   Patient   |
|       |Care provider|
|Goal   |  Log the user into APP and take them to their corresponding page  |
|Triggers | User starts the APP  
|Preconditions | All user has the APP installed
|       | Care provider has internet access (not necessary for the patient) |
|Postconditions  | Take user to their corresponding page
|Basic flow | 1. Starts APP
|       | 2. Enter user ID |
|       | 3. Choose to sign in |
|Exception  | 3: User ID not found
|       | 3.1: Go back to flow 2|
|       | 3: Care provider has no internet access
|       | 3.2: Refuse user to log in
|       | 3: Patient has no internet access
|       | 3.3: Prompt user that all off-line changes will be synchronized once online again

---------------------------------------------------------------------------------------------------------------------
### **UC-02** (US 03.01.01, US 03.01.02, US 03.01.03)  
|Use case name| Sign up new account |
| ------| :----|
| Actors  | New user |
| Goal |  User creates a new account   |
| Triggers | User wants to create an account  |
| Preconditions | The use id is unique and valid |
| Postconditions | New user ID created and saved by the APP |
|       | Take the user to their corresponding home page |
|Basic flow|  1. Enter new user ID |
|       | 2. Enter email |
|       | 3. Enter phone number |
|       | 4. Choose a role from patient and care provider |
|       | 5. Choose to sign up |
|Exception |  1: User ID not valid (too short or already taken) |
|       | 1.1: Shows warning message to user |
|       | 1.2: Go back to flow 1 |
---------------------------------------------------------------------------------------------------------------------
### **UC-03**
|Use case name| Log out |
| ---- | :--- |
| Actors | Patient |
|       | Care provider |
| Goal | Log user out |
| Triggers | User chose to sign out |
| Preconditions | User is signed in |
| Postconditions | User is logged out |
| Basic flow | 1.  User clicks sign out button
|       | 2. User is taken back to login page
| Exception |   |

---------------------------------------------------------------------------------------------------------------------
### **UC-04** (US 03.02.01)    
|Use case name| Edit profile |
| ---- | :---- |
|Actors | Patient |
|Goal| Make change to patient profile  |
|Triggers | User chose to edit profile |
|Preconditions | Patient is signed in |
| Postconditions | Profile is edited |
|Basic flow | 1. The patient reads the profile
|       | 2. Choose to edit contact information in profile
|       | 3. Confirm changes
|Exception|  |

---------------------------------------------------------------------------------------------------------------------
### **UC-05** (US 01.02.01)  
|Use case name| View problem list |
| ------ | :----- |
|Actors | Patient |
|Goal | Show list of problems with titles, dates, and number of records |
|Triggers | Patient chooses to view their problem list|
|Preconditions |    |
|Postconditions |    |
|Basic flow| 1. Patient choose the view problem list on the user profile page
|       | 2. List of all the problems they have added so far is displayed|
|Exception | 2: Patient has no problems to view|
|       | 2.1: The patient can add the first problem|
---------------------------------------------------------------------------------------------------------------------
### **UC-06** (US 01.01.01, US 01.01.02, US 01.01.03, US 11.03.01)  
|Use case name| Add problem
|--- |:----|
|Actors| Patient
|Goal| Add a new problem with title, date & time, and description
|Triggers| User chose to add a problem
|Preconditions|
|Postconditions | A new problem is added to the list of problems
|Basic flow | 1. Enter a problem title
|       | 2. Set date & time with pop-up calendar and clock
|       | 3. Write a description of the problem
|       | 4. Confirm changes
|       | 5. New problem added to the list of problems
|       | 6. Add at least two pictures 
|Exception| 1: Problem title too long (limit 30 chars)
|       | 1.1: Go back to flow 1, choose another title
|       | 3: Description too long (limit 300 chars)
|       | 3.1: Go back to flow 3, write description again
|       | 6: Less than 2 pictures or picture size too big
|       | 6.1: Ask the user to re-add

---------------------------------------------------------------------------------------------------------------------
### **UC-07** (US 01.01.02, US 01.01.03, US 01.03.01, US 11.03.01)  
Use case name| Edit problem
-----|:----
Actors | Patient
Goal | Make a change to an existing problem
Triggers | User chose to edit a problem
Preconditions | There is at least one problem in the list
Postconditions | Edited problem updated to the list of problems
Basic flow | 1. Edit title
|     | 2. Edit date & time
|     | 3. Edit description
|     | 4. Edit pictures
|     | 5. Confirm changes
|     | 6. Problem updated
Exception | 1: Problem title too long
|     | 1.1: Go back to flow 1, choose another title
|     | 3: Description too long
|     | 3.1: Go back to flow 3, write description again
|     | 4: Less than 2 pictures or picture size too big
|     | 4.1: Ask the user to re-add
---------------------------------------------------------------------------------------------------------------------
### **UC-08** (US 09.03.01)  
Use case name| Add photo to problem
-----|:----
Actors | Patient
Goal | Add a photo to problem
Triggers | User chose to add a photo to a problem
Preconditions | The camera is working
|     | Album is not empty
Postconditions | Photo is added
Basic flow | 1. Choose to add photo
|     | 2. Take a photo or choose a photo from album
|     | 3. Confirm photo adding
Exception | 1: Photo size exceeds 65536 bytes
|     |  1.1: Go to flow 1
--------------------------------------------------------------------------------------------------------------------
### **UC-09** (US 04.01.01, US 04.02.01, US 04.03.01)  
Use case name | Search problem
|----|:----|
Actors | Patient
|     | Care provider
Goal | Search a problem from the list of problems
Triggers | Search keyword(s) in the text input box at the top
Preconditions | There is at least one problem
Postconditions | Problems matching with keywords shown in the list (nothing shows up if no matching results)
Basic flow | 1. User taps on the search box
|     | 2. Enter keywords (can include geo-location/body-location keywords)
|     | 3. Press “enter” key on the virtual keyboard
|     | 4. Search results show up 
Exception|
--------------------------------------------------------------------------------------------------------------------
### **UC-10** (US 02.01.01)  
Use case name | View record list
|-----|:----|
Actors | Patient
|    | Care provider
Goal | View list of records of a problem
Triggers | User chose a problem to see its records
Preconditions | There is at least one problem
Postconditions| One specific record is shown
|     | A new record added
|     | Geo-locations for all records shown
|     | Details of one specific record shown
Basic flow | 1. User reads the list of records
|     | 2. User can make a decision
|     | 2.1. User can use slideshow mode
|     | 2.2. User can go to one record by clicking on record icon and can see its geo-location on a map
|     | 2.3. User can add a record by clicking add record button 
|     | 2.4. User can see geo-locations for all records by clicking the map button
|     | 2.5. User can see details of one record by clicking on the record icon
Exception |
--------------------------------------------------------------------------------------------------------------------
### **UC-11** (US 10.03.01)  
Use case name | View records on map
|-----|:----|
Actors | Patient
|     | Care provider
Goal | See a map of all records
Triggers | User chose to see the map
Preconditions |      |
Postconditions |     |
Basic flow | 1. User reads the map of all records
Exception |     |
--------------------------------------------------------------------------------------------------------------------
### **UC-12** (US 11.01.01)  
Use case name | Indicate body parts
|-----|:----|
Actors | Patient
Goal | Indicate body parts on photo
Triggers | User chose to indicate body parts
Preconditions | There is at least front and back body-location photos  |
Postconditions |  Body parts are indicated on photo   |
Basic flow | 1. User clicks the body-part on photo
Exception |     |
---------------------------------------------------------------------------------------------------------------------
### **UC-13** (US 02.10.01)  
Use case name | Use slideshow mode
|-----|:----|
Actors | Patient
Goal | Photo records can be browsed by clicking
Triggers | User chose to view photos in slideshow mode
Preconditions | There is at least one photo  |
Postconditions |    |
Basic flow | 1. User views photos in slideshow mode
Exception |  There is no photo
|     |  - Refuse to show in slideshow mode
---------------------------------------------------------------------------------------------------------------------

### **UC-14** (US 01.04.01)  
Use case name | Delete problem
|----|:---|
Actors | Patient
Goal | Delete a problem from the list of problems
Triggers | Delete problem option in problem list
Preconditions | At least one problem is in the list
Postconditions | The problem selected is deleted from the list
Basic flow | 1. Hold press a problem on the list
|     | 2. Click “delete problem” option in the pop-up menu
|     | 3. Problem deleted
Exception |
--------------------------------------------------------------------------------------------------------------------
### **UC-15** (US 01.05.01, US 02.02.01, US 02.08.01, US 11.02.01)  
Use case name | Add record 
----|:----
Actors | Patient
Goal | Add a detailed record to a problem
Triggers | Add record option in record viewing page
Preconditions | Current record is in the scope of a problem
Postconditions | A new record with a title, body location, picture, geo-location, date & time, and description is added to the record list
Basic flow | 1. Click add record button
|     | 2. Enter the title
|     | 3. Choose to add picture(s) that indicate a specific part on body location photo
|     | 4. Take a photo
|     | 5. Indicate body location number.
|     | 6. Add geo-location
|     | 7. Add date & time
|     | 8. Write a description
|     | 9. Confirm changes
Exception |
---------------------------------------------------------------------------------------------------------------------
### **UC-16** (US 02.06.01, US 09.01.02)  
Use case name| Add photo to record
-----|:----
Actors | Patient
Goal | Add photos to a record
Triggers | User chose to add photos to a record
Preconditions | The camera is working
|     | Album is not empty
Postconditions | Photos are added
Basic flow | 1. Choose to add photo
|     | 2. Take a photo or choose a photo from album
|     | 3. Repeat 2 until maximum number of photos is at least 10
|     | 3. Confirm photo adding
Exception | 2: Photo size exceeds 65536 bytes
|     | 2.1: Go to flow 1
|     | 3: Number of photos is more than 10
|     | 3.1: Go to flow 2
---------------------------------------------------------------------------------------------------------------------
### **UC-17** (US 02.03.01, US 10.01.01)  
Use case name| Specify geo-location of record
-----|:----
Actors | Patient
Goal | Specify geo-location for a record on a map
Triggers | User chose to specify geo-location
Preconditions | 
Postconditions | Geo-location added
Basic flow | 1. Choose to specify geo-location
|     | 2. Specify a geo-location on the map for a record
Exception | 
---------------------------------------------------------------------------------------------------------------------
### **UC-18** (US 01.01.02, US 02.05.01)  
Use case name| Add title to record
-----|:----
Actors | Patient
Goal | Add title to a record
Triggers | User chose to add title
Preconditions | There is at least one record
Postconditions | A title is added
Basic flow | 1. Choose to add a title
|     | 2. Enter a title 
|     | 3. Confirm changes
Exception | 2: Title too long
|     | 2.1: Go to flow 1
---------------------------------------------------------------------------------------------------------------------
### **UC-19** (US 01.01.03, US 02.05.01)  
Use case name| Add comment to record
-----|:----
Actors | Patient
Goal | Add a comment to a record
Triggers | User chose to add comment
Preconditions | There is at least one record
Postconditions | A comment is added
Basic flow | 1. Choose to add a comment
|     | 2. Enter a comment
Exception | 2: Comment exceeds 300 characters
|     | 2.1: Go to flow 1

--------------------------------------------------------------------------------------------------------------------
### **UC-20** (US 02.04.01)
Use case name| Add body-location to record
-----|:----
Actors | Patient
Goal | Add body-location to a record
Triggers | User chose to add a body-location
Preconditions | There is at least one record
Postconditions | A body-location is added
Basic flow | 1. Choose to add body-location
|     | 2. Select a body-location
|     | 3. Confirm change
Exception | 
---------------------------------------------------------------------------------------------------------------------
### **UC-21** 
Use case name | Edit record
---|:---
Actors | Patient
Goal | Make change(s) to an existing record
Triggers | Edit record option on the record icon in record viewing page
Preconditions | There is at least one record in the record list
Postconditions | Edited record with new information is updated
Basic flow | 1. Click on the edit record button
|     | 2. Edit title (user may leave it unchanged)
|     | 3. Edit picture/photo that indicates a specific part on body location photo
|     | 4. Edit geo-location (user may leave it unchanged)
|     | 5. Edit date & time (user may leave it unchanged)
|     | 6. Edit comment  (user may leave it unchanged)
|     | 7. Confirm changes
Exception | 
--------------------------------------------------------------------------------------------------------------------
### **UC-22** (US 01.01.02)  
Use case name| Edit comment for record
-----|:----
Actors | Patient
Goal | Edit a comment for a record
Triggers | User chose to edit comment
Preconditions | There is at least one record
Postconditions | A comment is edited
Basic flow | 1. Choose to edit a comment
|     | 2. Enter a new comment
Exception | 2: Comment exceeds 300 characters
|     | 2.1: Go to flow 1
---------------------------------------------------------------------------------------------------------------------
### **UC-23** (US 09.01.02, US 09.03.01)  
Use case name| Edit photo for record
-----|:----
Actors | Patient
Goal | Edit a photo to problem
Triggers | User chose to edit a photo to a problem
Preconditions | The camera is working
|     | Album is not empty
Postconditions | Photo is edited
Basic flow | 1. Choose to edit photo
|     | 2. Take a photo or choose a photo from the album
|     | 3. Replace old photo with the new one
|     | 3. Confirm photo editing
Exception | 2: Maximum number of photos exceeds 10
|     | 2.1: Refuse to edit photo
|     | 2: Photo size exceeds 65536 bytes
|     | 2.2: Go to flow 1

--------------------------------------------------------------------------------------------------------------------
### **UC-24** (US 04.01.01, US 04.02.01, US 04.03.01)  
Use case name | Search record
----|:----
Actors | Patient
Goal | Search a record from the list of record
Triggers | Enter keywords in the text input box at the top
Preconditions | There is at least one record
Postconditions | Records matching with keywords shown in the list
Basic flow | 1. User press on the search box
|     | 2. Enter keywords (can include geo-location/body-location keywords)
|     | 3. Confirm searching
|     | 4. Searching results show up (nothing shows up if no matching records)
Exception |
--------------------------------------------------------------------------------------------------------------------
### **UC-25** (US 09.02.01, US 10.02.01)  
Use case name | View one record
----|:----
Actors | Patient
Goal | See details of one record
Triggers | Clicking on a record in record viewing page
Preconditions | There is at least one record in the list of records
Postconditions | Add a photo and select corresponding body location
|     | Gallery of patient’s body location pictures
|     | Add comment dialog
|     | Add geo-location
Basic flow | 1. Add a comment by clicking add comment button
|     | 2. Add a picture
|     | 3. Select body location
|     | 4. See timestamp
|     | 5. Add geo-locations
|     | 6. See gallery of pictures (up to 10 pictures, each under 65536 kb in size)
|     | 7. Read care provider’ comment(s)
Exception | 2: Picture too big in size or more than 10 pictures in total
|     | 2.1: Refuse to add the picture
--------------------------------------------------------------------------------------------------------------------
### **UC-26** (US 11.04.01)  
Use case name | View body location for record
----|:----
Actors | Patient
Goal | View a body location on a body location picture for a record
Triggers | View body location option in a record page
Preconditions | There is at least one record
Postconditions | The clear indicator is shown on body-location picture
Basic flow | 1. User chooses to view body location on a picture
Exception |
--------------------------------------------------------------------------------------------------------------------
### **UC-27**  (US 06.01.01)
Use case name | View List of Patients
----|:----
Actors | Care provider
Goal | The care provider can view the list of patients that he is assigned to
Triggers | Care provider is logged in
Preconditions | Internet access
Postconditions | If the add button is clicked, take the care provider to add patient page
Basic flow | 1. The care provider logs in 
|    | 2. The care provider sees the list of patients
Exception | No internet access
|      | - Refuse to log the user in
---------------------------------------------------------------------------------------------------------------------
### **UC-28**  (US 07.01.01)
Use case name | Add patient 
----|:----
Actors | Care provider
Goal | Care provider can add a new patient to his list of assigned patient
Triggers | Add patient option on the list of patient
Preconditions | The user is logged in and role is care provider
Postconditions | A new patient is added
Basic flow | 1. The care provider clicks on the add button in view patient
|    | 2. The care provider enters the patient’s information
|    | 3. Confirm adding
Exception | 1. The minimum user id should be at least 8 characters
|    | 1.1: Go to flow 2
---------------------------------------------------------------------------------------------------------------------
### **UC-29**  (US 03.03.01, US 07.01.02)
Use case name | Browse patient problems 
----|:----
Actors | Care provider
Goal | Browse the problems of a patient
Triggers | The care provider selects a target patient
Preconditions | There is at least one patient assigned to the care provider
Postconditions | Display the target patient's problems if there are any
Basic flow | 1. Care provider selects a patient from their list of assigned patients 
|    | 2. Patient’s profile (contact info) shown
|    | 3. Choose to view problems
|    | 4. A list of the problems that the patient has shown
|Exception | 4. The patient does not have any problems to display
|    | 4.1 The care provider can go back to the patient's contact info page. 
---------------------------------------------------------------------------------------------------------------------
### **UC-30**  (US 02.07.01, US 07.01.03)
Use case name | Add comment records to patient problems  
----|:----
Actors | Care provider
Goal | Add comment records to a problem of a patient
Triggers | Add comment records option
Preconditions | There  is at least one problem
|     | The care provider finds the specific problem he wants to comment on
Postconditions | The patient has new comment records updated
Basic flow | 1. The care provider chooses a specific problem to be commented
|    | 2. All the records of the problem shown in a list 
|    | 3. The care provider type his comment and submit the comment
|    | 4. The system updates the comment
Exception | 
---------------------------------------------------------------------------------------------------------------------
### "Wow" Factor
A nice UI for the paper-cut-out-doll view in selecting body parts for the records, with numbered body map for precise body location for records.
