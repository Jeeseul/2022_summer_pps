	import java.io.BufferedReader;
	import java.io.InputStreamReader;
	import java.io.IOException;

	//class Main {
	public class A052_backjune_8958 {
  
	public static void main(String[] args) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int num = Integer.parseInt(br.readLine());
	    int[] result = new int[num];
	    for(int i=0;i<num;i++){
	      String input = br.readLine();
	      int score=0;
	      int weight =0;
	      String[] ox = input.split("");
	      for(int j=0;j<ox.length;j++){
	        if(ox[j].equals("O")) {
	          weight++;
	          score = score + weight;
	        }else{
	          weight = 0;
	        }
	      }
	      result[i] = score;
	    }
	    for(int i=0;i<num;i++){
	      System.out.println(result[i]);
	    }
	    br.close();
	  }
	}