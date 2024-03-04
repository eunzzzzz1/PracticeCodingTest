import java.util.*;

class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        int answer = 0;
        
        // 1. sides[1] 이 가장 긴 변일경우 => i<=sides[1] && (sides[0]+x) > sides[1]
        int i = sides[1]-sides[0]+1;
        while(i<=sides[1] && (sides[0]+i)>sides[1]) {
            answer++;
            i++;
        }
        
        // 2. i가 가장 긴 변일경우 => sides[1] <= i && (sides[0]+sides[1]) > i
        // 위에서 가장 긴 변과 sides[1]이 같을 경우를 가정해주었으니까, 여기서는 빼주기
        i = sides[0]+sides[1]-1;
        while(sides[1]<i && (sides[0]+sides[1]) > i) {
            answer++;
            i--;
        }
        
        return answer;
    }
}