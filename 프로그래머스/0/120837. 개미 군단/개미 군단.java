class Solution {
    public int solution(int hp) {
        
        int answer = 0;
        answer += hp/5; // 장군개미
        hp = hp%5;
        
        answer += hp/3; // 병장개미
        hp = hp%3;
        
        answer += hp; // 일개미
        
        return answer;
    }
}