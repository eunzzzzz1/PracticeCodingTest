class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        
            
        for(String word : dic) {
            int x = 0; // 새 단어 꺼내올 때마다 x를 0으로 초기화
            
            for(int i=0;i<spell.length;i++) {
                if(word.indexOf(spell[i])!=-1){
                    x++; // spell의 i번째가 word에 있으면 x + 1 해주기
                }
                
                if(x>=spell.length) {
                    // spell이 word에 쓰인 만큼 +1이 되므로, spell이 모두 쓰이면 length만큼 될 것
                    // System.out.println(word);
                    answer = 1;
                    break;
                }
            }

        }
        
        return answer;
    }
}