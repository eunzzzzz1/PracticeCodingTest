import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        List<Integer> list = new ArrayList<>();
        Queue<Double> queue = new LinkedList<>();
        
        double max = 0;
        
        for(int i=0; i<progresses.length; i++) {
            double a = Math.ceil((double)(100-progresses[i])/(double)speeds[i]);
            
            queue.add(a-max);
            max = Math.max(a,max);  
        }
        
        while(queue.size()!=0) {
            int n = 1;
            System.out.println("뽑은 수 : " + queue.poll());
            
            while(queue.size()!=0 && queue.peek()<=0) {
                System.out.println("연달아 뽑은 수 : " + queue.poll());
                n++;
            }
            
            list.add(n);
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}