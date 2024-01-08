// 시작 PM 2:36
// 1차 PM 2:47

import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        
        Set<Integer> hSet = new HashSet<>();
        
        for(int i=0; i<numbers.length; i++) {
            for(int j=i+1; j<numbers.length;j++) {
                hSet.add(numbers[i]+numbers[j]);
            }
        }
        
        int[] answer = hSet.stream().sorted().mapToInt(i -> i).toArray();
        
        return answer;
        
    }
}