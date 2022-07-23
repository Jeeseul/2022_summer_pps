package thirdweek;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class A032_backjune_2775 {
//class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[][] apart = new int[15][15];
    //먼저 모든 [층][호수]에 사람 수 계산해서 넣기
    for(int i=0;i<15;i++){
      for(int j=0;j<15;j++){
        if(j==0){
          apart[i][j] = 0;
          continue;
        }else if(i==0){
          apart[i][j] = j;
        }else{
          apart[i][j] = apart[i-1][j]+apart[i][j-1];
        }
      }
    }
    int cases = Integer.parseInt(br.readLine());
    for(int i=0;i<cases;i++){
      int k = Integer.parseInt(br.readLine());
      int n = Integer.parseInt(br.readLine());
      System.out.println(apart[k][n]);
    }
  }
}