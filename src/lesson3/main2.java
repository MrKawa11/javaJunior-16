package lesson3;

import org.w3c.dom.ls.LSOutput;

public class main2 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int value = 5;
        for (int i = 0; i<10; i++){
            numbers[i] = value;
            value = value + 5; // value+=5
            System.out.println(numbers[i]);
        }

    }
}
