public class offer61扑克牌中的顺子 {
    public static void main(String[] args) {
        int[] arr = {0,0,1,2,5};
        System.out.println(isStraight(arr));
    }
    /*
    解题思路：
    只有5张牌，先排除对子，然后求最大和最小的牌面之差就行了，小于等于4就肯定是顺子
     */
    public static boolean isStraight(int[] nums) {
        int[] bucket = new int[14];
        int max = -1,min = 14;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) continue;
            if (bucket[nums[i]] == 1) return false;
            bucket[nums[i]]++;
            max = Math.max(max,nums[i]);
            min = Math.min(min,nums[i]);
        }
        return max-min <= 4;
    }

}
