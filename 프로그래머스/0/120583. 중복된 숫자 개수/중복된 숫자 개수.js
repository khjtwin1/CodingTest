function solution(array, n) {
    let answer = 0;
    array.forEach(function(num) {
        if (n == num) answer++;
    });
    return answer;
}