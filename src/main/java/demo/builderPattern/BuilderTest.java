package demo.builderPattern;

/**
 * @Author: zhengcanbiao
 * @Description:
 * @Date: Created by zhengcanbiao on 2018/6/14.
 */
public class BuilderTest {
    public static void main(String[] args) {
        Student build = new Student.Builder()
                .setId(1)
                .setName("jacob")
                .setPasswd("123")
                .setSex("男")
                .setAddress("fj")
                .build();
    }
}
