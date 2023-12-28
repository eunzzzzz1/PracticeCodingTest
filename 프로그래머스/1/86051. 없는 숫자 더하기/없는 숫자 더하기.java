import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int j = 0;
        
        Arrays.sort(numbers);
        
        for(int i=0;i<10;i++) {
            
            if(j<numbers.length && numbers[j]==i) {
                j++;
                continue;
            }
            
            answer += i;
        }
        
        return answer;
    }
}