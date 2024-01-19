// 시작 PM 6:28
// 1차 PM 8:07

import java.util.*;

class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuffer sb = new StringBuffer();

        int nowLeft = 9;
        int nowRight = 11;
        
        for(int i = 0; i<numbers.length; i++) {
            if(numbers[i]==0) {
                numbers[i] = 10;
                continue;
            }
            numbers[i] -= 1;
        }
        
        
        
        for(int n : numbers) {
            
            boolean isRight = true;
            
            if (n%3==0) {
                
                isRight = false;
                
            } else if (n%3==1) {
                
                int leftLength
                = Math.abs((nowLeft%3) - (n%3))
                    + Math.abs((nowLeft/3) - (n/3));
            
                int rightLength
                    = Math.abs((nowRight%3) - (n%3))
                        + Math.abs((nowRight/3) - (n/3));
                
                isRight = leftLength > rightLength;

                if(leftLength==rightLength) {
                    isRight = hand.equals("right");
                }
            }
            
            if(isRight) {
                sb.append("R");
                nowRight = n;
            } else {
                sb.append("L");
                nowLeft = n;
            }

        }
        
        
        return sb.toString();
    }
}