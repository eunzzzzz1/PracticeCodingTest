class Solution {
    public String solution(int a, int b) {
        String answer = "";
        
        int day = 0;
        
        for(int i=1;i<a;i++) {
            
            if(i==2){
                day += 29;
                
            } else if(i<8) {
                
                if(i%2==1)
                    day += 31; 
                else
                    day += 30; 
                
            } else {
                
                if(i%2==1)
                    day += 30; 
                else 
                    day += 31;
            }
    
        }
        
        day += b;
       
        switch(day%7) {
                
            case 1:
                return "FRI";
                
            case 2:
                return "SAT";
                
            case 3:
                return "SUN";
            
            case 4:
                return "MON";
            
            case 5:
                return "TUE";
            
            case 6:
                return "WED";
                
            case 0:
                return "THU";
                
        }
        
        
        
        
        
        return answer;
    }
}