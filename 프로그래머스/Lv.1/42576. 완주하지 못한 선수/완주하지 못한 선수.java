// 시작 PM 13:19

import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        
        String answer = "";
        Map<String, Integer> participantMap = new HashMap<>();
        
        for(int i=0;i<participant.length;i++) {
            participantMap.put(participant[i], 
                               participantMap.getOrDefault(participant[i],0)+1);
        }
        
        for(String com : completion) {
            participantMap.put(com, participantMap.get(com)-1);
        }
        
        for(Map.Entry<String,Integer> entry : participantMap.entrySet()) {
            if(entry.getValue()==1) {
                answer = entry.getKey();
                break;
            }
        }
        
        return answer;
    }
}