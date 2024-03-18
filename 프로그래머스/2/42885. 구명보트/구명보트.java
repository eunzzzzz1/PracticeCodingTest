import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        // 힌트 보고 푸는 중...
        // 정렬 후 가장 가벼운사람 + 가장 무거운 사람을 짝짓기
        
        int answer = 0;
        
        int leftIdx = 0;
        int rightIdx = people.length-1;
        
        Arrays.sort(people);
        
        while(leftIdx<=rightIdx) {
            if(people[leftIdx] + people[rightIdx] <= limit) {
                leftIdx++;
                rightIdx--;
            } else {
                rightIdx--;
            }
            answer++;
        }
        
        return answer;
    }
}