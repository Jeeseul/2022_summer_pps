package secondWeek;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class A047_backjune_11721 {
//class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();
    int size = input.length();
    int temp=0;
    for(int i=0;temp<size/10+1;i+=10){
      if(temp == size/10)
        System.out.println(input.substring(i,size));
      else
        System.out.println(input.substring(i,i+10));
      temp++;
    }
    
  }
}