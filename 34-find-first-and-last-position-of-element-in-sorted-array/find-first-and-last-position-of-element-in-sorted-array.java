class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;

        int first = lBound(nums, 0, n - 1, target, n);
        int last = uBound(nums, 0, n - 1, target);

        if (first == n || nums[first] != target)
            return new int[]{-1, -1};

        return new int[]{first, last};
    }

    private int lBound(int[] nums, int low, int high, int target, int n) {
        int idx = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                idx = mid;
                high = mid - 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return idx;
    }

    private int uBound(int[] nums, int low, int high, int target) {
        int idx = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                idx = mid;
                low = mid + 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return idx;
    }
}