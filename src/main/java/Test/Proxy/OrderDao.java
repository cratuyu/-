package Test.Proxy;

/**
 * Company: www.leadmap.net
 * Description:
 *
 * @author: 96964
 * @Date: 2019/3/20 14:14
 */
public class OrderDao {
    public int insert(Order order){
        System.out.println("订单信息插入成功");
        return 1;
    }
}