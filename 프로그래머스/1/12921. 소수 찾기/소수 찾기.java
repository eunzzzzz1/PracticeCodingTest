// 시작 PM 10:42
// 1차 PM 10:50

class Solution {
    public int solution(int n) {
        int answer = n-1;

        for(int i=2;i<=n;i++) {
            for(int j=2;j<=(int)Math.sqrt(i);j++) {
                if(i!=j && i%j==0) {
                    answer--;
                    break;
                }    
            }
        }
        
        return answer;
    }
}