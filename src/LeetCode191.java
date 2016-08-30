
public class LeetCode191 {
	public int hammingWeight2(int n) {
		String s=Integer.toBinaryString(n);
		int len=s.length();
		int count=0;
		for(int i=0;i<len;i++){
			if(s.charAt(i)=='1')count++;
		}
		return count;

	}
	public int hammingWeight(int n) {
		int count=0;
		while(n>0){
			if((n&1)%2!=0)count++;
			n=n>>1;
		}
		return count;

	}
	public static void main(String[] args){
		System.out.println(new LeetCode191().hammingWeight(11));
	}

}
