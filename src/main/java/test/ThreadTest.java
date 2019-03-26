package test;

/**
 * Company: www.leadmap.net
 * Description:
 *
 * @author: 96964
 * @Date: 2019/2/28 10:52
 */
public class ThreadTest {
    public static void main(String[] args){
        new Thread(() -> {
            try {
                for(int i=0;i<5;i++ ) {
                    Thread.sleep(1000);
                    System.out.println("1111");
                }
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        try{
            Thread.sleep(3000);
            for (int i = 0; i < 5; i++) {
                System.out.println("1111");
            }
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
