#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int angle) {
    int answer = res(angle);
    return answer;
}
int res(int a){
    if (0 < a && a < 90)
        return 1;
    else if (a ==90)
        return 2;
    else if (90 < a && a < 180)
        return 3;
    else if (a == 180)
        return 4;
}