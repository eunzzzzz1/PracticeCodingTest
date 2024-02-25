import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String s) {
        Map<Character, Integer> hMap = new LinkedHashMap<>();
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        
        for(char a : arr) {
            hMap.put((char)a, hMap.getOrDefault((char)a, 0)+1);
        }
        
        StringBuffer sb = new StringBuffer();
        
        for(char a : hMap.keySet()) {
            if(hMap.get(a)==1) sb.append((char)a);
        }
        
        if(sb.length()==0) return "";

        return sb.toString();
    }
}