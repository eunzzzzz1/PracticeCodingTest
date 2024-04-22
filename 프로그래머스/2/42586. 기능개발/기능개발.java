import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        int[] day = new int[progresses.length];
        List<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        
        int max = 0;
        
        for(int i=0; i<progresses.length; i++) {
            
            while(progresses[i]<100) {
                progresses[i] += speeds[i];
                day[i]++;
            }
            queue.add(day[i]); 
        }
        
        while(queue.size()!=0) {
            int n = 1;
            int a = queue.poll();
            
            while(queue.size()!=0 && a >= queue.peek()) {
                queue.poll();
                n++;
            }
            list.add(n);
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}