import java.util.HashMap;

public class LeetCode242 {
	public boolean isAnagram(String s, String t) {
		int lens=s.length();
		int lent=t.length();
		if(lens!=lent)return false;
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		for(int i=0;i<lens;i++){
			char c=s.charAt(i);
			if(map.containsKey(c)){
				map.put(c, map.get(c)+1);
			}
			else{
				map.put(c,1);
			}
		}
		for(int j=0;j<lent;j++){
			char c=t.charAt(j);
			System.out.println(c);
			if(map.containsKey(c)){
				if(map.get(c)>0){
					map.put(c, map.get(c)-1);
				}else{
					return false;
				}
			}else{
				return false;
			}
		}
		for(char c:map.keySet()){
			if(map.get(c)>0)return false;
		}
		return true;

    }
	public boolean isAnagram2(String s, String t) {
		int[] c=new int[26];
		int lens=s.length();
		if(lens!=t.length())return false;
		for(int i=0;i<lens;i++){
			c[s.charAt(i)-97]++;
			c[t.charAt(i)-97]--;
		}
		for(int i=0;i<26;i++){
			if(c[i]>0)return false;
		}
		return true;

    }
	public static void main(String[] args){
		System.out.println(new LeetCode242().isAnagram2("acac", "ccac"));
	}
}
