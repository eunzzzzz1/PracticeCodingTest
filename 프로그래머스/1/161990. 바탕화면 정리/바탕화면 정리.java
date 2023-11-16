class Solution {
    public int[] solution(String[] wallpaper) {
        

        // x가 세로고 y가 가로구나,,, 헷갈리게ㅠㅠ
        
        // 1. 가로 값 구하기
        // 배열 값 중에서, "#"의 인덱스가 가장 큰 값
        // 그 값의 "#"의 인덱스 + 1 (3번째 #을 감싸기 위해서는 4까지 가야함)
        
        int rdy = 0; // rdy (끝점의 가로) 의 최소값
        int luy = wallpaper[0].length()-1; // luy(시작점의 가로)의 최대값
        
        for(int i=0;i<wallpaper.length;i++) {
            if(rdy<wallpaper[i].lastIndexOf("#")+1) {
                    // 만약 i번째의 String의 #위치가 기존 rdy보다 크면
                rdy = wallpaper[i].lastIndexOf("#")+1; // 그걸로 rdy를 갱신
            }
            
            if(luy>wallpaper[i].indexOf("#") && wallpaper[i].indexOf("#")!=-1) {
                // 만약 i번째 String의 #위치가 기존 lux보다 작으면
                luy = wallpaper[i].indexOf("#"); // 그걸로 luy 갱신
            }
        }

        
        // 2. 세로 값 구하기
        // 세로 최대 길이 = wallpaper.length
        // lux = 배열 내 #이 있는 요소 중에서, 가장 작은 index
        // rdx = 배열 내 #이 있는 요소 중에서, 가장 큰 index + 1
        
        int lux = 0;
        int rdx = 0;
        
        for(int i=0;i<wallpaper.length;i++) {
            if(wallpaper[i].indexOf("#")!=-1) { // 만약 i번째 String에 #이 있으면
                lux = i; // 가장 먼저 나온 String의 인덱스로 lux를 설정하고
                break; // 반복문 벗어남
            }
        }
        
        for(int i=wallpaper.length;i>0;i--) { // 마지막부터 돌기
            if(wallpaper[i-1].indexOf("#")!=-1) { // 만약 i-1번째의 String에 #이 있으면
                rdx = i; // rdx를 i로 갱신
                break; // 반복문 벗어나기
            }
        }
        
        int[] answer = {lux, luy, rdx, rdy};
        return answer;
    
    }
}