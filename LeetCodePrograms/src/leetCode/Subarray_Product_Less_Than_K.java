package leetCode;

import java.util.ArrayList;
import java.util.List;

public class Subarray_Product_Less_Than_K {

	public static void main(String[] args) {
		int nums[]= {10,5,2,6};
		int k=100;
//		int count = numSubarrayProductLessThanK(nums, k);
		int count = numSubarrayProductLessOptimized(nums, k);
		System.out.println(count);
	}
	
	 public static int numSubarrayProductLessThanK(int[] nums, int k) {
	        int c=0;
            List res=new ArrayList();

	        for(int i=0;i<nums.length;i++){
	            int p=1;
	            for(int j=i;j<nums.length;j++){
	                p=p*nums[j];
	               if(p<k){
	                List<Integer> sub=new ArrayList();
	                 for(int l=i;l<=j;l++){
	                    sub.add(nums[l]);
	                 }
	                 System.out.println(sub);
	                 res.add(sub);
	               }else{break;}
	            }
	        }
	        return res.size();
	    }
	 
	 
	 public static int numSubarrayProductLessOptimized(int[] nums, int k) {
		 int i=0;
		 int j=0;
		 int p=1;
		 int c=0;
		 while(j<nums.length) {
			p*=nums[j];
			 while(p>=k) {
				 p/=nums[i];
				 i++;
			 }
			 c+=j-i+1;
			 j++;
		 }
		 return c;
	 }
}
