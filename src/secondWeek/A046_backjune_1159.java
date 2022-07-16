package secondWeek;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class A046_backjune_1159 {
//class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine());
    int[] count = new int[26];
    for(int i=0;i<num;i++){
      String name = br.readLine();
      count[name.charAt(0)-'a']++;
    }
    int notOverFive=0;
    for(int i=0;i<26;i++){
      if(count[i]>=5) System.out.print((char)(i+'a'));
      else notOverFive++;
    }
    if(notOverFive==26) System.out.print("PREDAJA");
  }
}