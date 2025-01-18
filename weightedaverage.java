//Submitted by: Xian Benedict G. Yee BsCompE2 EP1
public class weightedaverage
{
    public static void main(String[] args) {
    int mgrade = 85;
    int munit = 3;
    int mweightedaverage = mgrade*munit;
    int sgrade = 90;
    int sunit = 4;
    int sweightedaverage = sgrade*sunit;
    int pegrade = 99;
    int peunit = 2;
    int pweightedaverage = pegrade*peunit;
    int sumofweights = 3+4+2;
    System.out.println("Printing subject's grades...\b");
    System.out.println("Subject    Grade\b");
    System.out.println(" Math:      85\b");
    System.out.println("Science:    90\b");
    System.out.println(" PE:        99\n");
    System.out.println("Computing weighted average...\b");
    System.out.println("Weighted Average: " + (mweightedaverage+sweightedaverage+pweightedaverage)/sumofweights);
    }
}
