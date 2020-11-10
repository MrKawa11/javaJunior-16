package lesson3;

public class less1 {
    public static void main(String[] args) {
        int[] num;
        num = new int[]{1, 2, 3, 4, 47, 454};
        for (int i = 0; i < num.length; i++) {

            if (num[i] % 2 == 0)
                System.out.println(num[i]);
        }
    }
}