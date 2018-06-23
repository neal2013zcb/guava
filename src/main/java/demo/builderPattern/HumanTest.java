package demo.builderPattern;

import com.google.common.collect.Lists;
import com.sun.org.apache.xpath.internal.operations.Bool;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: zhengcanbiao
 * @Description:
 * @Date: Created by zhengcanbiao on 2018/6/13.
 */
//@Data
//@Builder
//class Human{
//
//    private String name;
//
//    public Human() {
//    }
//
//    /**
//     * Human的创建完全依靠Human.Builder,使用一种方法链方式来创建
//     */
//    public static class Builder{
//        Human target;
//
//        public Builder(String name) {
//            target = new Human();
//            target.setName(name);
//        }
//
//        public Builder sleep(int second) {
//            for (int i = 0; i < second; i++) {
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(".");
//            }
//            return this;
//        }
//
//        public Builder eat(String food) {
//            System.out.println(target.getName() + "eat" + food);
//            return this;
//        }
//
//        public Human first(int second){
//            System.out.println("##  ==  ##");
//            for (int i = 0; i < second; i++) {
//                try {
//                    Thread.sleep(second);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(".");
//            }
//            return new Human();
//        }
//
//
//    }
//}

public class HumanTest{
    public static void main(String[] args){
//        ABC listListABC = h.newArrayList();

//        new Human.Builder("TOM").eat("biscuit").sleep(3).eat("milk").sleep(4).eat("chocolate").sleep(5);
//        new Human("TOM").eat("biscuit").sleep(3).eat("milk").sleep(4).eat("chocolate").sleep(5);
//        new Human("TOM").eat("biscuit").sleep(3).eat("milk").sleep(4).eat("chocolate").sleep(5).first(1);
    }

//    public <E extends Collection, T> ABC<E,T> newArrayList() {
//        return new ABC();
//    }

}
