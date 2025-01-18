//Submitted by: Xian Benedict G. Yee BsCompE2 EP1
import java.util.Scanner;
public class switchquestion
{
    public static void main(String[] args) {
    System.out.println("Java keywords used to prevent Switch statement to execute the succeeding block of codes?");
    System.out.println("A. Break");
    System.out.println("B. Case");
    System.out.println("C. Switch");
    System.out.println("D. Default");
    Scanner myObj = new Scanner(System.in);
    System.out.println("Please enter your answer: ");
    char answer = myObj.next().charAt(0);
    switch(answer){
    case 'a':
    System.out.println("Correct!");
    break;
    case 'b':
    System.out.println("Incorrect");
    break;
    case 'c':
    System.out.println("Incorrect");
    break;
    case 'd':
    System.out.println("Incorrect");
    break;
    default:
    System.out.println("Error!");
    }
    }
}
