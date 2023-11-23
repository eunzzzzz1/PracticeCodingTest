import java.util.*;

class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
  
        // 10:34 시작
        // 모든 공격이 끝난 직후 남은 체력
        
        int continuous = 0;
        answer = health;
        int attack = 0; // 몇 번째 공격인지
        int lastAttack = attacks[attacks.length-1][0];
        
        
        for(int i=1; i<=lastAttack; i++) {
            
            if(attacks[attack][0]==i) { // 공격을 받으면
                answer = answer - attacks[attack][1]; // 깎이는 체력 만큼 answer를 초기화
                attack = Math.min(attacks.length-1,attack+1);
                    // index 안 넘어가게 하려고 일단 이렇게 해뒀는데.. 다른 방법이 있는지 고민해보자
                continuous = 0; // 연속성공횟수를 0으로 만들기
                
                if(answer<=0) {
                    answer = -1;
                    break;
                }
                
                continue; // 그리고 나서 반복문 내의 문장을 실행하지 않고 넘어간다.
            }
            
            answer = Math.min(health,answer+bandage[1]);
            // 최대체력 health를 넘어가지 않게 해준다.
            continuous++;
            
            if(continuous==bandage[0]) { // 만약 시전시간을 모두 채우면
                answer = Math.min(health,answer+bandage[2]);
                                // 최대체력인 health 또는 추가회복량을 더해준다.
                continuous=0; // 다시 0으로 초기화
            }
        }
        
        
        
        
        
        
        
        
        return answer;
    }
}