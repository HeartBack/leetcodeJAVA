import java.util.HashSet;
import java.util.Set;

public class LeetCode83 {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
	public ListNode deleteDuplicates(ListNode head) {
		ListNode p=head;
		while(p!=null){
			if(p.next!=null){
				if(p.val==p.next.val){
					p.next=p.next.next;
				}else{
					p=p.next;
				}
			}else{
				p=p.next;
			}
		}
        return head;
    }
}
