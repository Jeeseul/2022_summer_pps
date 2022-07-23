package thirdweek;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

//public class backjune4659 {
class Main {
  public static void main(String[] args) throws IOException {
    Main m = new Main();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input="";
    while(!input.equals("end")){
      input = br.readLine();
      boolean isAccepted=true;
      if(input.equals("end")) break;
      else{
        if(m.isContain(input)){
          String[] inputs = input.split("");
          if(inputs.length==1) isAccepted = true;
          //System.out.println("<"+input+"> is acceptable.");
          for(int i=0;i<inputs.length;i++){
            if(i>0){//ee나 oo 외에 두개 연속인지 체크
              if(m.checkSeq(inputs, i)) isAccepted = false;
                //System.out.println("<"+input+"> is not acceptable.");
            }
            //이제 자음모음 연속 체크
            if(m.isConstant(inputs,i)) isAccepted = false;
              //System.out.println("<"+input+"> is not acceptable.");
          }
        }else isAccepted = false;//System.out.println("<"+input+"> is not acceptable.");
      }
      if(isAccepted) System.out.println("<"+input+"> is acceptable.");
      else System.out.println("<"+input+"> is not acceptable.");
    }
  }

  
  boolean isContain(String s){
    if(s.contains("a")
           ||s.contains("e")
           ||s.contains("i")
           ||s.contains("o")
           ||s.contains("u")) return true;
    else return false;
  }
  boolean checkSeq(String[] s,int i){
    String pre = s[i-1];
    String now = s[i];
    if(now.equals("e")
        ||now.equals("o")) return false;
    else if(now.equals(pre)) return true;
    else return false;
      //System.out.println("<"+input+"> is not acceptable.");
  }
  boolean isConstant(String[] s,int i){
    if(isVowel(s[i])) {//모음이고
      //이전에도 모음이었으면
      if(i>1&&isVowel(s[i-1])&&isVowel(s[i-2])) 
        return true;
      else return false;
    }
    else if(!isVowel(s[i])){
      if(i>1&&!isVowel(s[i-1])&&!isVowel(s[i-2])) return true;
      else return false;
    }else return false;
  }

  boolean isVowel(String s){
    if(s.equals("a")
           ||s.equals("e")
           ||s.equals("i")
           ||s.equals("o")
           ||s.equals("u")) return true;
    else return false;
  }
}