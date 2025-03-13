public class MinMax {
    public static int[] findMinMax(int[] arr){
        // Brute Force
//        int min = arr[0];
//        int max = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < min){
//                min = arr[i];
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max){
//                max = arr[i];
//            }
//        }
//
//        return new int[]{min,max};

        // Better
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        int min = arr[0];
        int max = arr[0];

        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        return new int[]{min,max};

    }
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,6,5};
        int[] result = findMinMax(arr);

        System.out.println("Minimum: "+result[0]);
        System.out.println("Maximum: "+result[1]);

    }
}
