import java.util.Scanner;

public class SimpleCal {
    public static void main(String[] args) {
         int operator , n1 ,n2;
         System.out.println(" 1 - Add \n 2 - Sub \n 3 - Multiply \n 4 - divide ");
         System.out.println(" Choose the operators : ");
         Scanner sc = new Scanner(System.in);
         operator =sc.nextInt();
         System.out.println(" enter the firt number  :  " );
         n1=sc.nextInt();
         System.out.println(" Enter the second number : " );
         n2=sc.nextInt();

         int result = 0;

         switch (operator) {
            case 1: 
            result = n1 + n2;
            break;
            
            case 2:
            result= n1 - n2;
            break;

            case 3:
            result = n1 * n2;
            break;
           
            case 4:
            result = n1 / n2 ;
             break;
         
            default:
            System.out.println(" plse choose the valid operator ");
                break;
         }
         System.out.println(result + " is ");
sc.close();

    }
}
