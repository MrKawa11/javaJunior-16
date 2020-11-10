package lesson7;

public class main2 {
    public static void main(String[] args) {
        int perimetr1 = StringUtils.perimetrTreugolnika(2, 4, 7);
        System.out.println(perimetr1);

        int perimetr2 = StringUtils.perimetrTreugolnika(4, 7, 9);
        System.out.println(perimetr2);

        String text = StringUtils.textReverse("нофелеТ");
        System.out.println(text);
    }
}

