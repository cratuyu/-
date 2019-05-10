package test.sort;


import java.util.Arrays;
import java.util.Scanner;

/**
 * Company: www.leadmap.net
 * Description: 冒泡排序
 *
 * @author: 96964
 * @Date: 2019/4/4 9:24
 */
public class BubbleSort {

    private static int[] ints = new int[10];


    public static int[] sort(int[] ints){
        for(int i = 1; i < ints.length; i++){
            for (int j = 0; j < ints.length-i;j++){
                int m;
                if (ints[j] > ints[j+1]){
                    m = ints[j];
                    ints[j] = ints[j+1];
                    ints[j+1] = m;
                }
            }
        }
        return ints;
    }
}
