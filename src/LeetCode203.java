
public class LeetCode203 {
	public ListNode removeElements(ListNode head, int val) {
        ListNode pro=new ListNode(0);
        pro.next=head;
        head=pro;
        ListNode p=head;
        while(p!=null){
            if(p.val==val){
                pro.next=p.next;
                p=p.next;
            }
            else{
                pro=p;
                p=p.next;
            }
        }
        return head.next;
    }
}
