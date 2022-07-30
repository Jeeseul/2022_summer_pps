package fourthweek;

public class A043_leetcode_14 {

//class Solution {
    public String longestCommonPrefix(String[] strs) {
        int minLength=0,index=0;
        for(int i=0;i<strs.length;i++){
            if(minLength>strs[i].length()){
                minLength = strs[i].length();
                index = i;
            }   
        }
        String standardWord = strs[index];
        String st = "";//standardWord.substring(0,1);
        boolean check=true;
        int count=1;
        while(check){
            //if(standardWord.length()==0) break;
            if(standardWord.length()<count){ 
                check=false;
            }
            else{
                st = standardWord.substring(0,count);
                for(int i=0;i<strs.length;i++){
                    if(strs[i].indexOf(st)!=0){
                        check=false;
                        break;
                    }
                }
            }
            if(check==true)
                count++;
            else count--;
        }
        if(standardWord.length()==0) st="";
        else st = standardWord.substring(0,count);
        
        return st;
    }
}