package fourthweek;

import java.util.Scanner;
import java.util.Comparator;
import java.util.Arrays;

public class A065_backjune_11650 {

//class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int[][] arr = new int[num][2];
    for(int i=0;i<num;i++){
      arr[i][0] = sc.nextInt();
      arr[i][1] = sc.nextInt();
    }
    Arrays.sort(arr,new Comparator<int[]>(){
      @Override
      public int compare(int[] o1, int[] o2){
        if(o1[0]!=o2[0]) return o1[0]-o2[0];
        else return o1[1]-o2[1];
      }
    });
    for(int i=0;i<num;i++){
        System.out.println(arr[i][0]+" "+arr[i][1]);
    }
  }
}