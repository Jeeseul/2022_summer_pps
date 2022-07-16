package secondWeek;

import java.util.Scanner;

public class A034_backjune_3052 {
//class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] remain = new int[42];
    
    for(int i=0;i<10;i++){
      int input = sc.nextInt();
      remain[input%42]++;
    }
    int count=0;
    for(int i=0;i<42;i++){
      if(remain[i]!=0) count++;
    }
    System.out.println(count);
  }
}