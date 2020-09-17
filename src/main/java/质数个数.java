public class 质数个数 {
    public static void main(String[] args) {
        Integer integer = countPrime(5);
        System.out.println(integer);
    }

    public static Integer countPrime(Integer n){
        int count =0;
        for (int i = 2; i <= n; i++) {
            boolean istrue = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0){
                    istrue  = false;
                    break;
                }
            }
            if (istrue){
                count++;
            }
        }
        return count;
    }
}
