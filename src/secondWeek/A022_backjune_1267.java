package secondWeek;

import java.util.Scanner;
import java.lang.Math;

public class A022_backjune_1267 {
//class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int input1 = sc.nextInt();
    int[] time = new int[input1];

    for(int i=0;i<input1;i++){
      time[i]=sc.nextInt();
    }
    //영식요금제 - 30초마다 10원
    int ys =0;
    for(int i=0;i<input1;i++){
      if(time[i]%30 != 0)
        ys += (time[i]/30)*10+10;
      else
        ys += ((time[i]/30)+1)*10;
    }
    //민식요금제 = 60초마다 15원
    int ms=0;
    for(int i=0;i<input1;i++){
      if(time[i]%60 != 0)
        ms += (time[i]/60)*15+15;
      else
        ms += ((time[i]/60)+1)*15;
    }
    int fee=0;
    String result;
    if(ys != ms){
      fee = Math.min(ys,ms);
      if(fee == ys) result="Y";
      else result = "M";
    }else{
      fee = ys;
      result = "Y M";
    }

    System.out.println(result+" "+fee);
  }
}