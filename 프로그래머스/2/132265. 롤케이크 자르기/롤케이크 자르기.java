import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;

        int[] arr1 = new int[10000];
        int[] arr2 = new int[10000];
        
        int max = 0;
        
        for(int a : topping) {
            arr1[a-1]++;
            max = Math.max(a, max);
        }
        
        int n = 0;
        int m = 0;
        
        for(int i=0; i<max; i++) {
            if(arr1[i] != 0) n++;
        }

        for(int a : topping) {
            
            arr1[a-1]--;
            arr2[a-1]++;
            
            if(arr1[a-1] == 0) n--;
            if(arr2[a-1] == 1) m++;
            
            if(n==m) answer++;
            if(n<m) break;
        }
        
        return answer;
    }
}