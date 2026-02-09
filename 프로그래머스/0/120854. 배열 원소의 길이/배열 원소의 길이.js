function solution(strlist) {
    let answer = Array(strlist.length);
    for (let i = 0; i < answer.length; i++) {
        answer[i] = strlist[i].length;
    }
    return answer;
}