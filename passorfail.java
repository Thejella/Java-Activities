//Submitted by: Xian Benedict G. Yee BsCompE2 EP1
import java.util.Scanner;
public class passorfail
{
    public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter Grade: ");
    float grade = myObj.nextFloat();
    System.out.println("Grade: " + grade);
    String status = (grade >= 75)? "Passed" : "Fail";
    System.out.println("Status = " + status);
    }
}
