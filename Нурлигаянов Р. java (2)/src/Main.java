import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
            System.out.println("Введите слово а");
        String a = vvod.nextLine();
            System.out.println("Введите слово b");
        String b = vvod.nextLine();

        if (a.equals(b)) {
            System.out.println("Слова идентичны");
        } else {
            System.out.println("Слова отличаются");
            }
        }
    }
