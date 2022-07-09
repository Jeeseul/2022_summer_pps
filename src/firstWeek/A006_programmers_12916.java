package firstWeek;
import java.util.StringTokenizer;

class Solution3 {
    boolean solution(String s) {
        boolean answer = true;
        int pCount=0;
        int yCount =0;
        //StringTokenizer st = new StringTokenizer(s,"");
        String[] sp = s.split("");
        for(String t: sp){
            if(t.equals("p")||t.equals("P"))
                pCount++;
            else if(t.equals("y")||t.equals("Y"))
                yCount++;
            else continue;
        }
        if(pCount == yCount) answer = true;
        else answer = false;

        return answer;
    }
}