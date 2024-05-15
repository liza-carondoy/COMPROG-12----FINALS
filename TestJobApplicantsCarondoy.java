import java.util.Scanner;

public class TestJobApplicantsCarondoy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println('\n' + "Applicant :" + '\n');
        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Phone number: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Skilled in word processing: ");
        boolean skilledInWordProcessing = scanner.nextBoolean();

        System.out.print("Skilled in spreadsheets: ");
        boolean skilledInSpreadsheets = scanner.nextBoolean();

        System.out.print("Skilled in databases: ");
        boolean skilledInDatabases = scanner.nextBoolean();

        System.out.print("Skilled in graphics: ");
        boolean skilledInGraphics = scanner.nextBoolean();
        scanner.nextLine();  
        
        System.out.print("Month of birth: ");
        String month = scanner.nextLine();

        System.out.print("Date of birth: ");
        int date = scanner.nextInt();

        System.out.print("Year of birth: ");
        int year = scanner.nextInt();
        scanner.nextLine(); 

        JobApplicantCarondoy applicant = new JobApplicantCarondoy(name, phoneNumber, skilledInWordProcessing,
                skilledInSpreadsheets, skilledInDatabases, skilledInGraphics, month, date, year);

        if (isQualified(applicant)) { // Use applicant1 here
            System.out.println(applicant.getName() + " is qualified for an interview.");
        } else {
            System.out.println(applicant.getName() + " is not qualified for an interview.");
        }
    }

    public static boolean isQualified(JobApplicantCarondoy applicant) {
        int threeSkills = 0;
        if (applicant.skilledInWordProcessing()) {
            threeSkills++;
        }
        if (applicant.skilledInSpreadsheets()) {
            threeSkills++;
        }
        if (applicant.skilledInDatabases()) {
            threeSkills++;
        }
        if (applicant.skilledInGraphics()) {
            threeSkills++;
        }
        return threeSkills >= 3;
    }
}
