import java.util.Scanner;
public class lab2
{
    public static void main(String[] args) 
    {
        // TODO Auto-generated method stub
        System.out.println( "We are going to create a menu");
        System.out.println( "Practice data entry validation");
        System.out.println( "Practice Concatenation");
        Scanner keyboard = new Scanner(System.in);
        int num,low,high;
        // example validation //= CheckInput.getInt();
        // Display the menu and get the menu option
        System.out.println("Lab2\t Please select from the following");
        System.out.println("1. Get an integer value");
        System.out.println("2. Get integer in a range");
        System.out.println("3. Get a real value");
        System.out.println("4. Get a positive integer");
        System.out.println("5. Get String");
        // Invalid menu option
        
        do{
            System.out.print("\n\nPlease select 1-5: ");
            num = CheckInput.getInt();
        }while( num < 1 || num > 5);

        if (num == 1){
            System.out.print("\n\n1. Get an integer value: ");
            num = CheckInput.getInt();
            System.out.print("Your number is:"+num);
        }
        
        if (num == 2){
            /*
            System.out.print("\n\n2. Get integer in a range: ");
            CheckInput.getIntRange(low,high);
            System.out.print("Your number is:"+num);
        */}
        
        if (num == 3){
            //code here
        }

        if (num == 4){
            //code here
        }

        if (num == 5){
            //code here
        }



        
        System.out.println("\nInvalid entry. try again");
        System.out.println("Again? yes, or no only ");
        //When done
        System.out.println("Good Bye!"); 
    }//main
}//class