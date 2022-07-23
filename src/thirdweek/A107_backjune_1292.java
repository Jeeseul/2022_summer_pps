package thirdweek;

import java.util.Scanner;

public class A107_backjune_1292 {
//class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] num = new int[1001];
    int standard=1;
    int count=1;
    int result=0;
    for(int i=1;i<1001;i++){
      if(count==0){
        standard++;
        count = standard;
      }
      num[i] = standard;
      count--;
    }
    int low = sc.nextInt();
    int high = sc.nextInt();
    for(int j=low;j<=high;j++){
      result += num[j];
    }
    System.out.println(result);
  }
}