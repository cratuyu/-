package test.proxy;

/**
 * Company: www.leadmap.net
 * Description:
 *
 * @author: 96964
 * @Date: 2019/3/20 14:17
 */

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 创建OrderServiceimp的代理类
 * 可以对对象方法进行增强，增加before方法
 * 和after方法
 * 并且可以对被代理对象进行隐藏
 * 根据不同的年份创建不同的数据源
 */
public class OrderServiceProxy{
    OrderService orderService;

    public OrderServiceProxy(OrderService orderService){
        this.orderService = orderService;
    }
    SimpleDateFormat sf = new SimpleDateFormat("yyyy");

    public int creatDataSource(Order order){
        Long time = order.getCreatTime();
        int year = Integer.parseInt(sf.format(new Date(time)));
        System.out.println("分配到 DB"+year+"数据源进行处理");
        before();
        System.out.println("设置数据源");
        DynamicDataSourceEntry.setName(year);
        int re = orderService.insert(order);
        after();
        return re;
    }
    private void before(){
        System.out.println("执行before方法");
    }
    private void after(){
        System.out.println("执行after方法");
    }
}