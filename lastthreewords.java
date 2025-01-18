//Submitted by: Xian Benedict G. Yee BsCompE2 EP1
import java.io.*;
public class lastthreewords
{
    public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter your first word: ");
    String first = br.readLine();
    System.out.println("Enter your second word: ");
    String second = br.readLine();
    System.out.println("Enter your third word: ");
    String third = br.readLine();
    System.out.println("\nPrinting your last three words!");
    System.out.println(first + " " + second + " " + third + " ");
    }
}
