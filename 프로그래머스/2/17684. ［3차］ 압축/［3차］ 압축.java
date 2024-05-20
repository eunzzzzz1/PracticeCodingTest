import java.util.*;

class Solution {
    
    Map<String, Integer> dic = new HashMap<>();
    
    public int[] solution(String msg) {
        List<Integer> answerArray = new ArrayList<>();
        
        // 길이가 1인 모든 단어를 포함하도록 사전 만들기
        for(int i=0; i<26; i++) {
            dic.put((char)('A'+i)+"", i+1);
        }
        
        int last = 26; // 사전 마지막 수
        
        StringBuffer sb = new StringBuffer();
        char[] msgArray = msg.toCharArray();
        
        sb.append(msgArray[0]);
        
        for(int i=0; i<msgArray.length-1; i++) {
            // 1. 먼저 msgArray[i] (w)를 꺼내오고, 그에 맞는 색인번호를 가지고 있는다.
            int num = dic.get(sb.toString() + "");
            
            // 2. dic에 w+c가 있는지 없는지 살펴본다.
            sb.append(msgArray[i+1]);
            
            // w+c가 있으면 -> 다음 반복문으로 넘어간다.
            if(dic.getOrDefault(sb.toString(), 0) != 0) continue;
            
            // w+c가 없으면 -> 사전에 w+c를 추가하고, num을 answerArray에 추가한다.
            dic.put(sb.toString(), last+1);
            sb.setLength(0);
            last++;
            answerArray.add(num);
            
            sb.append(msgArray[i+1]); // msgArray[i]를 꺼내오는 작업을 여기로..
        }
        
        answerArray.add(dic.get(sb.toString())); // 마지막으로 처리되지 않은 글자 처리
        
        return answerArray.stream().mapToInt(i -> i).toArray();
    }
    
}