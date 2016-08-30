
public class LeetCode171 {
	public int titleToNumber(String s) {
		int sum=0;
		int len=s.length();
		for(int i=0;i<len;i++){
			sum*=26;
			sum+=s.charAt(i)-64;
		}
		return sum;

	}

}
