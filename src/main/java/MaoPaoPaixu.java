
public class MaoPaoPaixu {
    public static void main(String[] args) {
        int[] array = {23,12,11,1,56,78};
        //int[] ints = bubbleSort(array);
        //int[] ints = xuanzheSort(array);
        int[] ints = charuSort(array);
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

    /**
     * 选择排序
     * @param array
     * @return
     */
    public static int[] xuanzheSort(int[] array){
        for (int i = 0; i < array.length; i++) {
            //把第一个数看成最小的
            int min = array[i];
            int index = i;
            //从第二个开始遍历，找最小的，记录其值min，和其下标
            for (int j = i+1; j < array.length; j++) {
                if ( array[j]<min){
                    min = array[j];
                    index = j;
                }
            }
            //将查找的最小的值与，开始确定的值交换
            int temp = array[i];
            array[i] = min;
            array[index] = temp;
        }
        return array;
    }

    /**
     * 插入排序
     * @param array
     * @return
     */
    public static int[] charuSort(int[] array){
        for (int i = 1; i < array.length; i++) {
            //遍历从第n个开始，如果这个数小于前面一个数则交换
            for (int j = i; j >0 ; j--) {
                if (array[j]<array[j-1]){
                    int temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }else{
                    break;
                }
                }
            }
        return  array;
    }

}
