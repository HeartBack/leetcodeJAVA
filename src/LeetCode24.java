
public class LeetCode24 {
	public ListNode swapPairs(ListNode head) {
		ListNode re;
		if (head == null || head.next == null)
			return head;
		else
			re = head.next;

		ListNode h = head;
		ListNode temp = null;
		ListNode pro = head;
		while (h != null && h.next != null) {
			temp = h.next.next;
			h.next.next = h;
			pro.next = h.next;
			h.next = temp;
			pro = h;
			h = temp;

		}
		return re;
	}
}
