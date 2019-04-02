package test.strategy;

import java.util.HashMap;

/**
 * Company: www.leadmap.net
 * Description:
 *
 * @author: 96964
 * @Date: 2019/3/27 10:55
 */
public class AbstractCalculator {
    public int[] split(String exp,String opt){
        String[] array = exp.split(opt);
        int[] arrayInt = new int[2];
        arrayInt[0] = Integer.parseInt(array[0]);
        arrayInt[1] = Integer.parseInt(array[1]);
        return arrayInt;
    }
}
