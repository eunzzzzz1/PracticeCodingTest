// 시작 PM 8:56
// 1차 PM 9:23

import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        
        Map<Integer, Integer> hMap = new HashMap<>();
        hMap.put(1, 0);
        hMap.put(2, 0);
        hMap.put(3, 0);
        
        int[] arr1 = {2,1,2,3,2,4,2,5};
        int[] arr2 = {3,3,1,1,2,2,4,4,5,5};
        
        for (int i=0; i<answers.length; i++) {
            if((i%5+1)==answers[i]) hMap.put(1, hMap.get(1)+1);
            if(arr1[i%arr1.length] == answers[i]) hMap.put(2, hMap.get(2)+1);
            if(arr2[i%arr2.length] == answers[i]) hMap.put(3, hMap.get(3)+1);
        }
        
        int max = Math.max(hMap.get(1), Math.max(hMap.get(2), hMap.get(3)));
        
        List<Integer> list = new ArrayList<>();
        
        for(int n : hMap.keySet()) {
            if(hMap.get(n)==max) list.add(n);
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}