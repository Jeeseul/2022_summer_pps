package thirdweek;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class A035_backjune_5355 {
//class Main {
  public static void main(String[] args) throws IOException {
    // Scanner sc = new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    for(int i=0;i<n;i++){
      String[] input= br.readLine().split(" ");
      double answer =  Double.parseDouble(input[0]);
      for(int j=1;j<input.length;j++){
        if(input[j].equals("@")){
          answer *= 3;
        }else if(input[j].equals("%")){
          answer +=5;
        }else if(input[j].equals("#")){
          answer -= 7;
        }
      }
      System.out.printf("%.2f\n",answer);
    }
  }
}