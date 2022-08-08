package gyj.collection;

import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author yaokoo
 * @create 2022/8/8 17:18
 */
public class MapTest {
    /*
        1.Map中的key:无序的、不可重复的，使用Set存储所的key ---> key所在的类要重写equals()和hashCode()
        2.Map中的value:无序的、可重复的，使用Collection存储所的value --->value所在的类要重写equals()
           一个键值对：key-value构成了一个Entry对象。
            Map中的entry:无序的、不可重复的，使用Set存储所的entry
     */
    @Test
    public void Test(){
        Map map = new HashMap();
        map.put("AA",11);
        map.put(45,34);
        map.put("BB",22);
        //如果有相同的key，则更新value
        map.put("AA",00);
        System.out.println(map);

        Map map1=new HashMap();
        map1.put("CC",33);
        map1.put("DD",44);
        map.putAll(map1);
        System.out.println(map);
        System.out.println(map.containsKey(45));
        System.out.println(map.remove(45));
        System.out.println(map.containsKey(45));
    }
    /*
        map遍历
     */
    @Test
    public void Test02(){
        Map<Integer,String> map=new HashMap();
        map.put(1,"aa");
        map.put(2,"bb");
        map.put(3,"cc");

        //遍历  --用key遍历
        //     --用value遍历
        //     --用entry遍历 （推荐） 尤其是容量大时
/*        Set set = map.keySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.println("key:"+ next +"\tvalue:"+map.get(next));
        }*/

        for (Object key: map.keySet()){
            System.out.println("ket:"+key+"\tvalue:"+map.get(key));
        }

        for (Map.Entry<Integer,String> entry: map.entrySet()){
            System.out.println("key:"+entry.getKey()+"\tvalue:"+entry.getValue());
        }
    }
}
