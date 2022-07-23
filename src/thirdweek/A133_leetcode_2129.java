package thirdweek;

public class A133_leetcode_2129 {
//class Solution {
    public String capitalizeTitle(String title) {
        String[] sp = title.split(" ");
        String result="";
        for(int i=0;i<sp.length;i++){
            sp[i] = sp[i].toLowerCase();
            if(sp[i].length()<3) continue;
            char temp = (char)(sp[i].charAt(0) - 32);
            sp[i] = Character.toString(temp) + sp[i].substring(1);
        }
        for(int i=0;i<sp.length;i++){
            result += sp[i];
            if(i==sp.length-1) return result;
            result += " ";
        }
        return result;
    }
}