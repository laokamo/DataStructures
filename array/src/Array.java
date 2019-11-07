/**
 * @Description
 * @Author luo hao
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2019/11/7
 */
public class Array {

    private int[] data;
    private int size;

    /**
     * 自定义初始化
     * @param capacity
     */
    public Array(int capacity) {
        this.data = new int[capacity];
        this.size = 0;
    }

    /**
     * 默认初始化
     */
    public Array() {
        this(10);
    }

    /**
     * 判断是否为空
     * @return
     */
    public boolean isEmpty(){
        return size == 0;
    }

    /**
     * 元素个数
     * @return
     */
    public int getSize(){
        return size;
    }

    /**
     * 数组的容量
     * @return
     */
    public int getCapacity(){
        return data.length;
    }

}
