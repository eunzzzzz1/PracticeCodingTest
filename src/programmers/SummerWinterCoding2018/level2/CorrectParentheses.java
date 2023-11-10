package programmers.SummerWinterCoding2018.level2;

public class CorrectParentheses {

    boolean solution(String s) {

        boolean answer = true;
        String substring = "";

        while(answer) {

            if(s.charAt(0)==')' || s.charAt(s.length()-1)=='(') {
                answer = false;
                break;
            }

            int lastLeft = s.lastIndexOf("(");
            substring = "";

            if(s.length()>lastLeft+2) {
                substring = s.substring(lastLeft+2);
            }

            s = s.substring(0,lastLeft) + substring;

            if(s.equals("")||s.length()==0) break;

        }
        return answer;
    }

}
