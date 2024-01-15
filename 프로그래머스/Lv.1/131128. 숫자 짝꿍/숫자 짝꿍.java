// 다시풀기 시작 PM 12:15
// 1차 PM 12:29

import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        
        int[] arrX = new int[10];
        int[] arrY = new int[10];
        
        for(int i=0; i<X.length(); i++) {
            arrX[(int)(X.charAt(i)-'0')]++;
        }
        
        for(int i=0; i<Y.length(); i++) {
            arrY[(int)(Y.charAt(i)-'0')]++;
        }
        
        StringBuffer sb = new StringBuffer();
        
        for(int i=9; i>=0; i--) {
            for(int j=0; j<Math.min(arrX[i], arrY[i]); j++) {
                sb.append(i);
            }
        }
        
        if(sb.length()==0) return "-1";
        else if(sb.charAt(0)=='0') return "0";
        else return sb.toString();
    }
}