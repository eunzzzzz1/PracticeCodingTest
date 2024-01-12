// 시작 PM 9:48
// 1차 PM 10:18

import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        
        List<Integer> lottosList = new ArrayList<>();
        
        for(int i=0;i<lottos.length;i++) {
            lottosList.add(lottos[i]);
        }
        
        // 1. 최저등수
        int minRank = 7;
        for(int win_num : win_nums) {
            if(lottosList.indexOf(win_num)!=-1) {
                minRank--;
            }
        }
        
        // 2. 최대등수
        int zero = 0;
        for(int lotto : lottos) {
            if(lotto==0) zero++;
        }
        
        int maxRank = minRank - zero;
        
        if(minRank == 7) minRank = 6;
        if(maxRank == 7) maxRank = 6;
        
        return new int[]{maxRank, minRank};
    }
}