// 시작 PM 2:40
// 1차 PM 3:52
// 2차 PM 5:08

import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        
        String[][] giftArr = new String[gifts.length][2];
        
        for(int i=0;i<giftArr.length; i++) {
            giftArr[i] = gifts[i].split(" ");
        }
        
        Map<String, Integer> giftScoreMap = new HashMap<>();
        
        for(int i=0; i<giftArr.length; i++) {
            giftScoreMap.put(
                giftArr[i][0],giftScoreMap.getOrDefault(giftArr[i][0],0) +1);
            giftScoreMap.put(
                giftArr[i][1],giftScoreMap.getOrDefault(giftArr[i][1],0) -1);
        }
        
        int[] score = new int[friends.length];
        
        for(int i=0; i<friends.length; i++) {
            
            final String friend = friends[i];
            
            for(String f : friends) {
                
                int giveScore
                    = (int) Arrays
                    .stream(gifts)
                    .filter(s -> s.equals(friend + " " + f))
                    .count();
                
                int takeScore
                    = (int) Arrays
                    .stream(gifts)
                    .filter(s -> s.equals(f + " " + friend))
                    .count();
                
                if(giveScore > takeScore) {
                    score[i] ++;
                } else if (giveScore - takeScore == 0
                           && giftScoreMap.getOrDefault(friend,0)
                            > giftScoreMap.getOrDefault(f,0)) {
                    score[i] ++;
                }
            }
        }
        
        answer = Arrays.stream(score).max().getAsInt();
        
        return answer;
    }
}