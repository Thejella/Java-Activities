//Submitted by: Xian Benedict G. Yee BSCompE2 EP1
import javax.swing.JOptionPane;
public class joption
{
    public static void main(String[] args) {
    String name = JOptionPane.showInputDialog(null, "Please enter your name:");
    JOptionPane.showMessageDialog(null, "Hello " + name + "!");
    }
}
