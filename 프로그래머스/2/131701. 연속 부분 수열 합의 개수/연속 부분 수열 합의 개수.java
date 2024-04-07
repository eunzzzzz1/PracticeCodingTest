// 1차 7:18~7:51
import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int sum = 0;
        Set<Integer> set = new HashSet<>();

        for(int i=0; i<elements.length; i++) {
            for(int j=0; j<elements.length; j++) {
                for(int k=i; k<=i+j; k++) {
                    if(k>=elements.length) {
                        sum += elements[k-elements.length];
                        // System.out.print(" + " + elements[k-elements.length]);
                    } else {
                        sum += elements[k];
                        // System.out.print(" + " + elements[k]);
                    }
                }
                // System.out.println(" = " + sum);
                set.add(sum);
                sum = 0;
            }
        }
        
        return set.size();
    }
}