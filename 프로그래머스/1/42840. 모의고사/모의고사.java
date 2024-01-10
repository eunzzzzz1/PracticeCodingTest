// 시작 PM 8:56
// 1차 PM 9:23

import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        
        int[] score = new int[3];
        
        int[] arr1 = {2,1,2,3,2,4,2,5};
        int[] arr2 = {3,3,1,1,2,2,4,4,5,5};
        
        for (int i=0; i<answers.length; i++) {
            if((i%5+1)==answers[i]) score[0]++;
            if(arr1[i%arr1.length] == answers[i]) score[1]++;
            if(arr2[i%arr2.length] == answers[i]) score[2]++;
        }
        
        int max = Math.max(score[0], Math.max(score[1], score[2]));
        
        List<Integer> list = new ArrayList<>();
        
        for(int i=1; i<=3; i++) {
            if(score[i-1]==max) list.add(i);
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}