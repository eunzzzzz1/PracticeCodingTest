// PM 2:06 시작

class Solution {
    public long solution(long n) {
        
        char[] arr = Long.toString(n).toCharArray();
        
        String answer = "";
        
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++) {
                
                if(arr[j]>arr[i]) {
                    char temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
                
            }
            
            answer += arr[i];
        }
        
        return Long.parseLong(answer);
    }
}