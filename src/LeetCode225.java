import java.util.LinkedList;
import java.util.Queue;

public class LeetCode225 {
	Queue<Integer> q=new LinkedList<Integer>();
	// Push element x onto stack.
    public void push(int x) {
        q.add(x);
    }

    // Removes the element on top of the stack.
    public void pop() {
    	int size=q.size();
        for(int i=0;i<size-1;i++){
        	q.add(q.poll());
        }
        q.poll();
    }

    // Get the top element.
    public int top() {
    	int size=q.size();
        for(int i=0;i<size-1;i++){
        	q.add(q.poll());
        }
        int t=q.poll();
    	q.add(t);
    	
        return t;
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return q.isEmpty();
    }
    public static void main(String[] args){
    	LeetCode225 l=new LeetCode225();
    	l.push(1);
    	System.out.println(l.top());
    	l.pop();
    	System.out.println(l.empty());
    }

}
