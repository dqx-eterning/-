import java.util.*;

public class 所有数字出现的个数 {
    public static void main(String[] args) {
        Random rand=new Random(100);
        List<Integer> list=new ArrayList<Integer>();
        Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int i=0;i<10;i++)
            list.add(rand.nextInt(5));
        System.out.println(list);
        for(Integer it:list){
            Integer freq=hm.get(it);
            hm.put(it,freq==null?1:freq+1 );
        }
        System.out.println(hm);
    }

}
