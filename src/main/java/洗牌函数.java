import java.util.Arrays;

public class 洗牌函数 {
    public static void main(String[] args) {
        int[] m = new int[20];
        // 创建一个有序数组
        for (int i = 0; i < 20; i++) {
            m[i] = i + 1;
        }
        System.out.println(Arrays.toString(m));
        // 打乱有序数组
        // 从下标 0 开始，与随机得到的下标 j 对应的元素交换
        for (int i = 0; i < m.length; i++) {
            int j = (int) (Math.random() * 20);
            System.out.print(j+"---");
            int t = m[i];
            m[i] = m[j];
            m[j] = t;
        }
        System.out.println(Arrays.toString(m));

    }

}
