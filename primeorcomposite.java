//Submitted by: Xian Benedict G. Yee BsCompE2 EP1
import javax.swing.JOptionPane;
public class primeorcomposite
{
    public static void main(String[] args) {
    int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter your number: "));
    if (num == 1){System.out.println(num + " is not a prime or a consonant.");}
    else if (num == 2) {System.out.println(num + " is a prime number");}
    else if (num == 3) {System.out.println(num + " is a prime number");}
    else if (num > 2 && (num % 6 == 1 || num % 6 == 5)){System.out.println(num + " is a prime number."); }
    else {System.out.println(num + " is a composite number");}
    }
}
