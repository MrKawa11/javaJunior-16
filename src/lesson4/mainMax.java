package lesson4;

public class mainMax {
    public static void main(String[] args) {
        int[] numbers = {-1, -10, 99, -8, -5, -8};
// стратегия выбора минимального значения для максимума
    //    int max=Integer.MIN_VALUE;

        // защита от пустого массива
        if (numbers.length ==0){
            System.out.println("empty");

            return;

        }
        int max = numbers[0]; // если в массиве есть элементы
        int i = 1;
        while (i < numbers.length) {
            if(max<numbers[i]){
                max=numbers[i];
            }
            i++;
        }
        System.out.println("max = " + max);
    }
}
