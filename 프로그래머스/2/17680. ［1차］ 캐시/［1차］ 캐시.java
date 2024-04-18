import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        
        int answer = 0;
        if(cacheSize==0) return cities.length*5;
        
        List<String> cache = new ArrayList<>();
        
        for(String str : cities) {
            str = str.toLowerCase();
            
            if(cache.remove(str)) { // cache hit
                answer++;
                cache.add(str);
            } else if(cache.size()==cacheSize) { // cache miss
                answer += 5;
                cache.remove(0);
                cache.add(str);
            } else { // cache miss
                answer += 5;
                cache.add(str);
            }    
        }
        
        return answer;
    }
}