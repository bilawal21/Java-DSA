public class Table {

    public static void printTable(int num){
        for (int i = 1; i <= 10; i++) {
            System.out.println(num+" x "+i+" = "+num*i);
        }
    }
    public static void main(String[] args) {
        int num = 4;
        printTable(num);
    }
}
