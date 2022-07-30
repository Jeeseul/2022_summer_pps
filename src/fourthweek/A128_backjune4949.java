package fourthweek;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;
//public class A128_backjune4949 {

class Main {
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Main m = new Main();
    while(true){
      String input=br.readLine();
      if(input.equals(".")) break;
      else System.out.println(m.solution(input));
    }
  }
  String solution(String s){
    Stack<Character> st = new Stack<>();
    for(int i=0;i<s.length();i++){
      char temp = s.charAt(i);
      if(temp=='(') st.push(temp);
      else if(temp==')'){
        if(st.empty()||st.peek() != '(') return "no";
        st.pop();
      } else if(temp=='[') st.push(temp);
      else if(temp==']'){
        if(st.empty()||st.peek() != '[') return "no";
        st.pop();
      }else continue;
    }
    if(st.empty()) {
			return "yes";
		}
		else {
			return "no";
		}
  }
    
}