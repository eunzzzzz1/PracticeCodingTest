// 다시풀기 시작 PM 12:15

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
        
        List<String> list = new ArrayList<>();
        
        for(int i=0; i<10; i++) {
            
            if(arrX[i] == 0 || arrY[i] ==0) continue;
            int count = Math.min(arrX[i], arrY[i]);
            
            while(count!=0) {
                list.add(i+"");
                count--;
            }
            
        }
        
        if(list.size()==0) return "-1";
        
        Collections.sort(list);
        StringBuffer sb = new StringBuffer();
        
        for(String str : list) {
            sb.append(str);
        }
        
        if(sb.reverse().charAt(0)=='0') return "0";
        
        return sb.toString();
    }
}