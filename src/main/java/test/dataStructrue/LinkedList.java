package test.dataStructrue;

/**
 * Company: www.leadmap.net
 * Description:
 *
 * @author: 96964
 * @Date: 2019/3/26 11:20
 */
public class LinkedList<T> {

    // 头结点
    private Node<T> header = null;
    // 用来表示数组大小
    private int size = 0;

    private Node<T> last = null;

    public boolean add(T t) {
        if (size == 0) {
            header.t = t;
        } else {
            // 根据需要添加的内容，封装为结点
            Node<T> newNode = new Node<T>(t);
            // 将表尾指向当前最后一个元素
            this.last = newNode;
            // 在最后一个结点后加上新结点
            last.addNext(newNode);

        }
        size++;// 当前大小自增加1
        return true;
    }

    public boolean insert(int index, T t) {
        Node<T> newNode = new Node<T>(t);
        // 得到第N个结点
        Node<T> cNode = getNode(index);
        newNode.next = cNode.next;
        cNode.next = newNode;
        size++;
        return true;
    }

    /**
     * 遍历当前链表，取得当前索引对应的元素
     *
     * @return
     */
    private Node<T> getNode(int index) {
        // 先判断索引正确性
        if (index > size || index < 0) {
            throw new RuntimeException("索引值有错：" + index);
        }
        Node<T> tem = new Node<T>();
        tem = header;
        int count = 0;
        while (count != index) {
            tem = tem.next;
            count++;
        }
        return tem;
    }

    /**
     * 根据索引，取得该索引下的数据
     *
     * @param index
     * @return
     */
    public T get(int index) {
        // 先判断索引正确性
        if (index >= size || index < 0) {
            throw new RuntimeException("索引值有错：" + index);
        }
        Node<T> tem = new Node<T>();
        tem = header;
        int count = 0;
        while (count != index) {
            tem = tem.next;
            count++;
        }
        T t = tem.t;
        return t;
    }

    public int size() {
        return size;
    }

    /**
     * 设置第N个结点的值
     *
     * @param index
     * @param t
     * @return
     */
    public boolean set(int index, T t) {
        // 先判断索引正确性
        if (index > size || index < 0) {
            throw new RuntimeException("索引值有错：" + index);
        }
        Node<T> newNode = new Node<T>(t);
        // 得到第x个结点
        Node<T> cNode = getNode(index);
        cNode.t = t;
        return true;
    }

    /**
     * 用来存放数据的结点型内部类
     */
    private class Node<T>{

        // 结点中存放的数据
        private T t;
        // 结点中存放的数据
        Node<T> next;

        Node() { }
        Node(T t) {
            this.t = t;
        }

        // 在此结点后加一个结点
        void addNext(Node<T> node) {
            next = node;
        }
    }

    public LinkedList(){
        this.header = new Node<T>();
    }

}
