import java.util.Scanner;

public class Numbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int positives = 0;
        int zeros = 0;
        int negatives = 0;

        while (a==1){
            int val = sc.nextInt();
            if (val == 0){
                zeros++;
            } else if (val > 0) {
                positives++;
            }else {
                negatives++;
            }
            a = sc.nextInt();
        }
        System.out.println("Pos "+"Zeros "+"Neg ");
        System.out.println(positives+" "+zeros+" "+negatives);
    }
}
