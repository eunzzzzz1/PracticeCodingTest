import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        Map<String, Integer> hMap = new HashMap<>();
        
        for(String[] a : clothes) {
            hMap.put(a[1], hMap.getOrDefault(a[1], 0)+1);
        }
        
        for(String a : hMap.keySet()) {
            answer *= hMap.get(a) + 1;
        }
        
        return answer - 1;

    }
}