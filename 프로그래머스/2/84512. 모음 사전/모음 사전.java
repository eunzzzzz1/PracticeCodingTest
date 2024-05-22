import java.util.*;

class Solution {
    
    Map<String, Integer> dic = new HashMap<>(); // 사전
    int cnt = 1;
    
    public int solution(String word) {

        char[] charArr = word.toCharArray();
        StringBuffer sb = new StringBuffer();
        
        makeDic(0,"");
        
        for(char a : charArr) {
            switch(a) {
                case 'A' :
                    sb.append(0);
                    break;
                case 'E' :
                    sb.append(1);
                    break;
                case 'I' :
                    sb.append(2);
                    break;
                case 'O' :
                    sb.append(3);
                    break;
                case 'U' :
                    sb.append(4);
                    break;
            }
        }
        
        
        return dic.get(sb.toString());
    }
    
    private void makeDic(int length, String current) {
        if(length == 5) return;
        
        for(int i=0; i<5; i++) {
            String next = current + i;
            dic.put(next, cnt);
            cnt++;
            makeDic(length + 1, next);
        }
    }
}