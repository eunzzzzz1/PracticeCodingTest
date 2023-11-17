class Solution {
    public int[] solution(String[] park, String[] routes) {
        
        
        // 좌표는 (y, x)로 표기할 것.
        // 시작지점 구하기
        // 시작 y = S를 포함하고 있는 park[i]의 index
        // 시작 x = 그 park[i]에서 S의 index
        int y = 0; 
        int x = 0; 
        
        int maxY = park.length-1;
        int maxX = park[0].length()-1;
        
        for(int i=0;i<park.length;i++) {
            
            if(park[i].indexOf("S")!=-1) {
                y = i;
                x = park[i].indexOf("S");
            }
        }
        
        System.out.println("시작값 (" + y + "," + x + ")");
        
        // Route 별로 명령어 시행하기
        
        for(int i=0;i<routes.length;i++) {

            String[] moving = routes[i].split(" ");
            int move = Integer.parseInt(moving[1]);
            
            boolean OK = true;
            
            switch(moving[0]) {
                
                case "E":
                    
                    OK = true;

                    if(x+move>maxX) {
                        move=0;
                    }
                    
                    for(int j=x;j<=x+move;j++) {
                        if(park[y].charAt(j)=='X') {
                            OK = false;
                        }
                    }
                    
                    if(OK) {
                        x = x+move;
                    }
                    
                    break;
                    
                case "W":
                    OK = true;
                    
                    if(x-move<0) {
                        move = 0;
                    }
                    
                    for(int j=x;j>=x-move;j--) {
                        if(park[y].charAt(j)=='X') {
                            OK = false;
                        }
                    }
                    
                    if(OK) {
                        x-=move;
                    }

                    break;
                
                case "N" :
                    OK = true;
                    
                    if(y-move<0) {
                        move=0;
                    }
                    
                    
                    for(int j=y;j>=y-move;j--){
                        if(park[j].charAt(x)=='X'){
                            OK = false;
                        } 
                    }

                    if(OK) {
                        y -= move;
                    }

                    break;
                    
                case "S" :
                    OK = true;
                    if(y+move>maxY) {
                        move=0;
                    }
                    
                    for(int j=y;j<=y+move;j++){
                        if(park[j].charAt(x)=='X'){
                            OK = false;
                        } 
                    }

                    if(OK) {
                        y += move;
                    }
                    
                    break;
            }
        }
        
        int[] answer = {y, x};
        
        return answer;
    }
}