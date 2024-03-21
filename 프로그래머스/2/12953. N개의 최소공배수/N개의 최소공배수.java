import java.util.*;

class Solution {
    public int solution(int[] arr) {
        // 최대공약수
        // a를 b로 나눈 나머지를 r이라고 할 때, 
        // a와 b의 최대공약수는 b와 r의 최대공약수와 같다.
        
        // 최소공배수
        // a와 b의 최소공배수는 a * b를 a와 b의 최대공약수로 나눈 것과 같다.
        Arrays.sort(arr);
        int answer = arr[arr.length-1];
        
        for(int i=1; i<arr.length; i++) {
            answer = lcm(answer, arr[i]);
        }
        
        return answer;
    }
    
    public int gcd(int a, int b) {

        if(a<b) {
            b = b%a;
        } else {
            int temp = a;
            a = b;
            b = temp%b;
        }
        
        if(b==0) return a;

        return gcd(a, b);
    }
    
    public int lcm(int a, int b) {
        return (a*b) / gcd(a,b); 
    }
}