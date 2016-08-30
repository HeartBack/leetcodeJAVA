import java.util.Stack;

public class LeetCode20 {
	public boolean isValid(String s) {
		Stack<Character> stack=new Stack<Character>();
		int len=s.length();
		for(int i=0;i<len;i++){
			char c=s.charAt(i);
			switch(c){
			case '{':stack.push(c);break;
			case '[':stack.push(c);break;
			case '(':stack.push(c);break;
			case '}':
				if(!stack.isEmpty()){
					if(stack.pop()!='{')return false;
				}
				else  return false;
				break;
			case ']':
				if(!stack.isEmpty()){
					if(stack.pop()!='[')return false;
				}
				else  return false;
				break;
			case ')':
				if(!stack.isEmpty()){
					if(stack.pop()!='(')return false;
				}
				else  return false;
				break;
			}
		}
		if(!stack.isEmpty())return false;
		return true;

	}
}
