public class grades {
    public static void main(String[]args){
        {
            int y=0;
            int x =1;
            int total = 0;
            while(x<=10)

            {
                ////
                y = x*x;
                System.out.println("value of y is,"+ (y+=2));         //same as y = y + 2
                total += y;                                      //same as total = total + y
                ++x;
                ///
            }
                ///
                System.out.println("\n" + "total is," + (total*=2)); //same as total = total * 2
                y=y*x;
                System.out.println("\n" + "final value of y is, " +y);
        }


        }
    }

