public class Patterns {

    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print('*');
//            }
//            System.out.println();
//        }

//        for (int i = 5; i > 0; i--){
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        for (int i = 4; i >= 1; i--) {
//            for (int j = 1; j < i; j++) {
//                    System.out.print(" ");
//            }
//            for (int k = 0; k <= 4-i; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }

//        for (int i = 5; i >= 1; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//        int num = 1;
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(num+" ");
//                num++;
//            }
//            System.out.println();
//        }

//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= i; j++) {
//                if ((i+j)%2==0){
//                    System.out.print(1+" ");
//                }
//                else {
//                    System.out.print(0+" ");
//                }
//            }
//            System.out.println();
//        }

//        for (int i = 4; i > 0; i--) {
//            for (int j = 1; j < i; j++) {
//                    System.out.print(" ");
//            }
//            for (int k = 0; k < 5; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
