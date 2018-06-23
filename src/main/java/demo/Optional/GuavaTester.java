package demo.Optional;

import com.google.common.base.Optional;

/**
 * Optional - 实用类，使代码使用null能够正常。
   Optional.of - 返回要用作参数Optional类的实例。检查传递的值是否为null。
   Optional.get - 获取输入存储在Optional 类的值。
   使用Optional类，可以方便地查看调用者方法来传递参数正确与否。
 */
public class GuavaTester {
   public static void main(String args[]){
      GuavaTester guavaTester = new GuavaTester();

      Integer invalidInput = null;
      Optional<Integer> a =  Optional.of(invalidInput);
      Optional<Integer> b =  Optional.of(new Integer(10));
      System.out.println(guavaTester.sum(a,b));
   }

   public Integer sum(Optional<Integer> a, Optional<Integer> b){
      return a.get() + b.get();
   }    
}
