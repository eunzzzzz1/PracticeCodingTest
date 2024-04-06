//1차 PM 4:00 ~ 4:45
//2차 ~PM 4:55

import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> size = new HashMap<>();
        
        for(int a : tangerine) {
            size.put(a, size.getOrDefault(a,0)+1);
        }
        
        List<Integer> list = new ArrayList<>(size.keySet());
        Collections.sort(list, (v1, v2) -> (size.get(v2).compareTo(size.get(v1))));
        
        for(int a : list) {
            
            if(k<=0) {
                break;   
            }
            
            k -= size.get(a);
            answer++;

        }
        
        return answer;
    }
}