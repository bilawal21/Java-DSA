public class RotateArray {

    public static void rotate(int[] nums, int k){
        // right rotate by k - optimal solution
        k = k % nums.length;
        reverse(nums,0,nums.length-1);  // reverse the whole array
        reverse(nums,0,k-1);    // reverse first k elements
        reverse(nums,k,nums.length-1);  // reverse remaining elements
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

//    public static void rotate(int[] nums) {
//        // right rotate by one - optimal solution
//        int temp = nums[nums.length-1];
//        for (int i = nums.length - 1; i > 0 ; i--) {
//            nums[i] = nums[i-1];
//        }
//        nums[0] = temp;
//
//        for (int i = 0; i < nums.length; i++) {
//            System.out.print(nums[i]+" ");
//        }


        // left rotate by one - brute force solution
//        int[] temp = new int[5];
//        for (int i = 1; i < nums.length; i++) {
//            temp[i-1] = nums[i];
//        }
//        temp[5-1] = nums[0];
//        for (int i = 0; i < nums.length; i++) {
//            System.out.print(temp[i]+" ");
//        }


        // left rotate by one - optimal solution
//        int temp = nums[0];
//        for (int i = 0; i < nums.length-1; i++) {
//            nums[i] = nums[i+1];
//        }
//        nums[nums.length-1] = temp;
//
//        for (int i = 0; i < nums.length; i++) {
//            System.out.print(nums[i]+" ");
//        }
//    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 3;
        rotate(arr, k);
        for (int num :
                arr) {
            System.out.print(num+" ");
        }
    }
}
