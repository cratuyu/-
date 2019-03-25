package Test.factory;

/**
 * Company: www.leadmap.net
 * Description:
 *
 * @author: 96964
 * @Date: 2019/3/20 15:10
 */
public class MailSender implements Sender {

    @Override
    public void Send(){
        System.out.println("this is mail sender");
    }
}
