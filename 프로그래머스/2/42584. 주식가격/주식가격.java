import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> s = new Stack<>();
        
        // prices를 순회하면서, 차례로 stack에 인덱스를 담아둔다.
        // stack에 남아있는 인덱스들의 값과 prices[i]를 비교해보았을 때,
        // prices[i] 값이 더 작다면 (=값이 떨어졌다면) 인덱스간의 차를 통해 지속시간을 계산한다.
        // stack 에는 prices[i] 보다 작은 값들의 인덱스들만이 담기게 된다. (값이 떨어지지않은 것들)
        
        int i = 0;
        s.push(i);
        
        for(i=0; i<prices.length; i++) {
            while(!s.isEmpty() && prices[i] < prices[s.peek()]) {
                int temp = s.pop();
                answer[temp] = i - temp;
            }
            s.push(i);
        }
        
        while(!s.isEmpty()) {
            int temp = s.pop();
            answer[temp] = i - 1 - temp;
        }
        
        return answer;
    }
}