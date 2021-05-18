import java.util.Scanner;
import java.text.NumberFormat;


public class FortuneTeller {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("What is your first and last name?");
        String firstName = myScanner.next();
        String lastName = myScanner.next();


        // get age and verify
        // using a while loop nested in a do-while loop
        int userAge = 0;

        do {

            System.out.println("How old are you?");
            while (!myScanner.hasNextInt()) {
                System.out.println("That's not an integer, please enter your age:");
                myScanner.nextLine();
            }
            userAge = myScanner.nextInt();

        } while (userAge <= 0);



        // get birth month and verify
        // using a while try-catch loop
        int birthMonth = 0;

        while(birthMonth <= 0){
            try {
                System.out.println("What month were you born? (1-12)");
                birthMonth = myScanner.nextInt();

            } catch (Exception ex) {
                System.out.println("Numbers only. Please use 1 for January, 2 for February, etc");
                myScanner.nextInt();
                birthMonth = myScanner.nextInt();
            }
        }


        System.out.println("What is your favorite ROYGBIV color?");
        String userFavoriteColor = myScanner.next();

        if (userFavoriteColor.equals("help")) {
            System.out.println("Please choose: Red, Orange, Yellow, Green, Blue, Indigo or Violet");
            userFavoriteColor = myScanner.next();
        }

        System.out.println("How many siblings do you have?");
        int userSiblings = myScanner.nextInt();


        String retireTime;
        if ( userAge % 2 == 0 ) {
            retireTime = "14 seconds";
        }   else {
            retireTime = "27 years";
        }

        String vacationHome;
        if (userSiblings == 1) {
             vacationHome = "Tokyo";
        } else if (userSiblings == 2) {
             vacationHome = "Arizona";
        } else if (userSiblings == 3) {
              vacationHome = "Columbus";
        } else if (userSiblings > 3) {
             vacationHome = "Las Vegas";
        } else {
             vacationHome = "Michigan";
        }

        String transportationMode;
        switch (userFavoriteColor) {
            case "Red":
                transportationMode = "sports car";
                break;
            case "Orange":
                transportationMode = "roller blades";
                break;
            case "Yellow":
                transportationMode = "motorcycle";
                break;
            case "Green":
                transportationMode = "scooter";
                break;
            case "Blue":
                transportationMode = "private jet";
                break;
            case "Indigo":
                transportationMode = "hot air balloon";
                break;
            case "Violet":
                transportationMode = "unicorn";
                break;
            default:
                transportationMode = "their feet";
        }

        float bankBalance = 0;
        if (birthMonth < 5) { // 1 - 4
            bankBalance = 944102.93F;
        } else if (birthMonth > 4 && birthMonth < 9) { // 5 - 8
            bankBalance = 4944102.26F;
        } else if (birthMonth > 9 && birthMonth < 13){ // 9 - 12
            bankBalance = 184.73F;
        } else {
            bankBalance = 0.17F;
        }

        System.out.println(firstName + " " + lastName + " will retire in " + retireTime +
                " with $" + bankBalance + " in the bank, a vacation home in " +
                vacationHome + ", and will travel by " + transportationMode + "!"
        );

    }
}
