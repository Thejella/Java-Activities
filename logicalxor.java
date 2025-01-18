//Submitted by: Xian Benedict G. Yee BsCompE2 EP1
public class logicalxor
{
    public static void main(String[] args) {
    boolean val1 = true;
    boolean val2 = true;
    boolean test;
    System.out.println("Displaying the TRURTH TABLE for XOR");
    System.out.println("x1   x2   RESULT");
    System.out.println("TRUE TRUE " + (test = val1 || val2));
    System.out.println("TRUE FALSE " + (test = val1 || !val2));
    System.out.println("FALSE TRUE " + (test = !val1 || val2));
    System.out.println("FALSE FALSE " + (test = !val1 || !val2));
    }
}
