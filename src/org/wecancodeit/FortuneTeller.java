import java.util.Scanner;

public class FortuneTeller {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("What is your first and last name?");
        String userFirstName = myScanner.next();
        String userLastName = myScanner.next();


        // get age and verify
        // using a while loop nested in a do-while loop
        int userAge = 0;

        do {

            System.out.println("How old are you?");
            while (!myScanner.hasNextInt()) {
                System.out.println("That's not a number, please enter your age:");
                myScanner.next();
            }
            userAge = myScanner.nextInt();

        } while (userAge <= 0);



        // get birth month and verify
        // using a while try-catch loop
        int userBirthMonth = 0;

        while(userBirthMonth <= 1){
            try {
                System.out.println("What month were you born? (1-12)");
                userBirthMonth = myScanner.nextInt();

            } catch (Exception ex) {
                System.out.println("Numbers only. Please use 1 for January, 2 for February, etc");
                myScanner.next();
                userBirthMonth = myScanner.nextInt();
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

    }
}
