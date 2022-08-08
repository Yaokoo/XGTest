package gyj.collection;

import org.junit.Test;

import java.util.*;

/**
 * @author yaokoo
 * @create 2022/8/8 15:36
 */

/*
        Java集合可分为Collection和Map两种体系
        1.Collection:单列集合 用来存一个一个对象
            |--List 有序 可重复   （动态数组）
                |-- ArrayList: 线程不安全 效率高   底层采用Object[] elementData
                |-- LinkedList: 频繁插入删除用   效率更高
                |--Vector ：线程安全  效率低  底层 Object[]
            |--Set  无序 不重复     （集合的概念）
                |-- HashSet :线程不安全 可以存null
                    |-- LinkedHashSet: HashSet的子类 可按顺序遍历
                |-- TreeSet :可排序

        2. Map:双列   K-V  --类似于y=f(x)
            |-- HashMap 可存储null的key好value
                |----LinkedHashMap:保证在遍历map元素时，可以照添加的顺序实现遍历。
            |----TreeMap:保证照添加的key-value对进行排序，实现排序遍历。此时考虑key的自然排序或定制排序，底层使用红黑树
            |----Hashtable:作为古老的实现类；线程安全的，效率低；不能存储null的key和value
                |----Properties:常用来处理配置文件。key和value都是String类型
 */
public class CollectionTest {
    @Test
    public void Test01(){
        Collection coll1=new ArrayList();
        coll1.add(123);
        coll1.add(new Date());
        System.out.println(coll1);
        Collection coll2=new ArrayList();
        coll2.add("cc");
        coll2.addAll(coll1);
        System.out.println(coll2); //调用collection1中的toString()方法输出
        coll1.clear();
        System.out.println(coll1);
        System.out.println(coll1.isEmpty());
    }
    @Test
    public void Test02(){
        Collection coll=new ArrayList();
        coll.add(123);
        coll.add(new String("xxx"));
       // System.out.println(coll.contains("xxx")); //调用对象 要重写equals方法

      //  coll.remove("xxx");
      //  System.out.println(coll.contains("xxx"));
        System.out.println(coll);

       // Collection coll2= Arrays.asList(123,1234,new String("xxx"));  //返回的是个定长的List
        Collection coll2= new ArrayList(Arrays.asList(123,1234,new String("xxx")));

        //----------Array.asList 转化为集合  不能增删改 只能查    建议用以上方法
        Collection coll3=new ArrayList();
        coll3.add(123);
        coll3.add(1234);
        coll3.add(new String("xxx"));
        System.out.println(coll2);
        System.out.println(coll2.containsAll(coll));  //看形参中的元素 是不是都在coll里面

        System.out.println(coll2.removeAll(coll));
        System.out.println(coll2);

        Object[] objects = coll3.toArray();//转数组
        // Collection coll2= Arrays.asList(123,1234,new String("xxx"));  //返回的是个定长的List
        Collection coll4= new ArrayList(Arrays.asList(123,1234,new String("xxx"))); //数组转list
    }
    @Test
    public void Test03(){
        Collection coll=new ArrayList();
        coll.add(123);
        coll.add(new String("xxx"));
        Iterator iterator = coll.iterator();
        while (iterator.hasNext()){
            // remove 必须在iterator方法后 且必须是一一对应
            if ("xxx".equals(iterator.next())){
                iterator.remove();
            }
        }
        //for(集合变量的元素 :形参 对象集合)   底层还是调用 iterator
        System.out.println(coll);
        for(Object obj:coll){
            System.out.println(obj);
        }
    }
}
