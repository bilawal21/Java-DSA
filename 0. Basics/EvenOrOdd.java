public class EvenOrOdd {

    public static void isEven(int num){
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (i%2==0){
                System.out.println(i);
                sum += i;
//                return true;
            }
        }
        System.out.println("sum of even: "+sum);
//        return false;
    }

    public static void isOdd(int num){
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            if (i%2!=0){
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println("sum of odd: "+sum);
    }

    public static void main(String[] args) {
        int num = 16;
        isEven(num);
        isOdd(num);
    }
}
