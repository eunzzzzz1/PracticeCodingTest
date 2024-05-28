import java.util.*;

class Solution {
    public int solution(String dirs) {
        int answer = 0;
        Set<String> set = new HashSet<>();
        
        int x = 0;
        int y = 0;
        set.add("0000");
        
        for(char ch : dirs.toCharArray()) {
            String prev = x + "" + y;
            
            switch(ch) {
                case 'U' :
                    if(y+1 > 5) continue;
                    y++;
                    break;
                case 'D' :
                    if(y-1 < -5) continue;
                    y--;
                    break;
                case 'R' :
                    if(x+1 > 5) continue;
                    x++;
                    break;
                case 'L' :
                    if(x-1 < -5) continue;
                    x--;
                    break;
            }
                        
            String cur = x + "" + y;
            
            if(!set.contains(prev+cur) && !set.contains(cur+prev))
                    answer++;

            set.add(prev+cur);
            set.add(cur+prev);
        }

        return answer;
    }
}