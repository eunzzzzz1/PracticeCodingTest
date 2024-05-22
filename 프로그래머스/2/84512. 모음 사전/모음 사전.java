import java.util.*;

class Solution {
    
    List<String> dic = new ArrayList<>(); // 사전
    
    public int solution(String word) {

        char[] charArr = word.toCharArray();
        StringBuffer sb = new StringBuffer();
        
        makeDic("");
        
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
        
        
        return dic.indexOf(sb.toString()) + 1;
    }
    
    private void makeDic(String current) {
        if(current.length() == 5) return;
        
        for(int i=0; i<5; i++) {
            String next = current + i;
            dic.add(next);
            makeDic(next);
        }
    }
}