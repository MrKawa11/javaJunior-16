package lesson7;

public class Main {
    public static void main(String[] args) {
        String email = "admin@gmail.com";
        // int a = email.length();
        //System.out.println(a);
        boolean containsDog = false;
        for (int i = 0; i < email.length(); i++) {
            char currentChar = email.charAt(i);
            if (currentChar == '@') {
                containsDog = true;
                break;
            }

        }
        System.out.println(containsDog);
        email.split("@");
        String [] partsOfEmail = email.split("@");
        String lastPart = partsOfEmail[partsOfEmail.length-1];
        boolean containsPoint = lastPart.contains(".");
        System.out.println(containsPoint);

    }
}

