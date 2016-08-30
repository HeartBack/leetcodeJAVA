
public class LeetCode198 {
	public int rob(int[] nums) {
		int pro = 0, propro = 0;
		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			max = pro > (propro + nums[i]) ? pro : (propro + nums[i]);
			propro = pro;
			pro = max;
		}
		return max;
	}
}
