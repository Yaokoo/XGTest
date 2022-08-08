package gyj.collection;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author yaokoo
 * @create 2022/8/8 16:47
 */
public class SetTest {
    /*
        set 无序不重复 不代表随机  是按照hash来散列的
        put的过程   put a   1.调用a的hashcode方法计算出hash值 然后散列到hash数组上 数组位置上有没有元素
                      --有元素
                       --比较hash值  不同则添加
                       --若hash值相同 equal比较 如果不同则添加 如果相同则替换
                       --1.7 和1.8添加有区别 1.8之后是尾插法 解决循环扩容链表是死循环的问题
                    --扩容
                        --1.数组元素个数 > 容量 * 加载因子 或者是 链表长度大于8   数组长度翻倍
                        --2. 当数组长度到达64 && 链表长度大于8   链表变为红黑树
            --hashmap和 hashset底层存储相同
                --hashmap多了一个entry存储  entry绑定这key values
     */
    @Test
    public void Test01(){
        HashSet set=new HashSet();
        set.add("xxx");
        set.add("zzz");
        set.add("ccc");
        System.out.println(set);
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        set.remove("xxx");
        System.out.println(set);
        System.out.println(set.contains("ccc"));
    }
    /*
                --向TreeSet中添加的数据，要求是相同类的对象
                --添加元素时 需要告诉treeset如何比较
                     --如果试图把一个对象添加到Treeset时，则该对象的类必须实现Comparable接口。
                     --除第一个元素外 每一个add进来的元素都会调用compareTo进行比较

                     Comparable  自然比较 内比较
                     Comparator  订制比较 外比较
     */
    @Test
    public void Test02(){
        TreeSet<User> users=new TreeSet<User>();
        users.add(new User("zzz",21));
        users.add(new User("zzz",19));
        users.add(new User("zzz",19));
        users.add(new User("aaa",21));
        users.add(new User("bbb",19));
        users.add(new User("ccc",20));
        System.out.println(users);
    }
}
