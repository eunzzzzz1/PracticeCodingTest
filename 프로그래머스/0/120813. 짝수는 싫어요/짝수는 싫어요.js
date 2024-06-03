function solution(n) {
    var answer = [];
    
    let a = 1;
    for(let i=0; i<Math.round(n/2); i++) {
        answer[i] = a;
        a += 2;
    }
    
    return answer;
}