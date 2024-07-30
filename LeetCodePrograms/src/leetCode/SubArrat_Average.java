package leetCode;

public class SubArrat_Average {

	public static void main(String[] args) {
	int nums[]= {1,12,-5,-6,50,3};
	int k=4;
	findMaxAverage(nums, k);

	}
	 public static  double findMaxAverage(int[] nums, int k) {
	        double avg=Integer.MIN_VALUE;
	        int i=0;
	        int j=0;
	        double sum=0;
	        if(k==1)
	        	return Double.valueOf(nums[i]);
	        for(int l=1;l<=k;l++)
	        {
	        	sum+=nums[j];
	        	j++;
	        }
	       
	        while(i<nums.length-k)
	        {
	        	 System.out.println(nums[j]);
	        	double a=sum/k;
	        	avg=a>avg?a:avg;
	        	sum-=nums[i];
	        	sum+=nums[j];
	        	i++;
	        	j++;
	        	
	        }
	        System.out.println(avg);
	        return avg;
	    }

}
