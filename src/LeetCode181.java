import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LeetCode181 {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> re = new ArrayList<List<Integer>>();
		if(numRows==0)return re;
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(1);
		re.add(al);
		for(int i=1;i<numRows;i++){
			List<Integer> list=new ArrayList<Integer>();
			list.add(1);
			List<Integer> temp=re.get(i-1);
			int size=temp.size();
			for(int j=0;j<size-1;j++){
				list.add(temp.get(j)+temp.get(j+1));
			}
			list.add(1);
			re.add(list);
		}
		return re;
	}
}
