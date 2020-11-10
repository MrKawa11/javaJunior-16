package lesson4;

public class LookForData {
    public static void main(String[] args) {
        int [] number={1,4,0,8,98,198,76,7};
        // find index
        int test =198;
        int index = -1;
        for (int i=0; i<number.length; i++)
            //for (int i=0; (i<number.length) && (index ==-1); i++)  - break для хитрых
        if (number[i]==test) {
            index = i;
            break; // останавливает программу после нахождения ответа чтоб не гонять цикл впустую
        }
        System.out.println("index = "+ index);
    }
}
