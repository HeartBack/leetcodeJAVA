import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LeetCode290 {
	public boolean wordPattern(String pattern, String str) {
        Map<Character,String> map = new HashMap<Character,String>();
        HashSet<String> set=new HashSet<String>();
        String[] s=str.split(" ");
        int size=pattern.length();
        if(size==s.length){
        	for(int i=0;i<size;i++){
                if(map.containsKey(pattern.charAt(i))){
                	if(!map.get(pattern.charAt(i)).equals(s[i]))return false;
                }
                else{
                	if(set.contains(str.charAt(i)))return false;
                	map.put(pattern.charAt(i), s[i]);
                	set.add(str.charAt(i)+"");
                }
            }
        }
        else{
        	for(int i=0;i<size;i++){
                if(map.containsKey(pattern.charAt(i))){
                	if(!map.get(pattern.charAt(i)).equals(str.charAt(i)))return false;
                }
                else{
                	if(set.contains(str.charAt(i)))return false;
                	map.put(pattern.charAt(i), str.charAt(i)+"");
                	set.add(str.charAt(i)+"");
                }
            }
        }
        
        return true;
    }
}
