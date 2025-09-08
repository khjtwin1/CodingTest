function solution(s) {
    var answer = '';
    let cnt = 0;
    for(let i = 0; i<s.length; i++){
        cnt++;
    }
    if(cnt%2==0){
        answer += s.charAt(cnt/2-1) + s.charAt(cnt/2);
    } else {
        answer += s.charAt(cnt/2);
    }
    return answer;
}