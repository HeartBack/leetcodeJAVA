
public class LeetCode58 {
	public int lengthOfLastWord(String s) {
		int i=0,j=0;
		int count=0;
		int len=s.length();
		while(i<len&&j<len){
			while(s.charAt(i)==' '){
				++i;
				if(i>=len)return count;
			}
			j=i;
			while(s.charAt(j)!=' '){
				++j;
				if(j>=len)return j-i;
			}
			count=j-i;
			i=j;
			
		}
		
		return count;
	}
	public static void main(String[] args){
		System.out.println(new LeetCode58().lengthOfLastWord("a"));
	}
}
