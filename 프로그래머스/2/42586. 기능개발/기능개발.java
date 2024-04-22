import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        List<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        
        int max = 0;
        
        for(int i=0; i<progresses.length; i++) {
            
            if((100-progresses[i])%speeds[i]>0) {
                progresses[i] = (100-progresses[i])/speeds[i] + 1;
            } else {
                progresses[i] = (100-progresses[i])/speeds[i];
            }
            
            queue.add(progresses[i]-max);
            max = Math.max(progresses[i],max);
            
        }
        
        while(queue.size()!=0) {
            int n = 1;
            queue.poll();
            
            while(queue.size()!=0 && queue.peek()<=0) {
                queue.poll();
                n++;
            }
            
            list.add(n);
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}