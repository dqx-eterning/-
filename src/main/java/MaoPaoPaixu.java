public class MaoPaoPaixu {
    public static void main(String[] args) {
        int[] array = {23,12,11,1,56,78};
        int[] ints = bubbleSort(array);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
    /**
     * 冒泡排序
     *
     * @param array
     * @return
     */
    public static int[] bubbleSort(int[] array) {
        if (array.length == 0)
            return array;
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array.length - 1 - i; j++)
                if (array[j + 1] < array[j]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
        return array;
    }
}
