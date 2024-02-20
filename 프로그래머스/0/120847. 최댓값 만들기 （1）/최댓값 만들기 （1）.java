import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        for(int i=0; i<numbers.length-1; i++) {
            for(int j=1; j<numbers.length; j++) {
                if(i==j) continue;
                answer = Math.max(numbers[i] * numbers[j], answer);
            }
        }
        
        return answer;
    }
}