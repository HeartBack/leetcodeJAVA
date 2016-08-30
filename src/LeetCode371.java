
public class LeetCode371 {
    public int getSum(int a, int b) {
    	if(b==0)return a;
    	int sum=a^b;
    	int carry=(a&b)<<1;
        return getSum(sum,carry);
    }
    public static void main(String[] args){
    	System.out.println(new LeetCode371().getSum(-1, 6));
    }

}
