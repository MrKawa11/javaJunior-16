package lesson7;

public class StringUtils {

    /*  1 - модификатор доступа ( 1 из 4 вариантов слов)
    - public - доступно внутри на протяжении всего проекта
    - ______ доступно внутри текущей папки
    - protected доступно только внутри класса и наследником
    - private - доступен к методу только внутри текущего класса

   2 - static (есть или нет)
   3 - возвращаемый тип ( указываем  либо тип который мы ожидаем в виде ответа
   или слово VOID если возвращаемого типа нет)
    4 - название метода( придумываем) с маленькой буквы
     5 - Входящие параметры в скобках, через запятую
     6 - тело выполнения метода
     */
    public static int perimetrTreugolnika (int a, int b, int c){
        return a+b+c;
    }

    public static String textReverse (String text){
        return new StringBuilder(text).reverse().toString();
    }
}
