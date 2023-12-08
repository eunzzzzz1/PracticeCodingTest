// PM 4:37 시작
// 1차 PM 5:16
// 2차 PM 5:20

import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> list = new ArrayList<>();
        
        int tYear = Integer.parseInt(today.split("\\.")[0]); // 오늘 연도
        int tMonth = Integer.parseInt(today.split("\\.")[1]); // 오늘 월
        int tDay = Integer.parseInt(today.split("\\.")[2]); // 오늘 월
        
        // terms를 Map에 담기
        Map<String, Integer> hMap = new HashMap<>();
        
        for(int i=0;i<terms.length;i++) {
            hMap.put(terms[i].split(" ")[0],
                     Integer.parseInt(terms[i].split(" ")[1]));
        }
        
        for(int i=0;i<privacies.length;i++) {
            
            String date = privacies[i].split(" ")[0];
            int year = Integer.parseInt(date.split("\\.")[0]); // 수집 연도
            int month = Integer.parseInt(date.split("\\.")[1]); // 수집 달
            int day = Integer.parseInt(date.split("\\.")[2]) -1;
            
            if(day == 0) { // day가 0이 될 때를 고려하기
                month--;
                day = 28;
            }
            
            String term = privacies[i].split(" ")[1]; // 약관 종류
            
            month = month + hMap.get(term);
            
            while(month>12) {
                year = year + 1;
                month = month - 12;
            }
            
            if(year<tYear) {
                list.add(i+1);
            } else if (year==tYear && month < tMonth) {
                list.add(i+1);
            } else if (year==tYear && month == tMonth && day < tDay) {
                list.add(i+1);
            }
        }
        
        return list.stream().mapToInt(i->i).toArray();
    }
}