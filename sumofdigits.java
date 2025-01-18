//Submitted by: Xian Benedict G. Yee BsCompE2 EP1
import java.util.Scanner;
public class sumofdigits
{
    public static void main(String[] args) {
    int sum = 0;
    Scanner myObj = new Scanner(System.in);
    System.out.println("Please enter a number: ");
    int num = myObj.nextInt();
    System.out.println("Evaluating...");
    int numDigits = String.valueOf(num).length();
    String string_number = Integer.toString(num);
    if (numDigits == 3){
    System.out.println(string_number.charAt(0));
    System.out.println(string_number.charAt(1));
    System.out.println(string_number.charAt(2));
    System.out.println("Computing for the sum of the digits");
    for (int i = 0; i<numDigits; i++)
    sum += string_number.charAt(i) - '0';
    System.out.println(sum);
    }
    else if (numDigits == 2){
    System.out.println(string_number.charAt(0));
    System.out.println(string_number.charAt(1));
    System.out.println("Computing for the sum of the digits");
    for (int i = 0; i<numDigits; i++)
    sum += string_number.charAt(i) - '0';
    System.out.println(sum);
    }
    else if (numDigits == 1){
    System.out.println(string_number.charAt(0));
    System.out.println("Computing for the sum of the digits");
    System.out.println(string_number.charAt(0));
    }
    else {
    System.out.println("Error! A maximum of 3 digits only.");    
    }
    }
}
