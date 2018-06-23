package demo.String;

import com.google.common.base.Joiner;

/**
 * @Author: zhengcanbiao
 * @Description:
 * @Date: Created by zhengcanbiao on 2018/6/14.
 */
public class JoinerTest {
    public static void main(String[] args) {
        String [] s=new String[]{"one", "two", null, " ", "three"};
        String s1 = Joiner.on(",").skipNulls().join(s);
        System.out.println(s1);
    }
}
