import java.util.*;


public class Client {
    public int solution(int[] A) {
        // write your code in Java SE 8
//        List<Integer> list = new ArrayList<Integer>();
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<A.length;i++){
            if (A[i]>0)
                map.put(A[i],A[i]);
        }
        if(map.isEmpty())
            return 1;

        for(int i=0;i< map.keySet().size();i++){
            if(!(map.containsKey(i+1))) {

                return i + 1;
            }
        }

        return map.size()+1;
    }
}
