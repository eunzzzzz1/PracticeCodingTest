// 시작 PM 2:36
// 1차 PM 2:47

import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        
        Set<Integer> hSet = new HashSet<>();
        
        for(int i=0; i<numbers.length; i++) {
            for(int j=i+1; j<numbers.length;j++) {
                hSet.add(numbers[i]+numbers[j]);
            }
        }
        
        int[] answer = hSet.stream().mapToInt(i -> i).toArray();
        sort(answer, 0, answer.length-1);
        
        return answer;
        
    }
    
    // 퀵정렬 메소드 다시 만들어보자!
    void sort (int[] arr, int start, int end) {
        
        int pl = start;
        int pr = end;
        int x = arr[(pl+pr)/2];
        
        do {
            
            while(arr[pl]<x) pl++;
            while(arr[pr]>x) pr--;
            
            if(pl<=pr) {
                int temp = arr[pr];
                arr[pr] = arr[pl];
                arr[pl] = temp;
                
                pl++;
                pr--;
            }

        } while (pl<=pr);
        
        if(pl<end) sort(arr,pl,end);
        if(pr>start) sort(arr,start,pr);

    }
    
}