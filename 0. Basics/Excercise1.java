import java.util.Scanner;

public class Excercise1 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter numbers: ");
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();

        // int average = (a + b + c) / 3;
        // System.out.println("Average: "+average);

        // int sumOdd = 0;

        // for (int i = 0; i < 10; i++) {
        //     if (i%2!=0) {
        //         sumOdd += i;
        //     }
        // }
        // System.out.println(sumOdd);

        // int a = 10;
        // int b = 5;

        // if (a > b) {
        //     System.out.println(a);
        // }
        // else {
        //     System.out.println(b);
        // }

        int positive = 0, negative = 0, zero = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to continue & 0 to stop");
        int input = sc.nextInt();

        while (input == 1) {
            System.out.println("Enter your number: ");
            int number = sc.nextInt();
            if (number > 0) {
                positive++;
            } else if (number < 0) {
                negative++;
            } else {
                zero++;
            }
            System.out.println("Enter 1 to continue & 0 to stop");
            input = sc.nextInt();
        }
        System.out.println("Positive: "+positive);
        System.out.println("Negative: "+negative);
        System.out.println("Zero: "+zero);
    }
}
