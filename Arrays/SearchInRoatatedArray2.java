public class SearchInRoatatedArray2 {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 7, 0,0, 1, 2};
        System.out.println(search(arr,4));
    }

    public static int peak(int[] nums) {
        //finding index where array is rotated
        int p = nums.length - 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                p = i;
                break;
            }
        }
        return p;
    }

    public static boolean search(int[] nums, int target) {
        int p = peak(nums);
        int s;
        int e;
        if (target >= nums[0] && target <= nums[p - 1]) {
            s = 0;
            e = p - 1;
        } else {
             s = p;
             e = nums.length - 1;
            }
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (nums[m] == target) return true;
            else if (nums[m] >= target) e = m - 1;
            else s = m + 1;
        }
        return false;
    }
}

