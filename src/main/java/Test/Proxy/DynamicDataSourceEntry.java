package Test.Proxy;

/**
 * Company: www.leadmap.net
 * Description:
 *
 * @author: 96964
 * @Date: 2019/3/20 14:17
 */
/**
 * 创建数据源路由对象，根据不同的年份进行分库
 * 这里采用ThreadLocal进行线程单例
 */
public class DynamicDataSourceEntry {
    //默认数据源
    private final static String DEFAULT = null;

    private final static ThreadLocal<String> thredLocal = new ThreadLocal<String>();

    private DynamicDataSourceEntry(){

    }

    /*
    清空数据源
     */
    public static void clear(){
        thredLocal.remove();
    }
    /*
    还原数据源为默认
     */
    public static void reset(){
        thredLocal.set(DynamicDataSourceEntry.DEFAULT);
    }
    /*
    获取当前数据源的名字
     */
    public static  String getName(){
        return thredLocal.get();
    }
    /*
    设置已知名字的数据源
     */
    public static void setName(String name){
        thredLocal.set(name);
    }
    /*
    根据年份设置数据源
     */
    public static void setName(int year){
        thredLocal.set("DB"+year);
    }
}