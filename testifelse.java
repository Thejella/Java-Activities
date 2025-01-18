//Submitted by: Xian Benedict G. Yee BsCompE2 EP1
import java.util.Scanner;
public class testifelse
{
    public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter Grade: ");
    float grade = myObj.nextFloat();
    System.out.println("Evaluating... ");
    if (grade >= 75) {System.out.println("PASS");}
    else {System.out.println("FAIL");}
    }
}
