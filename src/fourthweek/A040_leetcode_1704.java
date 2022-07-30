package fourthweek;

public class A040_leetcode_1704 {

//class Solution {
    public boolean halvesAreAlike(String s) {
        String a = s.substring(0,s.length()/2);
        String b = s.substring(s.length()/2,s.length());
        int countA=0;
        int countB=0;
        
        for(int i=0;i<a.length();i++){
            char aa = a.charAt(i);
            char bb = b.charAt(i);
            if(aa=='a'||aa=='e'||aa=='i'||aa=='o'||aa=='u'||aa=='A'||aa=='E'||aa=='I'||aa=='O'||aa=='U') countA++;
             if(bb=='a'||bb=='e'||bb=='i'||bb=='o'||bb=='u'||bb=='A'||bb=='E'||bb=='I'||bb=='O'||bb=='U') countB++;
        }
        if(countA==countB) return true;
        else return false;
    }
}