/**
 * @Description
 * @Author luo hao
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2019/11/7
 */
public class Main {

    public static void main(String[] args) {
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        int[] scores = new int[]{100, 200, 333};
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }

        for (int score : scores) {
            System.out.println(score);
        }
    }
}

