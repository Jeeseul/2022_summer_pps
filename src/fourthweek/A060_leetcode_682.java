package fourthweek;

public class A060_leetcode_682 {

//class Solution {
    public int calPoints(String[] ops) {
        String[] result = new String[ops.length];
        int r_index=0;
        for(int i=0;i<ops.length;i++){
            if(isNumber(ops[i])){
                result[r_index] = ops[i];
                r_index++;
                System.out.println(ops[i]);
            }else if(ops[i].equals("C")){
                result[r_index-1] = "";
                r_index--;
            }else if(ops[i].equals("D")){
                result[r_index] = Integer.toString(Integer.parseInt(result[r_index-1])*2);
                r_index++;
            }else if(ops[i].equals("+")){
                int sum = Integer.parseInt(result[r_index-1]) + Integer.parseInt(result[r_index-2]);
                result[r_index] = Integer.toString(sum);
                r_index++;
            }
        }
        int answer=0;
        int temp=0;
        while(temp<result.length&&result[temp]!=""&&result[temp]!=null){
            answer+=Integer.parseInt(result[temp]);
            temp++;
        }
        
        return answer;
    }
    public boolean isNumber(String s){
        try{
            Integer.parseInt(s);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }
}