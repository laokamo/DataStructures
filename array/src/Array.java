import java.util.Arrays;

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
     *
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
     *
     * @return
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 元素个数
     *
     * @return
     */
    public int getSize() {
        return size;
    }

    /**
     * 数组的容量
     *
     * @return
     */
    public int getCapacity() {
        return data.length;
    }

    /**
     * 尾部元素
     *
     * @param element
     * @return
     */
    public void addLast(int element) {
        add(size, element);
    }

    /**
     * 头部添加元素
     *
     * @param element
     */
    public void addFirst(int element) {
        add(0, element);
    }

    /**
     * 在指定位置插入元素
     *
     * @param index
     * @param element
     * @return
     */
    public void add(int index, int element) {
        if (size == data.length) {
            throw new IllegalArgumentException("添加失败.数组满了");
        }
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("下标错误");
        }
        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = element;
        size++;
    }

    /**
     * 根据下标获取元素
     *
     * @param index
     * @return
     */
    public int get(int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("下标错误");
        }
        return data[index];
    }

    /**
     * 指定下标设置元素
     *
     * @param index
     * @param element
     */
    public void set(int index, int element) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("下标错误");
        }
        data[index] = element;
    }

    /**
     * 是否包含指定元素
     *
     * @param element
     * @return
     */
    public boolean contains(int element) {
        return find(element) >= 0 ? true : false;
    }

    /**
     * 查找指定元素的索引
     *
     * @param element
     * @return
     */
    public int find(int element) {
        for (int i = 0; i < size; i++) {
            if (data[i] == element) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 删除指定位置的元素
     * @param index
     * @return
     */
    public int remove(int index){
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("下标错误");
        }
        int ret = data[index];
        for (int i = index + 1; i < size; i++) {
            data[i + 1] = data[i];
        }
        size--;
        return ret;
    }

    /**
     * 删除首位元素
     * @return
     */
    public int removeFirst(){
        return remove(0);
    }

    /**
     * 删除末尾元素
     * @return
     */
    public int removeLast(){
        return remove(size - 1);
    }

    /**
     * 删除一个指定元素
     * @param element
     */
    public void removeElement(int element){
        int index = find(element);
        if (index != -1) {
            remove(index);
        }
    }

    /**
     * 删除所有的指定元素
     * @param element
     */
    public void removeAllElement(int element){
        //todo
        int index = find(element);
        if (index != -1) {
            remove(index);
        }
    }

    /**
     * 查找所有的指定元素下标
     * @return
     */
    public int[] findAll(int element){
        //todo
        return new int[]{};
    }

    @Override
    public String toString() {
        return "Array{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }
}
