import java.util.*;

class Solution {
    
    public int solution(int[] scoville, int K) {
        int i = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // 작은 숫자가 가장 먼저 나옴
        
        for(int s : scoville) {
            pq.add(s);
        }
        
        while(pq.peek() < K && pq.size() > 1) {
            int temp = pq.poll() + pq.poll() * 2;
            pq.add(temp);
            i++;
        }
        
        if(pq.peek() < K) return -1;

        return i;
    }

}