class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        // n진법으로 바꾸기
        String intToString = Integer.toString(n, k);
        char[] intArray = intToString.toCharArray();
        
        StringBuffer sb = new StringBuffer();
        
        for(char a : intArray) {
            
            if(a == '0') {
                if(sb.length()!= 0 && isPrime(sb.toString()))
                    answer++;
                sb.setLength(0);
            } else {
                sb.append(a);
            }
        }
        
        if(sb.length() != 0 && isPrime(sb.toString()))
            answer++;
        
        return answer;
    }
    
    // 해당 숫자가 소수인지, 아닌지 판별하는 메소드
    private boolean isPrime(String n) {
        
        long number = Long.parseLong(n);
        // int -> long으로 바꾸어 런타임오류 해결
        
        if(number < 2) return false;
        
        long sqrt = (long)Math.sqrt(number);
        
        for(int i=2; i<=sqrt; i++) {
            if(number % i == 0) return false;
        }
        
        return true;
    }
    
}