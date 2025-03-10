public class ReverseArray {

//    public static int[] reversedArray(int[] arr){
        // Brute Force
//        int[] reversed = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            reversed[i] = arr[arr.length - 1 - i];
//        }
//        return reversed;

        // Better
//        int left = 0, right = arr.length;
//        for (int i = 0; i < right / 2; i++) {
//            left = arr[i]; // 1, 2
//            arr[i] = arr[right-1-i]; // 4-1-0 = 3 => 4, 4-1-1 = 2 => 3
//            arr[right-1-i] = left; // [4,3,2,1]
//        }
//        return arr;

//    }

    // Optimal - Recursive
    public static void reversedArray(int[] arr, int left, int right){
        if (left >= right) return;
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        reversedArray(arr, left+1, right-1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        reversedArray(arr, 0, arr.length-1);
        System.out.print("Reversed array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
