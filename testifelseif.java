//Submitted by: Xian Benedict G. Yee BsCompE2 EP1
import java.util.Scanner;
public class testifelseif
{
    public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter Grade: ");
    float grade = myObj.nextFloat();
    if (grade <= 70) {System.out.println("Failed");}
    else if (grade <= 80) {System.out.println("Satisfactory");}
    else if (grade <= 90) {System.out.println("Superior");}
    else {System.out.println("Excellent");}
    }
}
