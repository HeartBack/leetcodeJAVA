import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LeetCode345 {
	public String reverseVowels(String s) {
        int size = s.length();
        char[] origin= s.toCharArray();
        int left = 0,right = size-1;
        char tmp;
        while(left <right){
            if(!contains(origin[left])){
                left++;continue;
            }
            if(!contains(origin[right])){
                right--;continue;
            }
            tmp = origin[left];
            origin[left]=origin[right];
            origin[right] = tmp;
            left++;right--;
        }
        return String.valueOf(origin);
    }
    private boolean contains(char cc){
        return cc=='a'||cc=='e'||cc=='i'||cc=='o'||cc=='u'||cc=='A'||cc=='E'||cc=='I'||cc=='O'||cc=='U';
    }
	public static void main(String[] args){
		System.out.println(new LeetCode345().reverseVowels("hello"));
	}
}
