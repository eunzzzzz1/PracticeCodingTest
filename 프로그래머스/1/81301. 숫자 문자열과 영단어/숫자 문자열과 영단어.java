// 시작 AM 11:13
// 1차 AM 11:28

import java.util.*;

class Solution {
    public int solution(String s) {
        
        Map<Integer,String> hMap = new HashMap<>();
        
        hMap.put(0, "zero");
        hMap.put(1, "one");
        hMap.put(2, "two");
        hMap.put(3, "three");
        hMap.put(4, "four");
        hMap.put(5, "five");
        hMap.put(6, "six");
        hMap.put(7, "seven");
        hMap.put(8, "eight");
        hMap.put(9, "nine");
        
        for(int i=0;i<hMap.size();i++) {
            s = s.replaceAll(hMap.get(i), Integer.toString(i));
        }
        
        return Integer.parseInt(s);
    }
}