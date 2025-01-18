//Submitted by: Xian Benedict G. Yee BsCompE2 EP1
import java.util.Scanner;
public class lowestvalue
{
    public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Please enter 1st number: ");
    float num1 = myObj.nextFloat();
    System.out.println("Please enter 2nd number: ");
    float num2 = myObj.nextFloat();
    System.out.println("Please enter 3rd number: ");
    float num3 = myObj.nextFloat();
    if (num1 < num2 && num1 < num3) { System.out.println(num1 + " is the least value!"); }
    if (num2 < num3 && num2 < num1) { System.out.println(num2 + " is the least value!"); }
    if (num3 < num1 && num3 < num2) { System.out.println(num3 + " is the least value!"); }
    }
}
