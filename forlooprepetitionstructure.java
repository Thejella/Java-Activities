//Submitted by: Xian Benedict G. Yee BsCompE2 EP1
import java.io.*;
public class forlooprepetitionstructure
{
    public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Please enter an Integer: ");
    int num = Integer.parseInt(br.readLine());
    int i;
    for( i = 1; i < 11; i++ ){
    System.out.print(num + " x " + i + " = " + (i * num) + "\n");
    }
    }
}
