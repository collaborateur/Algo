import java.util.Stack;


public class Parenthese {
	
	public boolean check(String s){
		Stack<Character>st=new Stack<Character>();
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='('){
				st.add(s.charAt(i));
			}
			if(s.charAt(i)==')'){
				if(st.isEmpty()){
					return false;
				}
				st.pop();
//				if(st.peek()=='('){
//					st.pop();
//				}
			}
         }
		return(st.isEmpty());
	}
	
	public static void main(String[]args){
		
		
	}

}
