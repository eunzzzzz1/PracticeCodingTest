// PM 7:20 시작

class Solution {
    public int[] solution(int brown, int yellow) {
        
        int[] answer = new int[2];
        
        int sum = brown + yellow;
        
        for(int i=1; i<sum/2; i++) {
            if(sum%i!=0) continue;
            
            int w = sum / i;
            int h = i;
            
            if(w-h>=0 && (w-2) * (h-2) == yellow) {
                answer[1] = h;
                answer[0] = w;
            }
            
        }
        
        return answer;
        
    }
}