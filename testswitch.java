//Submitted by: Xian Benedict G. Yee BsCompE2 EP1
import java.util.Scanner;
public class testswitch
{
    public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Please enter the Department code");
    float code = myObj.nextFloat();
    System.out.println("School Department: ");
    if (code == 100) {System.out.println("Business Administration");}
    else if (code == 101) {System.out.println("Accountancy");}
    else if (code == 102) {System.out.println("Marine Engineering");}
    else if (code == 103) {System.out.println("Civil Engineering");}
    else if (code == 104) {System.out.println("Senior High School");}
    else {System.out.println("Error!");}
    }
}
