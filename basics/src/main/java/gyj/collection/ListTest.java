package gyj.collection;

import org.junit.Test;

import java.util.*;

/**
 * @author yaokoo
 * @create 2022/8/8 16:25
 */
public class ListTest {
    @Test
    public void Test(){
        List list=new ArrayList();
        list.add(123);
        list.add("xxx");
        list.add(new Date());

        list.add(1,"bbb");
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        list.addAll(list1);
        System.out.println(list);
        list.set(1,"ccc");
        System.out.println(list);
        System.out.println(list.size());
        // add添加 后面元素往后移     set修改 在原位置修改
        System.out.println(list.subList(3,7));   //寻找 下标到下标的元素    左闭右开
    }

    //ArrayList 构造
    //默认长度10     可以填写长度  也可以填写list 即array转list实现    这些元素是按照该 collection 的迭代器返回它们的顺序排列的。
    // 1.7 和1.8实现区别  1.7饿汉式  创建时给定默认空间10   1.8懒汉式  在add第一个元素的时候给定默认空间10
    //Arrays.asList（…）方法返回的List集合，既不是 ArrayList实例，也不是Vector实例。Arrays.asList（…）返回值是一个固定长度的List集合
    @Test
    public void Test02(){
        List list=new ArrayList();
        list.add(123);
        list.add("xxx");
        list.add(new Date());
        //  遍历 三种    1。for循环
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+",");
        }
        System.out.println();
        //2.迭代器
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+",");   // 每个元素 iterator.next   不是iterator
        }
        System.out.println();
        //3.增强for循环
        for (Object obj:list){
            System.out.print(obj+",");
        }
        System.out.println();
    }
}
