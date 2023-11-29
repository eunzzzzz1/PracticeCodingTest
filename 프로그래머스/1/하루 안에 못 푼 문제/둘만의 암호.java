// PM 10:32 시작
// 1차 10:53
// 2ck 11:21

class Solution {
    public String solution(String s, String skip, int index) {

        // 알파벳의 아스키코드가 순서대로 배정되어있음을 이용하려고 함.
        // 'a' 에서 index만큼 더해주면 된다.

        char[] sArr = s.toCharArray(); // 일단 문자열 s를 char 배열로 바꿔준다.

        for(int n=0; n<sArr.length; n++) {
            for(int i=0;i<index;i++) {

                sArr[n] = (char)(sArr[n] + 1); // sArr[n]의 문자를 그 다음 알파벳으로 저장한다.

                while(skip.indexOf(Character.toString(sArr[n]))!=-1) {
                    // 만약 skip에 포함된 문자면, 그 다음 알파벳으로 넘어간다. wbqd
                    sArr[n] = (char)(sArr[n] + 1);
                }
            }


            if(sArr[n]>'z') { // 만약 z 아스키 코드를 넘어갔을 땐 다음과 같이 정의해준다.
                int x = (char)(sArr[n]-'z');
                System.out.println("x값 : " + x);
                sArr[n] = 'a'-1;

                for(int i=0;i<x;i++) {
                    sArr[n] = (char)(sArr[n] + 1);
                    while(skip.indexOf(Character.toString(sArr[n]))!=-1) {
                        // 만약 skip에 포함된 문자면, 그 다음 알파벳으로 넘어간다.
                        sArr[n] = (char)(sArr[n] + 1);
                    }
                }
            }
        }

        return String.valueOf(sArr); // 위 배열을 String으로 변환해 return 한다.
    }
}

// 계속 테스트 3, 17,18,19 에서 통과가 되질 않는다.
// 질문게시판에서 다른 분들이 제시해준 반례들은 전부 통과하는데...ㅠㅠ 답답해