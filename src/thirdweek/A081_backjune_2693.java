package thirdweek;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class A081_backjune_2693 {
//class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine());
    for(int i=0;i<num;i++){
      String[] input = br.readLine().split(" ");
      int[] inputInt=new int[input.length];
      for(int j=0;j<input.length;j++){
        inputInt[j]= Integer.parseInt(input[j]);
      }
      Arrays.sort(inputInt);
      System.out.println(inputInt[7]);
    }
  }
}