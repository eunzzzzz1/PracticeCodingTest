import java.util.*;


class AMasterOfPlayingAlone_passed {
    
    int[] parents;
    boolean[] isChecked;
    
    public int solution(int[] cards) {
        
        parents = cards;
        int lth = cards.length;
        
        for(int i=0;i<lth;i++) {
            parents[i]--; // index로 활용하기 위해 1씩 빼준다.
        }
        
        isChecked = new boolean[lth];
        // cards의 길이만큼 boolean 배열을 만들어준다.
        // 아직 만나지 않은 숫자일 경우 f, 만난 숫자일 경우 t로 변경
        
        // 대표숫자로 그룹지어서 Map 만들기
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0;i<lth;i++) {
            
            int parentsNum;
            
            if(!isChecked[i]) {
                parentsNum = find(cards[i]);
            } else {
                parentsNum = parents[i];
            }
            
            map.put(parentsNum,map.getOrDefault(parentsNum,0)+1);
            // System.out.println(map);
            // getOrDefault
            // - 해당하는 Key가 있으면 그 값을 가지고오고, 아니면 Default로 설정해둔 값을 가지고온다.
            
            // 대표번호가 Key, 대표번호로 그룹지어진 번호들의 개수가 Value가 될 것
        }
        
        // 만약 1번상자그룹밖에 없으면 0을 반환해야하고,
        // 상자그룹이 2개 이상이면 value의 크기별로 정렬해 가장 높은 값 두 개를 곱해서 return 해야한다.
        
        int s = map.size();
        // System.out.println("s : " + s);
        
        if(s==1) {
            return 0;
        } else {
            // 정렬을 하자... 그룹 이름은 필요없고 그들의 값만 있으면 return값을 구할 수 있음.
            int[] array = new int[s];
            
            int i = 0;
            for(int v : map.values()) {
                array[i] = v;
                // System.out.println("array[" + i + "] : " + array[i]);
                i++;
            }
            
            // 배열을 정렬하자..
            Arrays.sort(array);
            
            // System.out.println("array[s-1] : " + array[s-1] + " / array[s-2] : " + array[s-2]);
            
            return array[s-1] * array[s-2];
            
        }
        

        
    }
    
    private int find(int a) {
        if(isChecked[a] || parents[a]==a) {
            return a;
        }
        
        isChecked[a] = true;
    
        return parents[a] = find(parents[a]); // return값을 이렇게 지정하는걸 생각하는게 어렵다ㅠ_ㅠ
    }
    
    
}