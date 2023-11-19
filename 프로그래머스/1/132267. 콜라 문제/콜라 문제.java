class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        boolean canChange = true;

        while(canChange) {
            answer += (b*(n/a));
            System.out.println("받은 콜라의 개수 : " + (b*(n/a)));
            n = b*(n/a) + (n%a);
            System.out.println("가진 콜라의 개수 : " + n);
            canChange = (n >= a);
        }
        
        return answer;
    }
}