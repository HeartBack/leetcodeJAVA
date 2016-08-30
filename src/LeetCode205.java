import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LeetCode205 {
	public boolean isIsomorphic(String s, String t) {
		Map<Character, Character> map = new HashMap<Character, Character>();
		Set<Character> set = new HashSet<Character>();
		int len = s.length();
		for (int i = 0; i < len; i++) {
			if (map.containsKey(s.charAt(i))) {
				if (map.get(s.charAt(i)) != t.charAt(i)) {
					return false;
				}
			} else {
				if (set.contains(t.charAt(i)))
					return false;

				map.put(s.charAt(i), t.charAt(i));
				set.add(t.charAt(i));
			}
		}
		return true;
	}
	public boolean isIsomorphic2(String s, String t) {
        int[] map=new int[256];
        int[] set=new int[256];
        //Map<Character,Character> map =new HashMap<Character,Character>();
        //Set<Character> set =new HashSet<Character>();
        int len=s.length();
        for(int i=0; i< len;i++){
            if(map[s.charAt(i)]!=0){
            	if(map[s.charAt(i)]!=(t.charAt(i))){
            		return false;
            	}
            }
            else{
                if(set[t.charAt(i)]!=0)return false;
                
            	map[s.charAt(i)]=t.charAt(i);
            	set[t.charAt(i)]++;
            }
        }
        return true;
    }
}
