package leetCode;

public class Maximum_subArray_sum {

	public static void main(String[] args) {
		int[] nums= {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(nums));

	}
	 public static int maxSubArray(int[] nums) {
		 int max=nums[0];
		 int i=0;
		 int sum=0;
		 while(i<nums.length)
		 {
			sum+=nums[i];
			max=sum>max?sum:max;
			if(sum<0)
				sum=0;
			
			i++;
		 }
		 return max;
	 }

}
