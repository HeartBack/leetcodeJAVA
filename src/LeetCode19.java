
public class LeetCode19 {
	public ListNode removeNthFromEnd(ListNode head, int n) {
        if(n==0)return head;
        ListNode start=new ListNode(0);
        start.next=head;
        int count=1;
        ListNode p=head,q=start;
        while(p.next!=null){
            if(count>=n){
                q=q.next;
            }
            ++count;
            p=p.next;
        }
        
        q.next=q.next.next;
        return start.next;
    }
}
