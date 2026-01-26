function solution(n, k) {
    var lamb = n * 12000;
    var drink = k * 2000;
    var service = Math.floor(n / 10) * 2000;
    
    return lamb + drink - service;
}