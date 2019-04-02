package test.strategy;

/**
 * Company: www.leadmap.net
 * Description:
 *
 * @author: 96964
 * @Date: 2019/3/27 11:32
 */
public class StrategyTest {
    public static void main(String[] args){
        String exp = "2+8";
        Icalculator icalculator = new Plus();
        int result = icalculator.calculate(exp);
        System.out.println(result);
    }
}
