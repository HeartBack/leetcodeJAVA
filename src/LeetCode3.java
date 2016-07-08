import java.util.HashSet;
import java.util.Set;

public class LeetCode3 {
	public int lengthOfLongestSubstring(String s) {
		HashSet<Integer> s1=new HashSet<Integer>();
		int size=s.length();
		if(size==1)return 1;
		int len=0;
		for(int i=0;i<size;i++){
			s1.add(s.charAt(i)-'0');
			for(int j=i+1;j<size;j++){
				char c=s.charAt(j);
				if(s1.contains(c-'0')){
					break;
				}
				s1.add(c-'0');
			}
			if(s1.size()>len){
				len=s1.size();
			}
			s1.clear();
		}
		return len;

	}
	public static void main(String[] args){
		
		
		System.out.println(new LeetCode3().lengthOfLongestSubstring("abc"));
	}
}
