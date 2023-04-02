        //finding the sum of even numers between 0-20 from user inputs

import java.util.Scanner;

public class evenintegers {
    private static Scanner sc;
    public static void main(String args[]) {
        int num, i, evensum =0;
        sc =new Scanner(System.in);

        System.out.print("please enter any number between 0-20: ");
        num = sc.nextInt();

        for (i=1; i<=num; i++)
        {
            if (i % 2 == 0) {
                evensum = evensum + i;
            }
        }
        
        System.out.println("The sum of the numbers upto " +num+ " = " +evensum);

        if (num>20) {
            System.out.println("Input numbers between 0-20");
        }
    }
}
