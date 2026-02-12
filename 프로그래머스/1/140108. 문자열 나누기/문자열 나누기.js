function solution(s) {
    let answer = 0;
    while (s !== "") {
        let x = s.charAt(0);
        let cntX = 1, notX = 0;
        for (let i = 1; i < s.length; i++) {
            if (s.charAt(i) === x) cntX++;
            else notX++;
            if (cntX == notX) {
                s = s.slice(i + 1);
                answer++;
                break;
            }
        }
        if (cntX !== notX) {
            answer++;
            break;
        }
    }
    return answer;
}