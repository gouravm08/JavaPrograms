package leetCode;

public class Minimum_Size_Subarray_Sum {

	public static void main(String[] args) {
		int num[] = { 2, 3, 1, 2, 4, 3 };
		int target = 7;
		System.out.println(minSubArrayLen(target, num));
	}

	public static int minSubArrayLen(int target, int[] nums) {

		int min=Integer.MAX_VALUE;
		int i=0;
		int j=0;
		int sum=0;
		while(j<nums.length)
		{
			sum+=nums[j];
			while(sum>=target) {
				int c=j-i+1;
				min=c<min?c:min;
				sum-=nums[i];
				i++;
			}
			
			j++;
		}
				
		return min==Integer.MAX_VALUE?0:min;
	}

}
