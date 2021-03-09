import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую строку");
        String stringOne = scanner.nextLine();
        System.out.println("Введите вторую строку");
        String stringTwo = scanner.nextLine();
        Pattern p = Pattern.compile(stringTwo.replace("*", ".*"));
        Matcher m = p.matcher(stringOne);
        if (m.matches()) {
            System.out.println("ОК");
        } else {
            System.out.println("КО");
        }
    }
}

