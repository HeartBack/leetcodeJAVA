import java.lang.reflect.Array;
import java.util.Arrays;

public class LeetCode16 {
	public int threeSumClosest(int[] nums, int target) {
		if(nums.length==3)return nums[0]+nums[1]+nums[2]; 
		int sum=nums[0]+nums[1]+nums[2];
		int min=Integer.MAX_VALUE;
		Arrays.sort(nums);
		
		for(int i=0;i<nums.length;i++){
			
			int j=i+1,k=nums.length-1;
			while(j<k){
				int temp=nums[j]+nums[i]+nums[k];
				if(min>Math.abs(temp-target)){
					min=Math.abs(temp-target);
					sum=temp;
				}
				if(temp==target){
					return sum;
				}
				else if(temp>target){
					--k;
				}
				else{
					++j;
				}
			}
		}
		return sum;
	}
	public static void main(String[] args){
		int[] t={1,2,4,8,16,32,64,128};
		int target=82;
		System.out.println(new LeetCode16().threeSumClosest(t,target));
	}

}
