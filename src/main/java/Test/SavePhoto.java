package Test;

import java.io.*;

/**
 * Company: www.leadmap.net
 * Description: 练习 Java io字节流 复制图片文件
 *
 * @author: 96964
 * @Date: 2019/2/15 13:14
 */
public class SavePhoto {
    public static void main(String[] args ){
        // 两种斜线分隔符 都可以 但不可以混用
        File img = new File("d:/SpringBootDemo2/src/main/resources/static/img/FSLogo.png");
        File img1 = new File("d:\\SpringBootDemo2\\src\\main\\resources\\static\\img1.png");

        File er = new File("d:/SpringBootDemo2/src/main/java/test/er");
        System.out.println(er.exists());
        System.out.println(er.isFile());
        System.out.println(er.isDirectory());
        try {
            FileInputStream fileInputStream = new FileInputStream(img);
            System.out.println(img.length());
            System.out.println((int) img.length());
            byte[] bytes = new byte[(int)img.length()];
            int len = fileInputStream.read(bytes);
            FileOutputStream fileOutputStream = new FileOutputStream(img1);
            fileOutputStream.write(bytes);
        }catch (IOException x){
            x.printStackTrace();
        }
    }

}
