// PM 3:09 ~ 
import java.util.*;

class Solution {
    public int[] solution(String s) {
        
        List<String> strList = new ArrayList<>();
        List<Integer> intList = new ArrayList<>();
        s = s.replace("{{","").replace("}}","");
        
        for(String a : s.split("\\},\\{")) {
            strList.add(a);
        }
        
        Collections.sort(strList, (v1, v2) -> v1.length() - v2.length());
        
        for(String a : strList) {
            for(String b : a.split(",")) {
                if(!intList.contains(Integer.parseInt(b)))
                    intList.add(Integer.parseInt(b));
            }
        }

        return intList.stream().mapToInt(i -> i).toArray();
    }
}