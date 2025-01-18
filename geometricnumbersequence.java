//Submitted by: Xian Benedict G. Yee BsCompE2 EP1
import javax.swing.JOptionPane;
public class geometricnumbersequence {
    public static void main(String[] args) {
    int fti = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter first term: "));
    int cri = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter common ratio: "));

        System.out.println("Printing Geometric Sequence...");

        int term = fti;
        for (int i = 0; i < 10; i++) {
            System.out.print(term + " ");
            term *= cri;
        }
        System.out.println();
    }
}
