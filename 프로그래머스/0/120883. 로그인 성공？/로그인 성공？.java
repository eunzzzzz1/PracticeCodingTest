class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        
        for(String[] id : db) {
            if(id[0].equals(id_pw[0]) && id[1].equals(id_pw[1]))
                return "login";
            else if(id[0].equals(id_pw[0]))
                return "wrong pw";
        }
        
        return "fail";
    }
}