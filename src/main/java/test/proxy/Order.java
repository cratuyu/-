package test.proxy;

/**
 * Company: www.leadmap.net
 * Description:
 *
 * @author: 96964
 * @Date: 2019/3/20 14:12
 */
/**
 * 订单表
 */
public class Order {
    //订单信息
    private Object orderInfo;
    //订单生成时间
    private Long creatTime;
    //订单ID
    private String id;

    public Object getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(Object orderInfo) {
        this.orderInfo = orderInfo;
    }

    public Long getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Long creatTime) {
        this.creatTime = creatTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}