package test.dataStructrue;

/**
 * Company: www.leadmap.net
 * Description:
 *
 * @author: 96964
 * @Date: 2019/3/26 10:44
 */
public class ArrayList<T> {

    private Object[] data = null; // 用来保存此线性表中内容的数组
    private int current; // 保存当前为第几个元素的指标
    int capacity;   // 表示数组大小的指标

    /**
     * 初始化方法 如果未声明表大小 则默认为10
     */
    public ArrayList(){
        this(10);
    }

    public ArrayList(int capacity){
        if(capacity < 0){
            throw new RuntimeException("数组大小错误");
        }else{
            this.data = new Object[capacity];
            this.current = 0;
            this.capacity = capacity;
        }
    }

    /**
     * 确认系统当前容量是否满足需要,如果满足，则不执行操作 如果不满足，增加容量
     * @param cur 当前个数
     */
    private void ensureCapacity(int cur){
        if(cur == this.capacity){
            this.capacity = this.capacity * 2;
            Object[] newdata = new Object[this.capacity];
            for(int i = 0; i <= this.data.length; i++ ){
                newdata[i] = this.data[i];
            }
            this.data = newdata;
        }
    }
    /**
     * 添加元素的方法 添加前，先确认是否已经满了
     * @param t
     * @return
     */
    public boolean add(T t){
        ensureCapacity(this.current);
        this.data[this.current] = t;
        this.current++;
        return true;
    }

    /**
     * 得到指定下标的数据
     * @param index
     * @return
     */
    public T getIndex(int index){
        return (T) this.data[index];
    }

    /**
     * 返回当前队列大小
     * @return
     */
    public int size() {
        return this.current;
    }

    /**
     *  验证当前下标是否合法，如果不合法，抛出运行时异常
     * @param index 下标
     */
    public boolean validateIndex(int index){
        if(index < 0 || index > this.current){
            throw new IndexOutOfBoundsException("数组下标越界");
        }
        return true;
    }

    /**
     * 更改指定下标元素的数据为e
     * @param index
     * @param t
     * @return
     */
    public boolean set(int index,T t){
        validateIndex(index);
        this.data[index] = t;
        return true;
    }

    /**
     * 在指定下标位置处插入数据e
     * @param index 下标
     * @param t 需要插入的数据
     * @return
     */
    public boolean insert(int index, T t) {
        validateIndex(index);
        Object[] tem = new Object[capacity];  // 用一个临时数组作为备份
        //开始备份数组
        for (int i = 0; i < current; i++) {
            if (i < index) {
                tem[i] = this.data[i];
            }else if(i==index){
                tem[i]=t;
            }else if(i>index){
                tem[i]=this.data[i-1];
            }
        }
        this.data=tem;
        return true;
    }
    /**  * 删除指定下标出的数据<br>
     * @param index<br>
     * @return<br>
     */
    public boolean delete(int index){
        validateIndex(index);
        Object[] tem = new Object[capacity]; // 用一个临时数组作为备份
        //开始备份数组
        for (int i = 0; i < current; i++) {
            if (i < index) {
                tem[i] = this.data[i];
            }else if(i==index){
                tem[i]=this.data[i+1];
            }else if(i>index){
                tem[i]=this.data[i+1];
            }
        }
        this.data=tem;
        return true;
    }

}
