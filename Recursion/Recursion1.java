public class Recursion1 {
//    public static void printNumb(int n){
//        if (n == 6) return;
//        System.out.println(n);
//        printNumb(n+1);
//    }

//    public static void printSum(int i, int n, int sum){
//        if (i == n){
//            sum += i;
//            System.out.println(sum);
//            return;
//        }
//        sum += i;
//        printSum(i+1, n, sum);
//    }

//    public static int calcFactorial(int n){
//        if (n == 1 || n == 0) return 1;
//
//        int fact_nm1 = calcFactorial(n-1);
//        int fact_n = n * fact_nm1;
//        return fact_n;
//    }

//    public static void printFib(int a, int b, int n){
//        if (n == 0) return;
//        int c = a + b;
//        System.out.println(c);
//        printFib(b,c, n-1);
//    }

    public static int calcPower(int x, int n){
        if (n == 0){    // base case 1
            return 1;
        }
        if (x == 0){    // base case 2
            return 0;
        }

        // Stack height = n
//        int xPownm1 = calcPower(x, n-1);
//        int xPown = x * xPownm1;
//        return xPown;

        // Stack height = logn
        if (n % 2 == 0){
            return calcPower(x, n/2) * calcPower(x, n/2);
        }
        else {
            return calcPower(x, n/2) * calcPower(x, n/2) * x;
        }
    }
    public static void main(String[] args) {
//        int n = 1;
//        printNumb(n);
//        printSum(1,5,0);
//        System.out.println(calcFactorial(5));
//        int a = 0, b = 1;
//        System.out.println(a);
//        System.out.println(b);
//        int n = 7;
//        printFib(a, b, n-2);

        int x = 2, n = 5;
        int ans = calcPower(x, n);
        System.out.println(ans);
    }
}
