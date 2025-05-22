public class PrimeNumber {

    public static boolean isPrime(int num){
        if (num<2) return false;
        for (int i = 2; i < num; i++) {
            if (num%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 13;

        for (int i = 2; i <= n; i++) {
            if (isPrime(i)){
                System.out.println(i);
            }
        }

        boolean res = isPrime(n);
        System.out.println(res ? "Prime" : "Not Prime");
    }
}
