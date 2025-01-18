//Submitted by: Xian Benedict G. Yee BsCompE2 EP1
public class arithmeticnumbersequence
	{
    public static void main(String[] args) {
        int ft = 4;
        int cd = 3;
        int tc = 10;
        int term = ft;

        System.out.println("Printing Arithmetic Number Sequence: ");
        int i = 0;
        while (i < tc) {
            System.out.println(term);
            term += cd;
            i++;
        }
    }
}
