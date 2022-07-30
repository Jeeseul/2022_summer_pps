package fourthweek;

public class A041_programmers_12951 {

//class Solution {
    public String solution(String s) {
        String answer = "";
        String[] sp = s.split("");
        for(int i=0;i<sp.length;i++){
            if(sp[i].equals(" ")){
                answer += " ";
            }else if(sp[i].charAt(0)>=48&&sp[i].charAt(0)<=57){
                answer+=sp[i];
            }else if(i!=0&&sp[i-1].equals(" ")){
                answer+=sp[i].toUpperCase();
            }else if(i==0){
                answer+=sp[i].toUpperCase();
            }else answer+=sp[i].toLowerCase();
        }
        return answer;
    }
}