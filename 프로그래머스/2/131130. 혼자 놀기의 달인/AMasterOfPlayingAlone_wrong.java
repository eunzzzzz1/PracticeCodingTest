import java.util.*;

class AMasterOfPlayingAlone_wrong {

    // answer의 가장 큰 값이 무조건 1이 아닐수도...
    // https://ksb-dev.tistory.com/301 여기를 참고해서, Union과 find에 대해 공부한 후 다시 풀어보자.
    public int solution(int[] cards) {
        int answer = 0;

        // 첫 번째 상자
        HashSet<Integer> firstCardsSet = returnCardsSet(cards, 1);
        // 1번째 상자부터 시작
        int firstBoxes = firstCardsSet.size();

        if(firstBoxes == cards.length) {
            return 0;
        }

        // 두 번째 상자
        int i;
        for(i=0; i<cards.length; i++) {
            if(!firstCardsSet.contains(cards[i])) {
                break;
            }
        }

        HashSet<Integer> secondCardsSet = returnCardsSet(cards, i+1);
        int secondBoxes = secondCardsSet.size();

        // 곱하기
        answer = firstBoxes*secondBoxes;

        return answer;
    }


    private HashSet<Integer> returnCardsSet (int[] cards, int openBoxNum) {

        HashSet<Integer> openCardsSet = new HashSet<Integer>();

        int setLength = 0;

        for(int i=0;i<cards.length;i++) {
            openBoxNum = cards[openBoxNum-1];
            // 첫 번째 박스의 숫자를 다음 openBoxNum으로 지정해준다.
            // System.out.println("openBoxNum : " + openBoxNum);
            openCardsSet.add(openBoxNum); // 연 숫자는 Set에 넣어준다.
            // System.out.println("openCardsSet : " + openCardsSet);

            if(openCardsSet.size()!=setLength+1) {
                // 만약 숫자가 중복되어서 들어가지 않는다면, for문을 벗어난다.
                break;
            }

            setLength=openCardsSet.size(); // break 되지 않았다면, length를 갱신해준다.
        }

        return openCardsSet;
    }

}
