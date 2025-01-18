//Submitted by: Xian Benedict G. Yee BsCompE2 EP1
import java.util.Scanner;
public class numberofdigits
{
    public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Please enter a number: ");
    float num = myObj.nextFloat();
    int count = String.valueOf(num).length();
    System.out.println("Evaluating... ");
    if (count-2 == 1) {System.out.println("1 Digits");}
    else if (count-2 == 2) {System.out.println("2 Digits");}
    else if (count-2 == 3) {System.out.println("3 Digits");}
    else if (count-2 == 4) {System.out.println("4 Digits");}
    else if (count-2 == 5) {System.out.println("5 Digits");}
    else if (count-2 == 6) {System.out.println("6 Digits");}
    else if (count-2 == 7) {System.out.println("7 Digits");}
    else {System.out.println("Error!");}
    }
}
