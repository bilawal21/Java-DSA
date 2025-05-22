public class Factorial {

    public static void fac(int n){
        if (n<1){
            System.out.println("Invalid number");
            return;
        }
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }

        System.out.println(factorial);
        return;
    }

    public static void main(String[] args) {
        int n = 4;
        fac(n);

    }
}
