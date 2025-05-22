import java.util.Scanner;

public class Circumference {

    public static double circumferenceOfCircle(double r){
        return 2*Math.PI*r;
    }

    public static void main(String[] args) {
        double radius = new Scanner(System.in).nextInt();
        double res = circumferenceOfCircle(radius);
        System.out.println(res);
    }
}
