import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        // return 0일 경우
        if(score.length<m) {
            return 0;
        }
        
        // 1. score을 오름차순으로 정렬하기
        Arrays.sort(score);
        
        // 2. 묶음이 가장 처음 시작되는 index 구하기
        int a = score.length%m;
        
        // 3. 반복문으로 최대이익 합 구하기 
        for(int i=a;i<score.length;i=i+m) {
            answer = answer + (score[i]*m);
        }
        
        
        return answer;
    }
}