import java.util.*;

class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> hMap = new HashMap<>();
        
        for(int a : array) {
            hMap.put(a, hMap.getOrDefault(a,0)+1);
        }
        
        int answer = 0;
        int x = 0;
        int i = 0;
        
        for(Integer a : hMap.keySet()) {
            
            if(i==0 || hMap.get(x) < hMap.get(a)) {
                x = a;
                answer = a;
                i++;
            } else if (hMap.get(x)==hMap.get(a)) {
                answer = -1;
                i++;
            }
            
        }
        
        return answer;
    }
}