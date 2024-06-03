const solution = (numbers) => {
    let answer = 0;
    numbers.forEach(number => answer += number);
    return answer / numbers.length;
}