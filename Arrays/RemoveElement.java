public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int i = -1;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val){
                i++;
                nums[i] = nums[j];
//                System.out.println(nums[i]);
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,2,3,0,4,2};
        int n = 2;

        int res = removeElement(arr, n);
        System.out.println(res);
    }
}
