// 시작 PM 7:01
// 1차 PM 8:05

import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        
        // 1. 신고 횟수를 정리한다.
        //  만약, 같은 사람이 신고했다면 넣지 않는다.
        //  - report를 정렬해서 전과 비교하면 될듯
        
        // 2. 2회가 넘어간 피신고자들을 찾는다.
        // 3. 찾으면, 그 피신고자의 신고자를 찾아서 mail Array에 +1 한다.
        
        Map<String, Integer> reportedMem = new HashMap<>();
        Arrays.sort(report);
        
        String[][] reportArray = new String[report.length][2];
        
        for(int i=0; i<report.length; i++) {
            reportArray[i] = report[i].split(" ");
        }
        
        for(int i=0; i<reportArray.length; i++) {
            
            if(i!=0 && report[i-1].equals(report[i])) continue;
            
            reportedMem.put(reportArray[i][1],
                           reportedMem.getOrDefault(reportArray[i][1],0)+1);
        }
        
        Map<String, Integer> memId = new HashMap<>();
        int[] answer = new int[id_list.length];
        
        for(int i=0; i<id_list.length; i++) {
            memId.put(id_list[i], i);
        }
        
        for(String id : id_list) {
            
            if(reportedMem.getOrDefault(id, 0)>=k) {
                
                for(int i=0; i<reportArray.length; i++) {
                    
                    if(i!=0 && report[i-1].equals(report[i])) continue;
                    
                    if(reportArray[i][1].equals(id)) {
                        answer[memId.get(reportArray[i][0])]++;
                    }
                    
                }
            }
        }
        
        return answer;
    }
}