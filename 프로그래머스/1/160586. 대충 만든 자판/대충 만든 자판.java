// PM 2:19 시작
// 1차 PM 2:47
// 2차 PM 2:54

import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int n = targets.length;
        int[] answer = new int[n];
        
        for(int j=0;j<n;j++) {
            
            String[] letter = targets[j].split("");
            // System.out.println(Arrays.toString(letter));
            
            int sum = 0;
            
            for(String l : letter) {
                
                int index = keymap[0].indexOf(l)+1;

                for(int i=0;i<keymap.length;i++) {
                    if(index==0) { // [0]에서 해당하는 문자가 없었을 경우
                        index = keymap[i].indexOf(l)+1; // index를 다시 초기화
                    } else if (keymap[i].indexOf(l)+1>0) { // 문자가 있으면
                        index = Math.min(keymap[i].indexOf(l)+1,index); // index중 최소값으로 초기화
                    }
                }              

                if(index==0) {
                    sum= -1; break; //keymap 끝까지 찾았음에도 문자가 없는 경우는 sum을 -1처리
                }
                sum += index;
            }
            answer[j] = sum;
        }        
        
        return answer;
    }
}