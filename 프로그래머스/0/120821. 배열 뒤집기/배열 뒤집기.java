
import java.util.*;

class Solution {
    
    public int[] solution(int[] num_list) {
        int l = num_list.length;
        int[] answer = new int[l];
        
        for(int i=l; i>0; i--) {
            answer[l-i] = num_list[i-1];
        }
        
        return answer;
    }
}