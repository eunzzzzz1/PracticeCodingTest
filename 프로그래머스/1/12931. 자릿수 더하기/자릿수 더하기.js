function solution(n) {
    var answer = 0;
    
    [...n+''].forEach(x => answer += x/1);

    return answer;
}