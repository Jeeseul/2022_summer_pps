package fourthweek;

import java.util.Scanner;
import java.util.Arrays;

public class A083_backjune_10867 {

//class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int[] input = new int[num];
    for(int i=0;i<num;i++){
      input[i] = sc.nextInt();
    }
    Arrays.sort(input);
    for(int i=0;i<num;i++){
      if(i!=0&&input[i-1]==input[i]) continue;
      else{
        System.out.println(input[i]);
      }
    }
  }
}