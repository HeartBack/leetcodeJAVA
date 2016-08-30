
public class LeetCode292 {
	public boolean canWinNim(int n) {
		if ((n-1)%4==0)return true;
		else if((n-2)%4==0)return true;
		else if((n-3)%4==0)return true;
		return false;

	}
	public boolean test(int n,int p){
		if(n<=3){
			if(p%2==0)return false;
			else return true;
		}
		else if(test(n-1,p+1)){
			System.out.println(1+" "+p);
			return true;
		}else if(test(n-2,p+1)){
			System.out.println(2+" "+p);
			return true;
		}else if(test(n-3,p+1)){
			System.out.println(3+" "+p);
			return true;
		}
		return false;
	}
	public static void main(String[] args){
		System.out.println(new LeetCode292().canWinNim(1348));
	}

}
