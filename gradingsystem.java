import java.util.Scanner;

public class gradingsystem {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        //exam score which is out of 25
        System.out.println("Enter your exam score: ");
        int exam = input.nextInt();

        //midsem score which is out of 15
        System.out.println("Enter your midsem score: ");
        int midsem = input.nextInt();

        //check if students have paid fees
        System.out.println("Have you paid your fees in full? (y/n): ");
        String feesPaid = input.next();

        //calculations
        int totalScore = exam + midsem;
        boolean MetRequirements = exam >= 25 && midsem >=15;
        boolean feesFullyPaid = feesPaid.equalsIgnoreCase("y");

        if (MetRequirements && feesFullyPaid){
            System.out.println("Congratulations!!. You have passed the course!.");
            System.out.println("Your total score is: " + totalScore);
            System.out.println("You will receive a certificate of completion.");
        } else {
            System.out.println("Sorry, you failed the course.");
            System.out.println("Your total score is: " + totalScore);
            System.out.println("You will not be receiving a certificate of completion.");

        }





    }
}