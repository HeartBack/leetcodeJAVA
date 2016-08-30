
public class LeetCode141 {

	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public boolean hasCycle(ListNode head) {
		if(head==null)return false;
		ListNode walker=head;
		ListNode runner=head;
		while(runner.next!=null&&runner.next.next!=null){
			walker=head.next;
			runner=head.next.next;
			if(walker==runner)return true;
		}
		return false;

	}

}
