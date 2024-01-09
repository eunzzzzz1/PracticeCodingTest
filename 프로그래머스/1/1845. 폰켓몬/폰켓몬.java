// 시작 PM 4:36
// 1차 PM 4:42

import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        HashSet<Integer> hSet = new HashSet<>();
        Arrays.sort(nums);
        
        for(int n : nums) {
            hSet.add(n);
            if(hSet.size()==nums.length/2) break;
        }
        
        return hSet.size();
    }
}