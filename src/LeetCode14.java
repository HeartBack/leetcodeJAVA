
public class LeetCode14 {
	public String longestCommonPrefix(String[] strs) {
		if (strs.length == 0)
			return "";
		if (strs.length == 1)
			return strs[0];
		String pre = strs[0];
		int len = strs[0].length();
		for (int i = 1; i < strs.length; i++) {
			int l = strs[i].length();
			len = len < l ? len : l;
			int c = 0;
			for (int j = 0; j < len; j++) {
				if (pre.charAt(j) == strs[i].charAt(j)) {
					c++;
				} else {
					len = c;
					break;
				}
			}
		}
		pre = pre.substring(0, len);
		return pre;
	}
}
