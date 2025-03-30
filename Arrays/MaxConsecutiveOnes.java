public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max_count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1){
                count++;
            }
            else {
                count = 0;
            }

            if (count > max_count){
                max_count = count;
            }
        }
        return max_count;
    }

    public static void main(String[] args) {
        int[] arr ={1,1,0,1,1,1};
        int res = findMaxConsecutiveOnes(arr);
        System.out.println(res);
    }
}
