//Submitted by: Xian Benedict G. Yee BsCompE2 EP1
import java.util.Scanner;
public class switcharithmetic
{
    public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Please enter 1st number: ");
    int num1 = myObj.nextInt();
    System.out.println("Please enter 2nd number: ");
    int num2 = myObj.nextInt();
    System.out.println("Please enter Operator: ");
    char op = myObj.next().charAt(0);
    switch(op)
    {
        case '+':
            System.out.println("sum = " + (num1 + num2));
            break;
        case '-':
            System.out.println("difference = " + (num1 - num2));
            break;
        case '*':
            System.out.println("product = " + (num1 * num2));
            break;
        case '/':
            System.out.println("quotient= " + (num1 / num2));
            break;
        default:
            System.out.println("Error!");
            break;
    }
    
    }
}
