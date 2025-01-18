//Submitted by: Xian Benedict G. Yee BsCompE2 EP1
import java.io.*;
public class numbers
{
    public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter your first number: ");
    int first = Integer.parseInt(br.readLine());
    System.out.println("Enter your second number: ");
    int second = Integer.parseInt(br.readLine());
    int product = first * second;
    int sum = first + second;
    int difference = first - second;
    int quotient = first / second;
    System.out.println("\nProcessing Result: ");
    System.out.println("Sum = " + sum);
    System.out.println("Difference = " + difference);
    System.out.println("Product = " + product);
    System.out.println("Quotient = " + quotient);
    }
}
