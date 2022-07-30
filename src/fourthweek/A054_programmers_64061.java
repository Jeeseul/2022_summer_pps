package fourthweek;
import java.util.Stack;

public class A054_programmers_64061 {

//	class Solution {
	    public int solution(int[][] board, int[] moves) {
	        Stack<Integer> st = new Stack<>();
	        int answer = 0;
	        for(int i=0;i<moves.length;i++){
	            int crain = moves[i]-1;
	            for(int j=0;j<board.length;j++){
	                if(board[j][crain]==0) continue;
	                else{
	                    if(st.empty())
	                        st.push(board[j][crain]);
	                    else if(st.peek()!=board[j][crain])
	                        st.push(board[j][crain]);
	                    else {
	                        answer+=2;
	                        st.pop();
	                    }
	                    board[j][crain]=0;
	                    break;
	                }
	            }
	        }
	        return answer;
	    }
	}
