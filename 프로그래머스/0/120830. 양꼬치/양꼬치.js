function solution(n, k) {
    let lamb = n * 12000;
    let drink = k * 2000;
    let service = Math.floor(n / 10) * 2000;
    
    return lamb + drink - service;
}