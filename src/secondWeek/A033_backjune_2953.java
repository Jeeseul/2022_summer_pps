package secondWeek;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class A033_backjune_2953 {
//class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int max_score=0;
    int max_per=0;
    for(int i=1;i<=5;i++){
      String[] input = br.readLine().split(" ");
      int sum=0;
      for(int j=0;j<4;j++){
        sum += Integer.parseInt(input[j]);
      }
      if(sum>max_score){
        max_score = sum;
        max_per=i;
      }
    }
    System.out.println(max_per+" "+max_score);
  }
}