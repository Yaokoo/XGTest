package gyj.collection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yaokoo
 * @create 2022/8/8 17:34
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Comparable{
    private String name;
    private int age;

    public int compareTo(Object o) {
        if (o instanceof User){
            User user=(User)o;
            int compare = this.name.compareTo(user.name);
            if (compare!=0){
                return compare;
            }else {
                return Integer.compare(this.age,user.age);
            }
        }else {
            throw new RuntimeException("输入的类型不匹配");
        }
    }
}
