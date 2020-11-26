package algorithm;

public class MaximumSubArray {

	public static void main(String[] args) {
		// Subarray중에 합이 제일 큰 수 return

		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(maxSubArray(nums));

	}

	public static int maxSubArray(int[] nums) {

		// 1
		int newSum = nums[0];
		int max = nums[0];

		// 2
		for (int i = 0; i < nums.length; i++) {
			newSum = Math.max(nums[i], newSum + nums[i]);
			max = Math.max(newSum, max);

		}

		return max;

	}

}
