import java.util.Scanner;

public class gradingsystem {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        //exam score which is 25 or more
        System.out.println("Enter your exam score: ");
        int exam = input.nextInt();

        //midsem score which is 15 or more
        System.out.println("Enter your midsem score: ");
        int midsem = input.nextInt();

        //check if students have paid fees where fee is 100
        System.out.println("Have you paid your fees in full? (y/n): ");
        String feesPaid = input.next();

        //calculations
        int totalScore = exam + midsem;
        boolean MetRequirements = exam >= 25 && midsem >=15;
        boolean feesFullyPaid = feesPaid.equalsIgnoreCase("y");
        boolean condoned = exam ==25 && midsem == 14 || exam ==24 && midsem == 15;



        if (MetRequirements && feesFullyPaid){
            System.out.println("Congratulations!!. You have passed the course!.");
            System.out.println("Your total score is: " + totalScore);
            System.out.println("You will receive a certificate of completion.");
        } 
        if (condoned) {
            System.out.println("Condoned");
            System.out.println("You will receive a certificate of completion.");
        }
        else {
            System.out.println("Sorry, you failed the course.");
            System.out.println("Your total score is: " + totalScore);
            System.out.println("You will not be receiving a certificate of completion.");
        } 


        //knust grading system
        if (totalScore >= 70){
            System.out.println("You had an A");
        } else if (totalScore <=69 && totalScore >= 60) {
            System.out.println("You had a B");
        }else if (totalScore <= 59 && totalScore >= 50 ) {
            System.out.println("You had a C");
        }else if (totalScore <= 49 && totalScore >= 40) {
            System.out.println("You had a D");
        }else if (totalScore <= 39 && totalScore >= 0) {
            System.out.println("You had an E");
        }

    }
}