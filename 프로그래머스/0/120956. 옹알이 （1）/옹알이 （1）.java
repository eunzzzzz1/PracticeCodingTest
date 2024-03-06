class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        String[] can = {"aya", "ye", "woo", "ma"};
        
        for(String a : babbling) {
            for(String b : can) {
                a = a.replace(b, " ");
            }
            
            if(a.replace(" ","").equals("")) answer++;
        }

        return answer;
    }
}