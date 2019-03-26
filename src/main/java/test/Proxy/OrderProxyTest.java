package test.Proxy;

/**
 * Company: www.leadmap.net
 * Description:
 *
 * @author: 96964
 * @Date: 2019/3/20 14:18
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 测试类
 */
public class OrderProxyTest {
    public static void main(String[] args) {
        Order order = new Order();

        SimpleDateFormat sf = new SimpleDateFormat("yyyy-mm-dd");
        Date nowDate = null;
        try {
            nowDate = sf.parse("2019-03-16");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        order.setCreatTime(nowDate.getTime());

        OrderServiceProxy proxy = new OrderServiceProxy(new OrderServiceImp());
        proxy.creatDataSource(order);
    }
}
