import java.util.Scanner;

public class Task1 {
    static String result = "";
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста, введите любое положительное число в десятичной системе исчисления:");
        int nb = scanner.nextInt();
        if (nb <= 0) {
            System.out.println("Incorrect number");
            return;
        }
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("В какую систему исчисления вы хотите перевести число?");
        String base = scanner2.nextLine();
        intToAny(nb, base);
    }

    public static void intToAny(int nb, String base) {
        switch (base) {
            case "01" -> System.out.println("Десятичное число " + nb + " равно числу " + intToDecimal(nb) + " в двоичной системе исчисления");
            case "012" -> System.out.println("Десятичное число " + nb + " равно числу " + intToTernary(nb) + " в троичной системе исчисления");
            case "0123456789abcdef" -> System.out.println("Десятичное число " + nb + " равно числу " + intToHexadecimal(nb) + " в шестнадцатеричной системе исчисления");
            case "котики" -> System.out.println("Десятичное число " + nb + " равно " + intToKotiki(nb) + "в системе исчисления в котиках");
            default -> System.out.println("Введена неизвестная система счисления, введите один из вариантов: \n01 \n012 \n0123456789abcdef \n\"котики\"");
        }
    }

    public static String intToDecimal(int nb) {
        while (nb != 0) {
            result = nb % 2 + result;
            nb = nb / 2;
        }
        return result;
    }

    public static String intToTernary(int nb) {
        while (nb != 0) {
            result = nb % 3 + result;
            nb = nb / 3;
        }
        return result;
    }

    public static String intToHexadecimal(int nb) {
        String hex = "";
        while (nb != 0) {
            hex = HEX.charAt(nb % 16) + hex;
            nb = nb / 16;
        }
        return hex;
    }

    public static String intToKotiki(int nb) {
        String kotik = ("\uD83D\uDE40 ");
        return kotik.repeat(nb);
    }
}
