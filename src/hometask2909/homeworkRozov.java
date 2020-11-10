package hometask2909;

public class homeworkRozov {
    public static void main(String[] args) {
        char[] simb = {'в', 'е', 'ц', 'п', 'ы', 'н'};
        for (int i = simb.length - 1; i >= 0; i--) {
            System.out.println(simb[i]);
        }


        int[] numb = {12, 4, 4, 23, 5, 7};
        for (int i = 0; i < numb.length; i++) {
            if (numb[i] % 2 == 0)
                System.out.println(numb[i]);
        }

        int[] number = {12, 4, 4, 23, 5, 7};
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];
        }
        System.out.println(sum);

        int[] number1 ={12, 4, 4, 23, 5, 7};
        int [] number2 ={12, 4, 4, 23, 5, 7};
        for (int i = 0; i<number1.length; i++){
            if (i==number1.length-1){
                number1[i]=number2[0];
            } else
                number1[i]=number2[i+1];
            System.out.println(number1[i]);
        }

    }

}
