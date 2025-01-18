//Submitted by: Xian Benedict G. Yee BsCompE2 EP1
public class temperatureconversion
{
    public static void main(String[] args) {
    float cel = 20;
    float far = 68;
    float resultfar = ((cel*9)/5)+32; 
    float resultcel = (far-32)*5/9;
    System.out.println("Formula of Celsius to Farenheit: F=C*9/5+32\b");
    System.out.println("Formula of Farenheit to Celsius: C=(F-32)*5/9\n");
    System.out.println("Given:\b");
    System.out.println("Celsius: 20C\b");
    System.out.println("Farenheit: 68F\n");
    System.out.println("Converted:\b");
    System.out.println("20C = " + resultfar + "F");
    System.out.println("68F = " + resultcel + "C");
    }
}
