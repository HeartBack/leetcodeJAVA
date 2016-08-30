import java.util.HashMap;
import java.util.Map;

public class LeetCode13 {
	public int romanToInt2(String s) {
		int len=s.length();
		Map<Character,Integer> m=new HashMap<Character,Integer>();
		m.put('I',1);
		m.put('V',5);
		m.put('X',5);
		m.put('L',5);
		m.put('C',5);
		m.put('D',5);
		m.put('M',5);
		char pro=0,mid=0;
		int sum=0;
		for(int i=0;i<len-1;i++){
			pro=s.charAt(i);
			mid=s.charAt(i+1);
			if(m.get(pro)<m.get(mid)){
				sum+=-m.get(pro);
			}else{
				sum+=m.get(pro);
			}
		}
		sum+=m.get(s.charAt(len-1));
		return sum;

	}
	public int romanToInt(String s) {
		int len=s.length();
		char c=0;
		int temp=0;
		int sum=0;
	    for(int i=0;i<len;i++){
	    	c=s.charAt(i);
	    	switch(c){
	    	case 'I':
	    		if(temp<1){
	    			sum+=-temp-temp;
	    			
	    		}
	    		sum+=1;
	    		temp=1;
	    		break;
	    	case 'V':
	    		if(temp<5){
	    			sum+=-temp-temp;
	    			
	    		}
	    		sum+=5;
	    		temp=5;
	    		break;
	    	case 'X':
	    		if(temp<10){
	    			sum+=-temp-temp;
	    			
	    		}
	    		sum+=10;
	    		temp=10;
	    		break;
	    	case 'L':
	    		if(temp<50){
	    			sum+=-temp-temp;
	    			
	    		}
	    		sum+=50;
	    		temp=50;
	    		break;
	    	case 'C':
	    		if(temp<100){
	    			sum+=-temp-temp;
	    			
	    		}
	    		sum+=100;
	    		temp=100;
	    		break;
	    	case 'D':
	    		if(temp<500){
	    			sum+=-temp-temp;
	    			
	    		}
	    		sum+=500;
	    		temp=500;
	    		break;
	    	case 'M':
	    		if(temp<1000){
	    			sum+=-temp-temp;
	    			
	    		}
	    		sum+=1000;
	    		temp=1000;
	    		break;
	    	}
	    }
	    return sum;
	}

}
