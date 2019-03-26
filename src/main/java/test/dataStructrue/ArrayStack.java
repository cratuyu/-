package test.dataStructrue;

/**
 * 自己用数组实现的栈
 */
public class ArrayStack<T> {

    // 用来保存数据线性表<br>
    private ArrayList<T> list=new ArrayList<T>();

    // 表示当前栈元素个数
    private int size;

    /**
     * 入栈操作
     * @param t
     */
    public void push(T t){
        list.add(t);
        size++;
    }

    /**
     * 出栈操作
     * @return
     */
    public T pop(){
        T t= list.getIndex(size-1);
        size--;
        return t;
    }

}
