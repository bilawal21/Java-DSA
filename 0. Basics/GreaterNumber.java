public class GreaterNumber {

    public static int findGreater(int a, int b){
//        return Math.max(a, b);
        if (a>b){
            return a;
        }
        return b;
    }

    public static void main(String[] args) {
        int a = 5, b = 3;

        int res = findGreater(a,b);
        System.out.println(res);
    }
}
