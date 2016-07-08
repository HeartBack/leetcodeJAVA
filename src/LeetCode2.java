
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
}
public class LeetCode2 {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode l=new ListNode(-1);
		ListNode t=l;
		int carry=0;
		int i=0;
		while(l1!=null&&l2!=null){
			l.val=(l1.val+l2.val+carry)%10;
			l.next=new ListNode(-1);
			carry=(l1.val+l2.val+carry)/10;
			l=l.next;
			l.next=null;
			l1=l1.next;
			l2=l2.next;
		}
		if(l1==null){
			while(l2!=null){
				l.val=(l2.val+carry)%10;
				carry=(l2.val+carry)/10;
				l.next=new ListNode(-1);
				l=l.next;
				l.next=null;
				l2=l2.next;
			}
		}
		else{
			while(l1!=null){
				l.val=(l1.val+carry)%10;
				carry=(l1.val+carry)/10;
				l.next=new ListNode(-1);
				l=l.next;
				l.next=null;
				l1=l1.next;
			}
		}
		if(carry!=0){
			l.val=carry; 
			l.next=new ListNode(-1);
			l=l.next;
		}
		l=t;
		while(true){
			if(l.next.val==-1){
				l.next=null;
				break;
			}
			l=l.next;
		}
		return t;

	}
	public static void main(String[] args){
		ListNode l1=new ListNode(5);
		l1.next=null;
		//l1.next=new ListNode(4);
		//l1.next.next= new ListNode(3);
		//l1.next.next.next=null;
		
		ListNode l2=new ListNode(5);
		l2.next=null;
		//l2.next=new ListNode(6);
		//l2.next.next= new ListNode(4);
		//l2.next.next.next=null;
		ListNode l3=new LeetCode2().addTwoNumbers(l1, l2);
		while(l3!=null){
		   System.out.println(l3.val);
		   l3=l3.next;
		}
	}

}
