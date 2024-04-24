// PM 1:08 ~ 1:50

import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0; i<priorities.length; i++) {
            queue.add(i);
        }
        
        while(!queue.isEmpty()) {
            // 1. queue의 가장 상단값을 꺼낸다.
            int beforeSize = queue.size();
            int top = queue.poll();
            
            // 2. 전체와 우선순위를 비교한다.
            for(int index : queue) {
                // 만약 top보다 우선순위가 큰 수가 있으면, top을 queue에 추가하고 for문 빠져나오기
                if(priorities[index] > priorities[top]) {
                    queue.add(top);
                    break;
                }
            }
            
            // beforeSize와 현재 queue의 size가 다르다 = 프로세스를 실행했다
            if(beforeSize != queue.size()) {
                answer++;
                if (top == location) return answer;
            }
        }

        return answer;
    }
}