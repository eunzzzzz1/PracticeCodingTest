import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        
        List<Integer> answer = new ArrayList<>();
        
        for(int i=0; i<numlist.length; i++) {
            if(i==0) {
                answer.add(numlist[i]);
                continue;
            }
            
            for(int j=0; j<answer.size(); j++) {
                if(Math.abs(answer.get(j)-n) > Math.abs(numlist[i]-n)) {
                    answer.add(j, numlist[i]);
                    break;
                } else if (Math.abs(answer.get(j)-n) == Math.abs(numlist[i]-n)
                            && answer.get(j) < numlist[i]) {
                    answer.add(j, numlist[i]);
                    break;
                }
            }
            
            if(answer.indexOf(numlist[i])==-1) answer.add(numlist[i]);
        }
    
        return answer.stream().mapToInt(i->i).toArray();
    }
}