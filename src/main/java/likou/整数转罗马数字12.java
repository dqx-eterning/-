package likou;

public class 整数转罗马数字12 {
    public static void main(String[] args) {
        System.out.println(intToRoman(3));
    }
    public static String intToRoman(int num) {
        int values[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String reps[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]){
                num = num - values[i];
                builder.append(reps[i]);
            }
        }
        return builder.toString();
    }
}
