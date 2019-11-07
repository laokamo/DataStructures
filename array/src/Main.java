/**
 * @Description
 * @Author luo hao
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2019/11/7
 */
public class Main {

    public static void main(String[] args) {
        Array arr = new Array(20);
        for (int i = 0; i < 10; i++) {
            arr.addLast(i);
        }
        System.out.println(arr);

        arr.add(1, 100);
        System.out.println(arr);

        arr.addFirst(-1);
        System.out.println(arr);
    }
}

