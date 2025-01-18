//Submitted by: Xian Benedict G. Yee BsCompE2 EP1
public class logicalor
{
    public static void main(String[] args) {
    int i=0;
    int j=10;
    boolean test;
    System.out.println("Demonstrating ||...");
    System.out.println(i);
    System.out.println(j);
    System.out.println((test = i < j || i == j) + "\n");
    System.out.println("Demonstrating |...");
    System.out.println(i);
    System.out.println(++j);
    System.out.println(test = i < j | i == j);
    }
}
