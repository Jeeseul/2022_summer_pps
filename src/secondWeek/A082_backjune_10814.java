package secondWeek;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

public class A082_backjune_10814 {
//class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine());
    String[][] input = new String[num][2];
    
    for(int i=0;i<num;i++){
      String[] temp = br.readLine().split(" ");
      input[i][0]=temp[0];
      input[i][1] = temp[1];
      }
      Arrays.sort(input,new Comparator<String[]>(){
        @Override
        public int compare(String[] s1,String[] s2){
          return Integer.parseInt(s1[0])-Integer.parseInt(s2[0]);
        }
      });
    for(int i=0;i<num;i++){
      System.out.println(input[i][0]+" "+input[i][1]);
    }
      
    
    
  }
}