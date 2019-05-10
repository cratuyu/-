package test.sort;

import java.util.Scanner;

/**
 * Company: www.leadmap.net
 * Description: 直接选择排序
 *
 * @author: 96964
 * @Date: 2019/4/4 10:41
 */
public class SelectSort {
    public static int[] sort(int[] ints){
        for (int i = 1;i < ints.length;i++){
            int index = 0;
            for (int j = 1;j <= ints.length - i;j++){
                if (ints[j] > ints[index]){
                    index = j;
                }
            }
            int m = ints[index];
            ints[index] = ints[ints.length-i];
            ints[ints.length-i] = m;
        }
        return ints;
    }

}
