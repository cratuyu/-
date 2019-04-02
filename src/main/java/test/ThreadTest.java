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
        System.out.println("---------------------------------------");
        new MyThread().start();
    }

    static class MyThread extends Thread{

        @Override
        public void run(){
            System.out.println("通过继承Thread类创建线程的方式");
        }
    }
}
