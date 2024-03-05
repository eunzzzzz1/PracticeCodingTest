class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        // 최대공약수 구하기
        int x = 0;
        for(int i=1; i<=a; i++) {
            if(a%i==0 && b%i==0) x = i;
        }
        
        b /= x;
        
        while(b%2==0 || b%5==0) {
            if(b%2==0) b /= 2;
            if(b%5==0) b /= 5;
        }
        
        return (b==1)?1:2;

    }
}