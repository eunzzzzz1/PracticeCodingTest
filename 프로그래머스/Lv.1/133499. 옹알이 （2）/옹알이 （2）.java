// 시작 PM 8:27
// 1차 PM 8:49 - 문자열이 제거되고 난 이후, 연속되지 않았던 문자가 연속문자로 처리될 수 있음

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] can = {"aya","ye","woo","ma"};
        
        for(int i=0;i<babbling.length;i++) {
            
            for(String c : can) {
                if(babbling[i].indexOf(c)!=-1 && babbling[i].indexOf(c+c)==-1) {
                    babbling[i] = babbling[i].replace(c," ");
                }
            }
            
            if(babbling[i].replace(" ","").equals("")) answer++;

        }
        
        return answer;
    }
}