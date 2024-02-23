import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        
        int m = Integer.MAX_VALUE;
        int answer = Integer.MAX_VALUE;
        
        for(int a : array) {
            if(Math.abs(n-a)<m) {
                m = Math.abs(n-a);
                answer = a;
            } else if (Math.abs(n-a)==m) {
                answer = Math.min(a, answer);
            }
        }
        
        return answer;
    }
}