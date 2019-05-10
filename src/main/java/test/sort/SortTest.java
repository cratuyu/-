package test.sort;

import java.util.Scanner;

/**
 * Company: www.leadmap.net
 * Description:
 *
 * @author: 96964
 * @Date: 2019/4/4 10:43
 */
public class SortTest {
    private static int[] ints = new int[10];

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int i = 0;
        while(true){
            System.out.println("请输入下一个数据(输入空值结束输入)：");
            String read = scan.nextLine();
            if("".equals(read)){
                break;
            }
            System.out.println(read);
            ints[i] =Integer.parseInt(read);
            i += 1;
        }
        System.out.println("排序前");
        for (int n:ints) {
            System.out.println(n);
        }
        // 冒泡排序
        // BubbleSort.sort(ints);
        // 选择排序
        SelectSort.sort(ints);
        System.out.println("排序后");
        for (int n:ints) {
            System.out.println(n);
        }

    }
}
