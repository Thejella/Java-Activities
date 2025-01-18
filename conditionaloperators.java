//Submitted by: Xian Benedict G. Yee BsCompE2 EP1
public class conditionaloperators
{
    public static void main(String[] args) {
    int english = 75;
    int science = 80;
    int math = 90;
    int average = ((english + science + math)/3);
    String status = (average >=75)? "PASSED": "FAIL";
    System.out.println("Printing grade...\b");
    System.out.println("English 75\b");
    System.out.println("Science 80\b");
    System.out.println("Math 90\n");
    System.out.println("Evaluating...\b");
    System.out.println("Average Grade: " + average);
    System.out.println("Status: " + status);
    }
}
