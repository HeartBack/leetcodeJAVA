import java.util.Arrays;
import java.util.HashMap;

public class LeetCode169 {
	public int majorityElement(int[] nums) {
		if(nums.length==1)return nums[0];
		int i=0,j=0;
		for(int num:nums){
			if(i==0)
				j=num;
			if(j!=num)
				i--;
			else
				i++;
		}
		return j;
		
	}
	public int majorityElement1(int[] nums) {
		int len=nums.length;
		if(len==1)return nums[0];
		HashMap<Integer,Integer> m=new HashMap<Integer,Integer>();
		for(int i=0;i<len;i++){
			if(m.containsKey(nums[i])){
				int t=m.get(nums[i])+1;
				if(t>len/2)return nums[i];
				m.put(nums[i], t);
			}
			else{
				m.put(nums[i],1);
			}
		}
		return 0;
	}
	public int majorityElement2(int[] nums) {
		int len=nums.length;
		Arrays.sort(nums);
		return nums[len/2];
	}

}
