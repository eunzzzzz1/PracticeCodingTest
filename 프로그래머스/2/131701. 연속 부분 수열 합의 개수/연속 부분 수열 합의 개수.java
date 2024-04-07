// 1차 7:18~7:51
import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int sum = 0;
        Set<Integer> set = new HashSet<>();

        for(int i=0; i<elements.length; i++) {
            for(int j=i; j<i+elements.length; j++) {
                sum += elements[j%elements.length];
                set.add(sum);
            }
            sum = 0;
        }
        
        return set.size();
    }
}