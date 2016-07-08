
public class LeetCode344 {
	public String reverseString(String s) {
		int size=s.length();
		char[] c= new char[size];
		for ( int i=0;i<size;++i){
			char temp=s.charAt(i);
			c[size-i-1]=temp;
		}
		return String.valueOf(c);
	}
	public String reverseString5(String s) {
		char[] c= s.toCharArray();
		int length=c.length;
		int l=length/2;
		for ( int i=0;i<l;++i){
			char temp=c[i];
			c[i]=c[c.length-i-1];
			c[c.length-i-1]=temp;
		}
		return String.valueOf(c);
	}

}
