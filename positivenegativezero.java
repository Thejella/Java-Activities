//Submitted by: Xian Benedict G. Yee BsCompE2 EP1
import java.util.Scanner;
public class positivenegativezero
{
    public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Please enter a number ");
    float num = myObj.nextFloat();
    System.out.println("Evaluating... ");
    if (num > 0) {System.out.println("Positive");}
    else if (num < 0) {System.out.println("Negative");}
    else if (num == 0) {System.out.println("Zero");}
    else {System.out.println("Error!");}
    }
}
