/* Name: Liza Carondoy
   Date: May 16, 2024
   Activity #3 (FINALS) */
   
public class JobApplicantCarondoy {
    private String name;
    private String phoneNumber;
    private boolean skilledInWordProcessing;
    private boolean skilledInSpreadsheets;
    private boolean skilledInDatabases;
    private boolean skilledInGraphics;
    private DateOfBirth dateOfBirth; // Adding the DateOfBirth field to the class

    // Inner class DateOfBirth
    private class DateOfBirth {
        private String month; 
        private int day; 
        private int year; 

        // Constructor for DateOfBirth class
        public DateOfBirth(String month, int day, int year) {
            this.month = month;
            this.day = day;
            this.year = year;
        }
    }

    // Constructor of JobApplicantCarondoy including DateOfBirth parameters
    public JobApplicantCarondoy(String name, String phoneNumber, boolean skilledInWordProcessing,
                                boolean skilledInSpreadsheets, boolean skilledInDatabases, boolean skilledInGraphics,
                                String month, int day, int year) {
        this.name = name; 
        this.phoneNumber = phoneNumber; 
        this.skilledInWordProcessing = skilledInWordProcessing; 
        this.skilledInSpreadsheets = skilledInSpreadsheets; 
        this.skilledInDatabases = skilledInDatabases; 
        this.skilledInGraphics = skilledInGraphics; 
        this.dateOfBirth = new DateOfBirth(month, day, year); // Initialize date of birth using the inner class
    }

    // Overloaded constructor without DateOfBirth
    public JobApplicantCarondoy(String name, String phoneNumber, boolean skilledInWordProcessing,
                                boolean skilledInSpreadsheets, boolean skilledInDatabases, boolean skilledInGraphics) {
        this.name = name; 
        this.phoneNumber = phoneNumber; 
        this.skilledInWordProcessing = skilledInWordProcessing; 
        this.skilledInSpreadsheets = skilledInSpreadsheets; 
        this.skilledInDatabases = skilledInDatabases; 
        this.skilledInGraphics = skilledInGraphics; 
        this.dateOfBirth = dateOfBirth; // Set date of birth
    }


    public String getName() {
        return name; 
    }

    public String getPhoneNumber() {
        return phoneNumber; 
    }

    public boolean skilledInWordProcessing() {
        return skilledInWordProcessing; 
    }

    public boolean skilledInSpreadsheets() {
        return skilledInSpreadsheets;
    }

    public boolean skilledInDatabases() {
        return skilledInDatabases; 
    }

    public boolean skilledInGraphics() {
        return skilledInGraphics; 
    }

    // Getter for DateOfBirth
    public DateOfBirth getDateOfBirth() {
        return dateOfBirth; // Return the date of birth
    }
}