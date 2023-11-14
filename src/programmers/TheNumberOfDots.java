package programmers;
// int와 long의 범위 제대로 익히기.
// 만약 x와 y가 작은 수일 경우 int의 제곱으로도 충분히 처리가 가능하지만,
// x, y가 큰 수가 될 경우 그들의 제곱을 int로는 담지 못한다. 오버플로우 현상이 발생해 부정확한 결과를 가져온다.

/*
 * int의 제곱:
 *
 * int 자료형의 최대값은 2^31 - 1이며, 최소값은 -2^31입니다.
 * 이 범위 내의 값들을 제곱하면 오버플로우가 발생할 가능성이 있습니다.
 * 예를 들어, (2^31 - 1)^2는 int의 범위를 넘어가게 되어 예상치 못한 결과가 나올 수 있습니다.
 *
 * long의 제곱:
 *
 * long 자료형은 더 큰 범위를 가지고 있습니다. 최대값은 2^63 - 1이며, 최소값은 -2^63입니다.
 * 따라서 long으로 제곱 연산을 수행하면 더 큰 범위의 정수를 다룰 수 있고, 오버플로우의 가능성이 현저히 줄어듭니다.
 */
public class TheNumberOfDots {

    // 첫 번째 답 - 테스트 케이스 11, 13, 14에서 문제가 발생한다.
    public int solution1(int k, int d) {

        int answer = 0;
        // 거리...
        // x제곱 + y제곱에 루트 씌우기...

        for(int i=0;i<=d/k;i++) {

            long x = i*k;

            for(int j=0;j<=d/k;j++) {

                long y = j*k;

                if((long)d*(long)d>=(x*x)+(y*y)) {
                    answer++;
                }

            }
        }

        return answer;
    }
}
