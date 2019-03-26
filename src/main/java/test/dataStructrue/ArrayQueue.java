package test.dataStructrue;

/**
 * Company: www.leadmap.net
 * Description:
 *
 * @author: 96964
 * @Date: 2019/3/26 13:58
 */


/**
 * 用数组实现的队列
 */
public class ArrayQueue<T> {

    // 用来保存数据的队列
    private ArrayList<T> list = new ArrayList<T>();
    // 表示当前栈元素个数
    private int size = 0;

    public void add(T t){
        list.add(t);
        size++;
    }

    public T delete(){
        if(size == 0){
            throw new RuntimeException("已经到达队列顶部");
        }
        T t = list.getIndex(0);
        list.delete(0);
        size--;
        return t;
    }

}