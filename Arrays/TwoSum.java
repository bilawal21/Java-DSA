import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if (map.containsKey(diff)){
                return new int[] {map.get(diff), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[] arr = {3,2,4};
        int t = 6;
        int[] res = twoSum(arr, t);
        for (int n: res) {
            System.out.print(n+" ");
        }
    }
}
