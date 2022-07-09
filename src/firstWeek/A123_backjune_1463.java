package firstWeek;
	import java.lang.Math;
	import java.io.BufferedReader;
	import java.io.InputStreamReader;
	import java.io.IOException;

	//class Main {
	public class A123_backjune_1463 {

	  public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int input = Integer.parseInt(br.readLine());
	    int[] store = new int[input+1];
	    store[0] = 0;
	    store[1] = 0;
	    for(int i=2;i<=input;i++){
	      store[i] = store[i-1] + 1;
	      if(i%2==0) store[i] = Math.min(store[i], store[i/2]+1);
	      if(i%3==0) store[i] = Math.min(store[i], store[i/3]+1);
	    }
	    System.out.println(store[input]);
	    br.close();
	  }
	}