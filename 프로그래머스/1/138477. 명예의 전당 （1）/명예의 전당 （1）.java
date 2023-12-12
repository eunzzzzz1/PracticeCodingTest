// PM 9:40 시작
// 1차 PM 10:07

import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int lth = score.length;
        int[] answer = new int[lth];
    
        answer[0] = score[0];
        
        for(int i=1; i<lth; i++) {
            
            if(i<k) {
                answer[i] = Math.min(answer[i-1],score[i]);
                
            } else {
                
                int[] arr = new int[i+1];
                for(int j=0;j<i+1;j++) {
                    arr[j] = score[j];
                }
                
                Arrays.sort(arr);
                answer[i] = arr[i-k+1];
            }
        }
        return answer;
        
        
    }
}