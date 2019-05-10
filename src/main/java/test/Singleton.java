package test;

/**
 * Company: www.leadmap.net
 * Description:
 *
 * @author: 96964
 * @Date: 2019/3/20 13:14
 */
public class Singleton {

    public static void main(String[] args){
        Singleton1 sin1 = Singleton1.getInstance();
        Singleton1 sin2 = Singleton1.getInstance();
        System.out.println(sin1);
        System.out.println(sin2);
    }
}

class Singleton1{
    private static Singleton1 singleton = new Singleton1();

    // 限制在其他类中使用 new 关键字创建对象
    private Singleton1(){
    }

    public static Singleton1 getInstance(){
        return singleton;
    }
}
