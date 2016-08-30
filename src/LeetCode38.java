
public class LeetCode38 {
	public String countAndSay(int n) {
		if(n==1)return "1";
		else{
			String s=countAndSay(n-1);
			return countInt(s);
		}
	
	}
	public String countInt(String s){
		int len=s.length();
		int count=1;
		String re="";
		for(int i=0;i<len-1;i++){
			if(s.charAt(i)==s.charAt(i+1)){
				count++;
			}
			else{
				//System.out.println(count);
				re=re+count+s.charAt(i);
				count=1;
			}
		}
		re=re+count+s.charAt(len-1);
		return re;
	}
	public static void main(String[] args){
		System.out.println(new LeetCode38().countInt("21"));
	}

}
