class Solution {
    public String solution(String bin1, String bin2) {
        
        if(bin1.equals("0") && bin2.equals("0")) return "0";
        
        StringBuffer sb = new StringBuffer();
        int int1 = Integer.parseInt(bin1);
        int int2 = Integer.parseInt(bin2);
        
        int a = 0;
        int b = 0;
        
        while(int1 + int2 + b != 0) {
            a = int1%10 + int2%10 + b;
            b = a / 2;
            a = a % 2;
        
            sb.append(a+"");
        
            int1 = int1/10;
            int2 = int2/10;
        }
        
        return sb.reverse().toString();
    }
}