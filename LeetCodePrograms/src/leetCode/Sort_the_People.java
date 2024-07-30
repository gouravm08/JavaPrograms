package leetCode;

import java.util.Arrays;
import java.util.HashMap;

public class Sort_the_People {

	public static void main(String[] args) {
		String names[]= {"Mary","John","Emma"};
		int[] heights= {180,165,170}; 
		String[] sortPeople = sortPeople(names, heights);
		
	}
	 public static String[] sortPeople(String[] names, int[] heights) {
		  int n = heights.length;
	        HashMap<Integer,String> map = new HashMap<>();
	        for(int i=0;i<n;i++){
	            map.put(heights[i],names[i]);
	        }
	        Arrays.sort(heights);
	        String[] res = new String[n];
	        for(int i=n-1,j=0;i>=0;i--,j++){
	            res[j]=map.get(heights[i]);
	        }
	        return res;
	 }
}
