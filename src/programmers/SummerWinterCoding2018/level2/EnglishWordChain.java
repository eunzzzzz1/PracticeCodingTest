package programmers.SummerWinterCoding2018.level2;


// 2023.11.08

public class EnglishWordChain {

        public int[] solution(int n, String[] words) {

            int wordNum = sameWordNum(words);
            int wrongWordNum = wrongWordNum(words);

            if(wordNum==0 || (wrongWordNum>0 && wordNum>wrongWordNum)) {
                // 같은 단어 말한 경우보다 잘못된 단어를 말한 경우가 더 앞설 때
                wordNum = wrongWordNum;
            }
            System.out.println(wordNum + "번째 단어에서 탈락");

            int userNum = 0;
            int turnNum = 0;


            if(wordNum>0) {

                userNum = wordNum%n;
                turnNum = wordNum/n;
                if(userNum!=0) {
                    turnNum++;
                }

                if(userNum==0) {
                    userNum = n;
                }

            }

            int[] answer = {userNum, turnNum};

            return answer;
        }

        private int sameWordNum(String[] words) {

            String compareWord = "";
            int wordNum = 0;

            for(int i=0;i<words.length;i++) {
                compareWord = words[i];
                for(int j=i+1;j<words.length;j++) {
                    if(compareWord.equals(words[j])) {
                        wordNum = j+1; // words[j] 는 j번째 단어가 아니라 j+1번째 단어
                        break;
                    }
                }
            }

            return wordNum;

        }

        private int wrongWordNum(String[] words) {

            // 전의 끝글자 .equals 현재의 앞글자랑 같은지 보면 됨
            // charAt을 써볼까

            String previousWord = "";
            String nowWord = "";

            char preWordChar;
            char nowWordChar;

            int preWordLength = 0;

            int wordNum = 0;

            for(int i=1;i<words.length;i++) {
                previousWord = words[i-1];
                nowWord = words[i];
                preWordLength = previousWord.length()-1;

                preWordChar = previousWord.charAt(preWordLength);
                nowWordChar = nowWord.charAt(0);

                if(preWordChar!=nowWordChar) {
                    wordNum = i+1; // words[i] 는 i번째 단어가 아니라 i+1번째 단어
                    break;
                }

            }

            return wordNum;

        }




}
