

public class LeetCode383 {
	public boolean canConstruct(String ransomNote, String magazine) {
        int[] c=new int[128];
        int len_ma=magazine.length();
        int len=ransomNote.length();
        if(len_ma<len)return false;
        for(int i=0;i<len_ma;i++){
        	++c[magazine.charAt(i)-'0'];
        }
        for(int i=0;i<len;i++){
        	if(--c[ransomNote.charAt(i)-'0']<0){
        	    return false;
        	}
        }
        return true;
    }

}
