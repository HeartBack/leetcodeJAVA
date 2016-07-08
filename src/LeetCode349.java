import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LeetCode349 {
    public int[] intersection(int[] nums1, int[] nums2) {
    	if(nums1.length==0){
            return nums1;
        }else if(nums2.length==0){
            return nums2;
        }
        Set<Integer> s1=new HashSet<Integer>();
        for(int i:nums1){
        	s1.add(i);
        }
        
        Set<Integer> s2=new HashSet<Integer>();
        for(int i:nums2){
        	if(s1.contains(i)){
        		s2.add(i);
        	}
        }
        int[] re=new int[s2.size()];
        int j=0;
        for(int i:s2)re[j++]=i;
        return re;
    }
    public static void main(String[] args){
    	int[] nums1={1};
    	int[] nums2={1};
    	System.out.println(new LeetCode349().intersection(nums1, nums2)[0]);
    }

}
