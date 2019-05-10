package test.factory;

/**
 * Company: www.leadmap.net
 * Description: 工厂模式 掌管一个接口的多个实现类 根据使用需要返回相应的实现类实例
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
