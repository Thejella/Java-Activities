//Submitted By: Xian Benedict G. Yee BSCompE 2 EP1
public class lengthconversion
{
    public static void main(String[] args) {
    int km = 15, mm = 1000000;
    float cm = 850;
    System.out.println("Values to be converted to Meter:\b");
    System.out.println("15 Kilometer\b");
    System.out.println("850 Centimeter\b");
    System.out.println("1000000 Millimeter\n");
    System.out.println("Computing the result...\b");
    System.out.println("15 Kilometer = " + (km*1000) + "m\b");
    System.out.println("850 Centimeter = " + (cm/100) + "m\b");
    System.out.println("1000000 Millimeter = " + (mm/10000) + "m\b");
    }
}

