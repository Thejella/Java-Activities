//Submitted by: Xian Benedict G. Yee BsCompE2 EP1
public class greatestvalue
{
    public static void main(String[] args) {
    int num1=1000;
    int num2=113;
    int num3=1599;
    System.out.println("Printing variables...");
    System.out.println("number 1 = 1000");
    System.out.println("number 2 = 113");
    System.out.println("number 3 = 1599\n");
    System.out.println("Evaluating...");
    if (num1 > num2 && num1 > num3) { System.out.println(num1 + " is the greatest value!"); }
    if (num2 > num3 && num2 > num1) { System.out.println(num2 + " is the greatest value!"); }
    if (num3 > num1 && num3 > num2) { System.out.println(num3 + " is the greatest value!"); }
    }
}
