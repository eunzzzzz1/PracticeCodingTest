// 시작 AM 8:04
// 1차 AM 8:17
// 2차 AM 8:24

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        
        // 최대공약수 - 유클리드 호제법 이용하기
        
        answer[0] = gcd(n, m);
        
        // 최소공배수
        answer[1] = n * m / answer[0];
        
        return answer;
    }
    
    
    public int gcd(int b, int r) {
        
                
        if(b<r) {
            int temp = b;
            b = r;
            r = temp;
        }
        
        
        if(r==0) return b;
        return gcd(r, b%r);
        
    }
    
    
}