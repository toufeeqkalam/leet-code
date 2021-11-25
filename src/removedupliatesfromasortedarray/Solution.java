package removedupliatesfromasortedarray;

public class Solution {

    public static int removeDuplicates(int[] nums) {

        int current = 0;
        int next = 1;

        while (next < nums.length) {
            if (nums[current] == nums[next]) {
                next++;
            } else {
                nums[++current] = nums[next];
            }
        }
        return current + 1;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1,1,2}));
    }
}
