import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        Map<Integer, Integer> hMap = new HashMap<>();
        int[] emergency_copy = emergency.clone();
        int[] answer = new int[emergency.length];
        
        Arrays.sort(emergency_copy);
        
        for(int i=emergency.length-1; i>=0; i--) {
            hMap.put(emergency_copy[i], emergency.length-i);
        }
        
        for(int i=0; i<emergency.length; i++) {
            answer[i] = hMap.get(emergency[i]);
        }
        
        return answer;
    }
}