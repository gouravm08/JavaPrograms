package leetCode;

public class Best_Time_to_Buy_And_Sell_Stock {

	public static void main(String[] args) {
		int nums[]= {7,1,5,3,6,4};
      System.out.println(maxProfitOptimize(nums));
	}
	
    public static int maxProfit(int[] prices) {
    	int max=0;
    	int sum=0;
    	for(int i=0;i<prices.length;i++) {
    		for(int j=i+1;j<prices.length;j++) {
    			sum=prices[j]-prices[i];
    			max=sum>max?sum:max;
    		}
    	}
    return max;    
    }

    public static int maxProfitOptimize(int[] prices) {
    	int max=0;
    	int buy=prices[0];
    	for(int i=0;i<prices.length;i++) {
    		int curProf=0;
    		if(prices[i]<buy) {
    			buy=prices[i];
    		}
    		else {
    			curProf=prices[i]-buy;
    			max=curProf>max?curProf:max;
    		}
    	}
    return max;    
    }
}
