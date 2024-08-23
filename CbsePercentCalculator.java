import java.util.Scanner;
public class CbsePercentCalculator {
    public static void main(String[] args) {
        System.out.println("Making percentage calculator of CBSE board");
        Scanner sc=new Scanner(System.in);
        System.out.println("Marks obtain in maths: ");
        int maths= sc.nextInt();
        System.out.println("Marks obtain in physics:");
        int physics=sc.nextInt();
        System.out.println("Marks obtain in chemistry:");
        int chemistry=sc.nextInt();
        System.out.println("Marks obtain in hindi: ");
        int hindi=sc.nextInt();
        System.out.println("marks obtain in english: ");
        int english=sc.nextInt();
        // ok now we add all 5 subject total obtain marks but first we declare a varible for sum of all 5 subject

        sc.close();
        // int sum;   // variable declaration
        
         // now add total marks 
        System.out.println("sum of all obtain marks "); 
        int total=  maths +  physics + chemistry + hindi +  english;
        System.out.println("the total is : "+ total);
        // solving percentage querrry.....
        System.out.println("obtained perecntage");
        int percent = (int) (total / 500.0f * 100); 
        System.out.println("the percentage is : "+ percent);


        // END OF CBSE BOARD PERCNETAGE CALCULATOR......

        




    }

    
}
