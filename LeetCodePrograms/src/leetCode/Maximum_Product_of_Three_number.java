package leetCode;

public class Maximum_Product_of_Three_number {

	public static void main(String[] args) {
		int nums[]= {1,2,3};
	}
	
	 public int maximumProduct(int[] nums) {
	        int max=0;
	        int sum=nums[0];
	        for(int i=0;i<nums.length;i++)
	        {
	        	
	        	sum*=nums[i];
	        	
	        }
	        return max;
	    }

}
