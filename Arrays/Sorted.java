public class Sorted {

    public static boolean check(int[] nums){
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i+1; j < nums.length; j++) {
//                if (nums[j] < nums[i]){
////                    System.out.println(nums[i]+" "+nums[j]);
//                    return false;
//                }
//            }
//        }
//        return true;


        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i-1]){
//                System.out.println(nums[i]+" "+nums[i-1]);
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,7,5,6};
        boolean res = check(arr);
        System.out.println(res);
    }
}
