package secondWeek;

import java.util.Scanner;
import java.util.Arrays;

class Solution {
    public int countPrimes(int n) {
        int result =0;
        boolean[] store= new boolean[n];
        Arrays.fill(store,true);
        Scanner sc = new Scanner(System.in);

       for(int i=2;i<n; i++) {
            for(int j=i*2;j<n;j+=i){
                store[j] = false;
            }
       }
        for(int i=2;i<n;i++){
            result += store[i]?1:0;
        }

        return result;
    }
}