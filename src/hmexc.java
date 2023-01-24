
import java.util.Scanner;
public class hmexc {
    public static void main(String[] args){
        
    int ans = (int)(Math.random() * 99);
    
    Scanner input = new Scanner(System.in);
    System.out.print("Input guess: ");
    int guess = input.nextInt();
    
    System.out.println("The lottery number is " + ans);
    
    if (guess == ans)
    System.out.println("Win $10,000");
    //compare digits 66 / 10=6 
    else if ((guess / 10 == ans % 10) && (ans / 10 == guess % 10)) 
        System.out.println("Win $3,000");
    else if ((guess / 10 == ans % 10) || (ans / 10 == guess % 10) || (guess / 10 == ans / 10) || (guess % 10 == ans % 10))
        System.out.println("Win $1,000");
    else 
        System.out.println("Try again");
    
    }
    
}