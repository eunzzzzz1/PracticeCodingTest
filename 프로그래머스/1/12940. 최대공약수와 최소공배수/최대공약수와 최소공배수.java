// 시작 AM 8:04
// 1차 AM 8:17
// 2차 AM 8:24

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        if(n<m) {
            int temp = n;
            n = m;
            m = temp;
        }
        
        // 최대공약수 - 유클리드 호제법 이용하기
        int b = m;
        int r = n%m;
        
        while(r!=0) {
            int temp = b;
            b=r;
            r=temp%r;
            System.out.println("r : " + r);
        }
        
        answer[0] = b;
        System.out.println("b : " + b);
        
        // 최소공배수
        answer[1] = b * (n/b) * (m/b);
        
        return answer;
    }
}