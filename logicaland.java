//Submitted by: Xian Benedict G. Yee BsCompE2 EP1
public class logicaland
{
    public static void main(String[] args) {
    int i = 0;
    int j = 10;
    boolean test = false;
    System.out.println("Printing variables...\b");
    System.out.println("i = 0\b");
    System.out.println("j = 10\b");
    System.out.println("test = false\n");
    System.out.println("Demonstrating &&");
    System.out.println(i);
    System.out.println(j);
    System.out.println((test = j > i && i == j) + "\n");
    System.out.println("Demonstrating &");
    System.out.println(i);
    System.out.println(++j);
    System.out.println(test = j > i & i == j);
    }
}
