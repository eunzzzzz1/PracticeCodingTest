import java.util.*;
// PM 12:03 시작
class Solution {
    public int solution(int n, int m, int[] section) {
        
        int answer = 0;
        
        int startNum = section[0];
        answer ++; // 롤러로 한 번 칠함
        
        for(int s : section) {
            if(startNum+m>s) {
                // 만약 한 번 칠한 것보다 s가 더 작으면, 이미 칠해졌다는 뜻
                continue; // 반복문 끝으로 이동
            }
            
            startNum = s;
            answer++; // 아니면 startNum을 s로 다시 지정해서 한번 칠한다.
        }
        
        return answer;
    }
}