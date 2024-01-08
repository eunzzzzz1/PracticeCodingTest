//시작 PM 12:50
//1차 PM 12:58
//2차 PM 1:16
//3차 PM 1:25

import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        
        String[] arr = new String[strings.length];
        Map<String, String> hMap = new HashMap<>();
        
        for (int i=0;i<strings.length;i++) {
            String a = strings[i].charAt(n)
                + strings[i].substring(0,n)
                + strings[i].substring(n+1);
                
            hMap.put(a, strings[i]);
            arr[i] = a;
        }
        
        Arrays.sort(arr);
        
        for(int i=0; i<arr.length;i++) {
            strings[i] = hMap.get(arr[i]);
        }
        
        return strings;
    }
}