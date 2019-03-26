package test;

/**
 * Company: www.leadmap.net
 * Description:
 *
 * @author: 96964
 * @Date: 2019/3/26 14:29
 */
public class Recursion {
    public static void main(String[] args){
        long x = fibonacci(5);
        System.out.println(x);
        long y = factorial(20);
        System.out.println(y);

    }

    /**
     * @param number
     * @return 斐波那契数列对应结果
     * */
    public static long fibonacci(int number){
        if(number < 0 ){
            throw new RuntimeException("错误的数值");
        }else if(number == 1 || number == 2){
            return 1;
        }else{
            return fibonacci(number - 2) + fibonacci(number - 1 );
        }
    }

    /**
     * @param number
     * @return 阶乘结果
     * */
    public static long factorial(int number){
        if(number < 0 ){
            throw new RuntimeException("错误的数值");
        }else if (number < 2 ){
            return 1;
        }else{
            return number * factorial(number - 1);
        }
    }

}
