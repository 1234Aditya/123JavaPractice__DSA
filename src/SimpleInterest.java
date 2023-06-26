import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principle: ");
        float p = sc.nextFloat();

        System.out.print("Enter rate of interest: ");
        float r = sc.nextFloat();
        System.out.print("Enter time:");
        float t = sc.nextFloat();

        float s1 = (p*r*t)/100;
        System.out.println("Principle: "+p);
        System.out.println("Rate of interest: "+r);
        System.out.println("Time: "+t);
        System.out.println("Simple interest: "+s1);
    }
}
