package fourthweek;

public class A134_leetcode_2000 {

//class Solution {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(Character.toString(ch));
        if(index == -1) return word;
        else{
            String[] s = word.substring(0,index+1).split("");
            String reverse = "";
            for(int i=0;i<s.length;i++){
                reverse = s[i] + reverse;
            }
            word = reverse + word.substring(index+1,word.length());
            return word;
        }
    }
}