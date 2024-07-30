package leetCode;

public class Longest_Nice_subArray {

	public static void main(String[] args) {

		int[] nums= {1,3,8,48,10};
		int longestNiceSubarray = longestNiceSubarray(nums);
		System.out.println(longestNiceSubarray);
	}
	
public static int longestNiceSubarray(int[] nums) {
       int max=0;
       
       for(int i=0;i<nums.length;i++) {
    	   int k=nums[i];
    	   for(int j=0;j<nums.length;j++)
    	   {
    		 int l=k | nums[j];
    		 System.out.println(l);
    		 if(l==0) {
    			 int m=j-i+1;
    			 max=m>max?m:max;
    		 }
    		   
    	   }
       }
       return max;
    }

}
