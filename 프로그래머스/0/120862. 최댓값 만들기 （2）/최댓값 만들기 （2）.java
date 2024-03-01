import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        
        int answer = numbers[0] * numbers[1];
        
        for(int i=0; i<numbers.length-1; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                answer = Math.max(answer, numbers[i] * numbers[j]);
                System.out.println(
                    numbers[i] + "x" + numbers[j] + "=" + (numbers[i] * numbers[j]));
            }
        }
        
        return answer;
    }
}