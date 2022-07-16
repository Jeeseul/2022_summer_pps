package secondWeek;

import java.util.Scanner;
import java.util.Arrays;

public class A104_backjune_14487 {
//class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int[] cost = new int[num];
    int result=0;
    
    for(int i=0;i<num;i++){
      cost[i] = sc.nextInt();
    }
    Arrays.sort(cost);
    for(int i=0;i<num-1;i++){
      result += cost[i];
    }
    System.out.println(result);
  }
}