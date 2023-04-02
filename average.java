public class average {
    public static void main(String[] args) {

        //finding the sum of the numbers
    int [] a = {3, 5, 1, 2, 4};
        int total = 0;
            int i;
        for (i = 0; i < 5; i++)
            {
                total = total + a[i];
                
            }
            //total of the sum
            System.out.println("the total of the sum is "+ total);

            //finding the average of the sum
            float average = total / a.length;
            System.out.println("the average of the sum is "+ average);
        }
    }