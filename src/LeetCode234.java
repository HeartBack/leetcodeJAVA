
public class LeetCode234 {
	public boolean isPalindrome(ListNode head) {
        if(head==null)return true;
        int n=0;
        ListNode p=head;
        while(p!=null){
            ++n;
            p=p.next;
        }
        if(n==1)return true;
        ListNode t=null,q=null;
        p=null;
        q=head;
        int c=0;
        while(c<n/2){
            ++c;
            t=q.next;
            q.next=p;
            p=q;
            q=t;
        }
        if(n%2==1){
            q=q.next;
        }
        while(q!=null){
             if(q.val!=p.val)return false;
             q=q.next;
             p=p.next;
        }
        return true;
    }
}
