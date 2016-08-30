
public class LeetCode70 {
	public int climbStairs2(int n) {
		if(n==1)return 1;
		if(n==2)return 2;
		else return climbStairs(n-1)+climbStairs(n-2);

	}
	public int climbStairs(int n) {
		if(n==1)return 1;
		if(n==2)return 2;
		int one=2;
		int two=1;
		int sum=0;
		for(int i=2;i<n;i++){
			sum=one+two;
			two=one;
			one=sum;
		}
		return sum;

	}
	public static void main(String[] args){
		long time=System.currentTimeMillis();
		System.out.println(new LeetCode70().climbStairs2(44));
		System.out.println(System.currentTimeMillis()-time);
	}

}
