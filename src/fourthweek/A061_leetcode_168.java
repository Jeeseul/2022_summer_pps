package fourthweek;

public class A061_leetcode_168 {

//class Solution {
    public String convertToTitle(int columnNumber) {
        String result="";
        
        while(columnNumber/26>0&&columnNumber!=26){
            int remain = columnNumber%26;
            if(remain==0) {
                result = "Z" + result;
                columnNumber = columnNumber -26;
            }
            else{
                char temp = (char)(remain+64);
                result = Character.toString(temp) + result;
            }
            columnNumber /= 26;
        }
        if(columnNumber!=0){
            char temp = (char)(columnNumber+64);
            result = Character.toString(temp) + result;
        }
        
        return result;
    }
}