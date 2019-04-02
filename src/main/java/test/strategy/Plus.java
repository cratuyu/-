package test.strategy;

/**
 * Company: www.leadmap.net
 * Description:
 *
 * @author: 96964
 * @Date: 2019/3/27 11:14
 */
public class Plus extends AbstractCalculator implements Icalculator {

    @Override
    public int calculate(String exp){
        int[] arrayInt = split(exp,"\\+");
        return arrayInt[0] + arrayInt[1];
    }
}
