//Submitted by: Xian Benedict G. Yee BsCompE2 EP1
import java.util.Scanner;
public class romannumerals
{
    public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Please enter a number: ");
    float num = myObj.nextFloat();
    System.out.println("Displaying result... ");
    if (num == 1) {System.out.println("I");}
    else if (num == 5) {System.out.println("V");}
    else if (num == 10) {System.out.println("X");}
    else if (num == 50) {System.out.println("L");}
    else if (num == 100) {System.out.println("C");}
    else if (num == 500) {System.out.println("D");}
    else if (num == 1000) {System.out.println("M");}
    else {System.out.println("Error!");}
    }
}
