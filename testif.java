//Submitted by: Xian Benedict G. Yee BsCompE2 EP1
import java.io.*;
public class testif
{
    public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter a Grade ");
    Float grade = Float.parseFloat(br.readLine());
    System.out.println("Evaluating... ");
    if (grade >= 75) {System.out.println("PASS");}
    else {System.out.println("FAIL");}
    }
}
