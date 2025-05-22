import java.util.Scanner;

public class Calculator {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Select the operation you want to perform: ");
        char c = sc.next().charAt(0);
        System.out.print("\nEnter a and b values: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (c == '+'){
            System.out.println("Sum of two numbers: "+(a+b));
        } else if (c == '-') {
            System.out.println("Subtraction of two numbers: "+(a-b));
        } else if (c == '*') {
            System.out.println("Multiplication of two numbers: "+(a*b));
        } else if (c == '/') {
            System.out.println("Division of two numbers: "+(a/b));
        } else if (c == '%') {
            System.out.println("Modulo of two numbers: "+(a%b));
        } else {
            System.out.println("Please select a correct operation!!!");
        }
    }
}
