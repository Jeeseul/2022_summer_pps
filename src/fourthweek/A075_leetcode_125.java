package fourthweek;

public class A075_leetcode_125 {

//class Solution {
    public boolean isPalindrome(String s) {
        char[] sen = new char[s.length()];
        int count=0;
        for(int i=0;i<s.length();i++){
            char temp = s.charAt(i);
            if((temp>96&&temp<123)||(temp>47&&temp<58)){ //소문자이면
                sen[count++] = temp;
            }else if(temp>64&&temp<91){
                sen[count++] = (char)(temp+32);//대문자면 소문자로 바꿔서 저장
            }else continue;
        }
        int limit = count;

        for(int j=0;j<limit/2;j++){
            if(sen[j]!=sen[count-1]) return false;
            else count--;
        }
        return true;
    }
}