
class ListNode1 {
	int val;
	ListNode1 next;
	public ListNode1(int x) {
		val = x;
	}
}
public class LeetCode237 {
	public void deleteNode(ListNode1 node) {
		node.val=node.next.val;
		node.next=node.next.next;
		

	}
}
