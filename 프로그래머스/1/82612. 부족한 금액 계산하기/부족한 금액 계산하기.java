// 시작 PM 9:37
// 1차 PM 9:51
// 2차 PM 10:00

class Solution {
    public long solution(int price, int money, int count) {
        
        long total = (long)(count * ( price + (long)(count*price) )) / 2;
        
        return money-total>=0?0:(money-total)*-1;
    }
}