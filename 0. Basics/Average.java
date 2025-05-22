import java.util.Scanner;

public class Average {

    public static float findAverage(int a, int b, int c){
        return (float) (a + b + c) /3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        float res = findAverage(a,b,c);
        System.out.println(res);
    }
}
