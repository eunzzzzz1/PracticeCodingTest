import java.util.stream.*;

class Solution {
    public int[] solution(int num, int total) {
        int i= num * (-1);
        
        while(true) {
            int sum = 0;
            for(int j=0; j<num; j++) sum += i+j;
            if(sum==total) break;
            i++;
        }

        return IntStream.range(i, i+num).map(n -> n).toArray();
    }
}