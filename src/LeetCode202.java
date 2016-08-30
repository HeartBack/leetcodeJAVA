import java.util.HashSet;
import java.util.Set;

public class LeetCode202 {
	public static Set<Integer> set=new HashSet<Integer>();
	public boolean isHappy(int n) {
		if(n==1)return true;
		if(set.contains(n))return false;
		set.add(n);
		int sum=0;
		int temp=0;
		while(n>0){
			temp=n%10;
			sum+=temp*temp;
			n=n/10;
		}
		
		return isHappy(sum);

	}
	public static void main(String[] args){
		System.out.println(new LeetCode202().isHappy(10));
	}

}
