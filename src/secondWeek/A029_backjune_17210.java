package secondWeek;

import java.util.Scanner;

//class Main {
public class A029_backjune_17210 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long num = sc.nextLong();
    int first = sc.nextInt();
    if(num>5) System.out.println("Love is open door");
    else{
      int pri=first;
        for(int i=0;i<num-1;i++){
          if(pri == 0)
            pri = 1;
          else pri =0;
          System.out.println(pri);
        }
    }
  }
}