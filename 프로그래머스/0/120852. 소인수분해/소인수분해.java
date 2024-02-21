import java.util.*;

class Solution {
    public int[] solution(int n) {
        
        int m = 2;
        List<Integer> answerList = new ArrayList();
        
        while(n!=1) {
            if(n%m==0) {
                if(!answerList.contains(m)) answerList.add(m);
                n /= m;
            } else {
                m++;
            }
        }
        
        return answerList.stream().mapToInt(i -> i).toArray();
    }
}