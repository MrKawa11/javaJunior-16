package lesson3;

public class main5 {
    public static void main(String[] args) {
        int[] numbs1 = {1, 4, 6, 9, 5, 0, 2, 8};
        int[] number = {1, 4, 6, 9, 5, 0, 2, 8};
        //numbs1[0] = number[1];
        //numbs1[1] = number[2];
        //numbs1[2] = number[3];
       // numbs1[3] = number[4];
       // numbs1[4] = number[5];
       // numbs1[5] = number[6];
       // numbs1[6] = number[7];
       // numbs1[7] = number[0];
        for (int i = 0; i < numbs1.length; i++) {

            if (i == numbs1.length - 1) {
                numbs1[i] = number[0];
            } else
                numbs1[i] = number[i + 1];
            System.out.println(numbs1[i]);
        }


    }
}
