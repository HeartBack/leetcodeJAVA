
public class LeetCode121 {
	public int maxProfit(int[] prices) {
	       if(prices.length==0)return 0;
			int profit=0;
			int min=prices[0];
			int t=0;
			for (int i=1;i<prices.length;++i){
				if(prices[i]<min){
				    min=prices[i];
				}else{
				    t=prices[i]-min;
				    profit=profit>t?profit:t;
				}
			}
			return profit;
		}

}
