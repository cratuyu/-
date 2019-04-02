package test.proxy;

/**
 * Company: www.leadmap.net
 * Description:
 *
 * @author: 96964
 * @Date: 2019/3/20 14:15
 */
public class OrderServiceImp implements OrderService{

    private OrderDao orderDao;

    /**
     * 在Spring中这里是自动注入的，但是为了方便测试这里
     * 在构造函数中对OrderDao进行初始化
     */
    public OrderServiceImp(){
        this.orderDao = new OrderDao();
    }

    @Override
    public int insert(Order order) {
        System.out.println("OrderService调用OrderDao类");
        return this.orderDao.insert(order);
    }
}