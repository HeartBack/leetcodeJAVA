
public class LeetCode206 {
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
		}
	}
	public ListNode reverseList(ListNode head) {
		ListNode p=head,q=p.next;
		ListNode temp;
		while(q!=null){
			temp=q.next;
		    q.next=p;
		    p=q;
		    q=temp;
		}
		return p;

	}
	public ListNode createLN(){
		ListNode ln=new ListNode(1);
		ln.next=new ListNode(2);
		ln.next.next=new ListNode(3);
		ln.next.next.next=new ListNode(4);
		ln.next.next.next.next=null;
		return ln;
	}
	public static void main(String[] args){
		LeetCode206 l=new LeetCode206();
		System.out.println(l.reverseList(l.createLN()).val);
		
	}
}
