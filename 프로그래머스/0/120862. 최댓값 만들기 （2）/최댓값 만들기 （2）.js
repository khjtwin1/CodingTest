function solution(numbers) {
    numbers.sort((a, b) => a - b);
    let mul1 = numbers[numbers.length - 1] * numbers[numbers.length - 2];
    let mul2 = numbers[0] * numbers[1];
    return Math.max(mul1, mul2);
}