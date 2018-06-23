package demo.FluentInterable;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.Lists;
import org.junit.Before;
import org.junit.Test;
import java.util.List;


public class FluentTest {
    private List<User> userList;
    @Before
    public void setUser() {
        User u1 = new User(20, "lili");
        User u2 = new User(19, "haha");
        User u3 = new User(20, "niu");
        User u4 = new User(23, "keke");
        userList = Lists.newArrayList(u1, u2, u3, u4);
    }
    @Test
    public void fluentFliter() {
        /**
         * 获取 年龄==20的用户；返回为Iterable接口
         */
        FluentIterable<User> filter = FluentIterable.from(userList).filter(new Predicate<User>() {
            @Override
            public boolean apply(User user) {
                return user.getAge() == 20;
            }
        });
        //打印结果
        for (User user : filter) {
            System.out.println(user.getAge());
        }
        /**
         * 输出
         * 20
         20
         */
    }


    @Test
    public void fluentTransform() {
        /**
         * 转换集合类型   ,把list中的user对象转换为String
         */
        FluentIterable<String> transform = FluentIterable.from(userList).transform(new Function<User, String>() {
            @Override
            public String apply(User input) {
                return Joiner.on("==").join(input.getAge(), input.getName());
            }
        });
        //打印结果
        for (String s : transform) {
            System.out.println(s);
        }
        /**
         * 输出
         20==lili
         19==haha
         20==niu
         23==keke
         */
    }


    static class User {
        int age;
        String name;
        User(int age, String name) {
            this.age = age;
            this.name = name;
        }
        int getAge() {
            return age;
        }
        void setAge(int age) {
            this.age = age;
        }
        String getName() {
            return name;
        }
        void setName(String name) {
            this.name = name;
        }
    }
}