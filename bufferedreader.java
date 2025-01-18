//Submitted By: Xian Benedict G. Yee BSCompE2 EP1 
import java.io.*;
public class bufferedreader
{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a letter: ");
        char Letter = (char)br.read();
        System.out.println("\nPrinting character...");
        System.out.println(Letter);
        System.out.println("Evaluating...");
        if (Letter != 'a' && Letter != 'e' && Letter != 'i' && Letter != 'o' && Letter != 'u') {
        System.out.println("Result: Consonant");}
        else {System.out.println("Result: Vowel");}
    }
}
