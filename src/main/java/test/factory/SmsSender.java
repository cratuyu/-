package test.factory;

/**
 * Company: www.leadmap.net
 * Description:
 *
 * @author: 96964
 * @Date: 2019/3/20 15:12
 */
public class SmsSender implements Sender {

    @Override
    public void Send(){
        System.out.println("this is sms sender");
    }
}
