// PM 14:40 시작
// 1차 14:55

import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
       
        char[] arr = s.toCharArray();
        List<Character> skipList = new ArrayList<>();
        
        for(char a : skip.toCharArray()) {
            skipList.add(a);
        }
        
        for(int i=0;i <arr.length; i++) {
            
            int idx = index;
            
            while(idx!=0) {
                arr[i] = (char)(arr[i]+1);
                
                if(arr[i]>'z') {
                    arr[i] = 'a';
                }
                
                if(!skipList.contains(arr[i])) idx--;
            }

        }
        
        return new String(arr);
    }
}