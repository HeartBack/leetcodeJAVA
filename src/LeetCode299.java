
public class LeetCode299 {
	public String getHint(String secret, String guess) {
        int l=secret.length();
        int a=0;
        int b=0;
        for(int i=0;i<l;i++){
            if(secret.charAt(i)==guess.charAt(i)){
            	a++;
            }else {
            	b++;
            }
        }
        String s=""+String.valueOf(a);
        return s;
    }
}
