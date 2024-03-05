import java.util.*;
class Solution {
    public int solution(int[][] dots) {
        // 기울기 = y의 증가량 / x의 증가량
        // 1. 점 1-2, 3-4 의 기울기 비교
        
        // 1-1. 점1 - 점2의 직선 기울기
        double aY = dots[0][0] - dots[1][0]; // y의 증가량
        double aX = dots[0][1] - dots[1][1]; // x의 증가량
        // 1-2. 점3 - 점4의 직선 기울기
        double bY = dots[2][0] - dots[3][0];
        double bX = dots[2][1] - dots[3][1];
        
        System.out.println(aY + " " + bY);
        System.out.println(aX + " " + bX);
        
        boolean A = (aY/aX == bY/bX);
        
        // 2. 점 1-4, 2-3 의 기울기 비교
        // 2-1. 점1 - 점4의 직선 기울기
        aY = dots[0][0] - dots[3][0];
        aX = dots[0][1] - dots[3][1];
        // 2-2. 점2 - 점3의 직선 기울기
        bY = dots[1][0] - dots[2][0];
        bX = dots[1][1] - dots[2][1];
        
        System.out.println(aY + " " + bY);
        System.out.println(aX + " " + bX);
        
        boolean B = (aY/aX == bY/bX);
        
        // 3. 1-3 2-4의 기울기 비교
        // 3-1. 점1 - 점3의 직선 기울기
        aY = dots[0][0] - dots[2][0];
        aX = dots[0][1] - dots[2][1];
        // 3-2. 점2 - 점4의 직선 기울기
        bY = dots[1][0] - dots[3][0];
        bX = dots[1][1] - dots[3][1];
        
        System.out.println(aY + " " + bY);
        System.out.println(aX + " " + bX);
        
        boolean C = (aY/aX == bY/bX);
        
        if(A||B||C) return 1;
        
        return 0;
    }
}