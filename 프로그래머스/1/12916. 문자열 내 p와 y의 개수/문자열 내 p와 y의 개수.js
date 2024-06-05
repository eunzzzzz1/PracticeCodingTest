function solution(s){
    s = s.toLowerCase();
    let p = [...s].filter(x => x === 'p').length;
    let y = [...s].filter(x => x === 'y').length;

    return p===y;
}