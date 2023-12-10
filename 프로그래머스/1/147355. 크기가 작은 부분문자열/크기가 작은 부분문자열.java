// PM 1:30 시작
// 1차 PM 1:35 - 런타임 에러
// 2차 PM 1:41 

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int l = p.length(); // p의 length;
        
        for(int i=0;i<t.length()-l+1;i++) {
            double substr = Double.parseDouble(t.substring(i,i+l));
            if(substr<=Double.parseDouble(p)) {
                answer++;
            }
        }
        
        return answer;
    }
}