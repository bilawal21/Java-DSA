import java.util.Scanner;

public class ArraysIntro {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int numbers[] = new int[a];

        // for (int i = 0; i < a; i++) {
        //     numbers[i] = sc.nextInt();
        // }

        // for (int i = 0; i < a; i++) {
        //     // System.out.println(numbers[i]);
        //     if (numbers[i] == 4) {
        //         System.out.println("Index: "+i);
        //     }
        // }

        // Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        // String names[] = new String[size];

        // for (int i = 0; i < size; i++) {
        //     names[i] = sc.next();
        // }

        // for (int i = 0; i < size; i++) {
        //     System.out.println("Name "+(i+1)+"is: "+names[i]);
        // }

        // int arr[] = { 1, 2, 3, 4 };
        // // int max = Integer.MIN_VALUE;
        // // int min = Integer.MAX_VALUE;
        // int max = arr[0];
        // int min = arr[0];

        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] < min) {
        //         min = arr[i];
        //     }
        //     if (arr[i] > max) {
        //         max = arr[i];
        //     }
        // }

        // System.out.println("Max: "+max);
        // System.out.println("Min: "+min);

        // int arr[] = { 7, 2, 3, 4, 5, 6, 1};

        // boolean isAscending = true;
        // for (int i = 0; i < arr.length - 1; i++) {
        //     if (arr[i] > arr[i + 1]) {
        //         isAscending = false;
        //     }

        // }
        // if (isAscending) {
        //     System.out.println("sorted");
        // }
        // else {
        //     System.out.println("unsorted");

        // }

        // 2D Arrays

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int matrix[][] = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Spiral Order Matrix: ");

        int rowStart = 0;
        int rowEnd = rows - 1;
        int colStart = 0;
        int colEnd = cols - 1;

        while (rowStart <= rowEnd && colStart <= colEnd) {
            for (int col = colStart; col <= colEnd; col++) {
                System.out.print(matrix[rowStart][col] + " ");
            }
            rowStart++;

            for (int row = rowStart; row <= rowEnd; row++) {
                System.out.print(matrix[row][colEnd] + " ");
            }
            colEnd--;

            for (int col = colEnd; col >= colStart; col--) {
                System.out.print(matrix[rowEnd][col] + " ");
            }
            rowEnd--;

            for (int col = rowEnd; col >= rowStart; col--) {
                System.out.print(matrix[rowStart][col] + " ");
            }
            colStart++;

            System.out.println();
        }
        

        // int x = sc.nextInt();

        // for (int i = 0; i < rows; i++) {
        //     for (int j = 0; j < cols; j++) {
        //         if (arr[i][j] == x) {
        //             System.out.println("x found at: "+i+" "+j);
        //         }
        //     }
        // }
    }
}
