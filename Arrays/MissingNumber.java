public class MissingNumber {

    public static int missingNumber(int[] nums){
        int n = nums.length+1;
        int s1 = (n*(n+1))/2;
        int s2 = 0;
        for (int i : nums) {
            s2 += i;
        }

        return s1-s2;

//        int xor1 = 0, xor2 = 0;
//
//        for (int i = 0; i < nums.length - 1; i++) {
//            xor2 = xor2 ^ nums[i];
//            xor1 = xor1 ^ (i+1);
//        }
//        xor1 = xor1 ^ nums.length;
//
//        return (xor1 ^ xor2);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,5};
        int res = missingNumber(arr);
        System.out.println(res);
    }
}
