//Submitted by: Xian Benedict G. Yee BsCompE2 EP1
import javax.swing.JOptionPane;
public class numberinwords
{
    public static void main(String[] args) {
    int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter your number: "));
    if (num == 1) {JOptionPane.showMessageDialog(null, "one");}
    else if (num == 2) {JOptionPane.showMessageDialog(null, "two");}
    else if (num == 3) {JOptionPane.showMessageDialog(null, "three");}
    else if (num == 4) {JOptionPane.showMessageDialog(null, "four");}
    else if (num == 5) {JOptionPane.showMessageDialog(null, "five");}
    else if (num == 6) {JOptionPane.showMessageDialog(null, "six");}
    else if (num == 7) {JOptionPane.showMessageDialog(null, "seven");}
    else if (num == 8) {JOptionPane.showMessageDialog(null, "eight");}
    else if (num == 9) {JOptionPane.showMessageDialog(null, "nine");}
    else if (num == 10) {JOptionPane.showMessageDialog(null, "ten");}
    else {JOptionPane.showMessageDialog(null, "Error!");}
    }
}
