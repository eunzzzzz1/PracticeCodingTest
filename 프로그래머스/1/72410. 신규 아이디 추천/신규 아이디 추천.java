// 시작 PM 10:01
// 정규식문제다... 모르는 분야니까 검색해가면서 풀어보자

class Solution {
    public String solution(String new_id) {
        
        String answer = "";

        // 1. 대문자를 소문자로 치환
        answer = new_id.toLowerCase();
        
        // 2. 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거
        answer = answer.replaceAll("[^a-z0-9-._]","");
        
        // 3. 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환
        answer = answer.replaceAll("[..]+",".");
        
        // 4. 마침표(.)가 처음이나 끝에 위치한다면 제거
        answer = answer.replaceAll("^\\.", "");
        answer = answer.replaceAll("\\.$", "");
        
        // 5. 빈 문자열이라면, new_id에 "a"를 대입
        
        
        if(answer.equals("") || answer.isEmpty()) {
            answer = "a";
        }

        // 6. 길이가 16자 이상이면, 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거
        if(answer.length() >= 16) {
            answer = answer.substring(0, 15);
        }
        answer = answer.replaceAll("\\.$", "");
        
        // 7. 길이가 2자 이하라면, 마지막 문자를 길이가 3이 될 때까지 반복해서 끝에 붙이기
        
        StringBuilder sb = new StringBuilder();
        sb.append(answer);
        String lastChar = answer.charAt(answer.length()-1) + "";
        while(sb.length()<3) {
            sb.append(lastChar);
        }
        
        answer = sb.toString();
        
        

        return answer;
    }
}