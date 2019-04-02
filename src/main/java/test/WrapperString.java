package test;

import java.util.HashSet;

/**
 * Company: www.leadmap.net
 * Description:
 *
 * @author: 96964
 * @Date: 2019/3/15 15:26
 */
public class WrapperString {
    private String s;
    public WrapperString(String s){
        this.s = s;
    }
    public static void main(String[] args){
        HashSet<Object> hashSet = new HashSet<Object>();
        WrapperString ws1 = new WrapperString("aaaaa");
        WrapperString ws2 = new WrapperString("aaaaa");
        String s1 = "aaaaafdsfsd";
        String s2 = "aaaaafdsfsd";
        hashSet.add(ws1);
        hashSet.add(ws2);
        hashSet.add(s1);
        hashSet.add(s2);
        System.out.println(hashSet.size());
    }
}
