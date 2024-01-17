import java.util.*;

class Solution {
    public int[] solution(int n) {
        
        int length = 0;
        
        if(n%2==0) length = n/2;
        else length = n/2+1;
        
        int[] array = new int[length];
        
                    
        for(int i=0; i<array.length; i++) {
            array[i] = 2*i + 1;
        }
        
        Arrays.sort(array);
        
        return array;
    }
}