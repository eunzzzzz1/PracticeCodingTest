function solution(hp) {
    var answer = ~~(hp / 5);
    answer += ~~( hp%5 / 3);
    answer += hp%5 %3;
    
    return answer;
}