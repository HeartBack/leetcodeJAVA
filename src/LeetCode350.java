import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class LeetCode350 {
	public int[] intersect(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int i=0,j=0;
		ArrayList<Integer> l=new ArrayList<Integer>();
		while(i<nums1.length&&j<nums2.length){
			if(nums1[i]<nums2[j]){
				i++;
			}else if(nums1[i]>nums2[j]){
				j++;
			}
			else{
				l.add(nums1[i]);
				i++;
				j++;
			}
		}
		int size=l.size();
		int[] re=new int[size];
		for (int k=0;k<size;k++){
		    re[k]=l.get(k);
		}
		return re;
	}

}
