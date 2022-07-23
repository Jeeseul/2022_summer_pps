package thirdweek;

import java.util.Scanner;

public class A130_backjune_10773 {
//class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num=sc.nextInt();
    int[] result = new int[num];
    int answer=0;
    int top=0;
    for(int i=0;i<num;i++){
      int temp = sc.nextInt();
      if(temp!=0)
        result[top++] = temp;
      else{
        result[top-1] =0;
        top--;
      }
    }
    for(int i=0;i<num;i++){
     answer += result[i]; 
    }
    System.out.println(answer);
  }
}