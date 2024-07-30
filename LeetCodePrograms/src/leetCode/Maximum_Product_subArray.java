package leetCode;

public class Maximum_Product_subArray {

	public static void main(String[] args) {
		int nums[]= {-2};
		System.out.println(maxProduct(nums));

	}
	
	private static int maxProduct(int[] nums) {
		double max=nums[0];
		int i=0;
		int j=nums.length-1;
		double left=1;
		double right=1;
		while(i<nums.length && j>=0) {
			left=left==0?1:left;
			right=right==0?1:right;
			left*=nums[i];
			right*=nums[j];
			double m=left>right?left:right;
			max=m>max?m:max;
			i++;
			j--;
		}
		return (int)max;
	}

}
