import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = {};
        
        Map<String, Integer> hMap = new HashMap<>();
        
        // 각 이름별로 그리움 점수를 Map에 담기
        for(int i=0;i<name.length;i++) {
            hMap.put(name[i],yearning[i]);
        }
        
        // 각 배열 별 그리움 점수 구하기
        List<Integer> list = new ArrayList<>();
        for(String[] p : photo) {
            int sum = 0;
            for(int i=0;i<p.length;i++){
                sum += hMap.getOrDefault(p[i],0);
                // 그리움 점수가 없으면 0이 더해지도록 하기!
            }
            list.add(sum);
        }
        
        answer = list.stream().mapToInt(i -> i).toArray();
        
        return answer;
    }
}