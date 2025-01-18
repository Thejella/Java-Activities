//Submitted by: Xian Benedict G. Yee BsCompE2 EP1
import java.util.Scanner;
public class switchromannumerals
{
    public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Please enter a number: ");
    int num = myObj.nextInt();
    System.out.println("Displaying result... ");
    switch (num){
    case 1: {System.out.println("I");} break;
    case 10: {System.out.println("X");} break;
    case 50: {System.out.println("L");} break;
    case 100: {System.out.println("C");} break;
    case 500: {System.out.println("D");} break;
    case 1000: {System.out.println("M");} break; 
    default: {System.out.println("Error!");} break;
    }
    }
}



