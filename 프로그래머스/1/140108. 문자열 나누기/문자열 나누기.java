// PM 4:47 시작
// 1차 PM 5:15...

class Solution {
    public int solution(String s) {
        int answer = 0;
            
        char[] arr = s.toCharArray();
        int a = 1; // 첫 글자와 같은 글자의 개수
        int b = 0; // 첫 글자와 다른 글자의 개수
        
        char compare = arr[0];

        for(int i=1;i<=arr.length;i++) {
            if(i==arr.length) {
                answer++;
                break;
                
            } else if(a==b) {
                answer++;
                compare = arr[i];
                a = 1;
                b = 0;
                continue;
            }
            
            if(compare==arr[i]) a++; else b++;

        }
        
        return answer;
    }
}