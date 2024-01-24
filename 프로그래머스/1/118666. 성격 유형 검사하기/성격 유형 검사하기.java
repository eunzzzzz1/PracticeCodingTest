// 시작 PM 5:40

import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        
        Map<String, Integer> scoreMap = new HashMap<>();
        
        for(int i=0; i<survey.length; i++) {
            scoreMap.put(survey[i].split("")[1],
                         scoreMap.getOrDefault(survey[i].split("")[1], 0)
                         + choices[i] * -1 + 4 );
        }

        String[][] category = {{"R", "T"},
                               {"C", "F"},
                               {"J", "M"},
                               {"A", "N"}};
        
        StringBuilder sb = new StringBuilder();
        int score = 0;
        
        for(int i=0; i<category.length; i++) {
            score = scoreMap.getOrDefault(category[i][0],0)
                    - scoreMap.getOrDefault(category[i][1],0);
            
            if(score<=0) sb.append(category[i][0]);
            else sb.append(category[i][1]);
        }

        return sb.toString();
    }
}