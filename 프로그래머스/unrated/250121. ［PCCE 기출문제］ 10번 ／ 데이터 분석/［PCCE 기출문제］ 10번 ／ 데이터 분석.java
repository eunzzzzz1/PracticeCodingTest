// AM 10:14 시작 -> AM 10:35 끝
// 2차원 배열 정렬하는 방법 익히기
import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        
        List<int[]> datalist = new ArrayList<>();
        
        switch(ext) { // ext
                
            case "code" :
                for(int[] d : data) {
                    if(d[0]<val_ext) {
                        datalist.add(d);
                    }
                }
                
                data = datalist.toArray(new int[0][0]);
                
                break;
                
            case "date" :
                for(int[] d : data) {
                    if(d[1]<val_ext) {
                        datalist.add(d);
                    }
                }
                
                data = datalist.toArray(new int[0][0]);
                
                break;
                
            case "maximum" :
                for(int[] d : data) {
                    if(d[2]<val_ext) {
                        datalist.add(d);
                    }
                }
                
                data = datalist.toArray(new int[0][0]);
                
                break;
                
            case "remain" :
                for(int[] d : data) {
                   if(d[3]<val_ext) {
                        datalist.add(d);
                    }
                }
                
                data = datalist.toArray(new int[0][0]);
                
                break;

        }
        
        switch(sort_by) {
                case "code" :
                Arrays.sort(data, Comparator.comparingInt(x -> x[0]));
                break;
                
            case "date" :
                Arrays.sort(data, Comparator.comparingInt(x -> x[1]));
                break;
                
            case "maximum" :
                Arrays.sort(data, Comparator.comparingInt(x -> x[2])); 
                break;
                
            case "remain" :
                Arrays.sort(data, Comparator.comparingInt(x -> x[3]));
                break;

        }

        return data;
    }
}