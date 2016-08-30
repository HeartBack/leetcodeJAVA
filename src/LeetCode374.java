
public class LeetCode374 {
	public int guessNumber(int n) {
        //System.out.println(n);
        long ll=(long )n;
        long l=solution(1,ll,(1+ll)/2);
        return (int)l;
    }
    public long solution(long start,long top,long t){
        if(guess((int)t)==0)return t;
        else if(guess((int)t)==-1){
            //System.out.println((start+t-1)/2);
            return solution(start,t-1,(start+t-1)/2);
        }
        else{
           // System.out.println((t+1+top)/2);
            return solution (t+1,top,(t+1+top)/2);
        } 
    }
    public int guess(int n){
    	return n;
    }

}
