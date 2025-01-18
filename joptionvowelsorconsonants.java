//Submitted by: Xian Benedict G. Yee BsCompE2 EP1
import javax.swing.JOptionPane;
public class joptionvowelsorconsonants
{
    public static void main(String[] args) {
    String Letter1 = JOptionPane.showInputDialog(null, "Please enter your Letter:");
    char Letter = Letter1.toLowerCase().charAt(0);
    switch (Letter){
    case 'a': JOptionPane.showMessageDialog(null, "Result: Vowel"); break;
    case 'e': JOptionPane.showMessageDialog(null, "Result: Vowel"); break;
    case 'i': JOptionPane.showMessageDialog(null, "Result: Vowel"); break;
    case 'o': JOptionPane.showMessageDialog(null, "Result: Vowel"); break;
    case 'u': JOptionPane.showMessageDialog(null, "Result: Vowel"); break;
    default: JOptionPane.showMessageDialog(null, "Result: Consonant"); break;
    }
}
}
