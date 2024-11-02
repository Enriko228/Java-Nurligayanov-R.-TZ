import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
            System.out.println("Введите число а");
                int a = vvod.nextInt();
            System.out.println("Введите число b");
                int b = vvod.nextInt();

        if (a > b) {
            System.out.println("a больше b");
        } else if (a < b) {
            System.out.println("a меньше b");
        } else {
            System.out.println("a и b равны");
        }

        int c = a + b;
        int d = a - b;
        int e = a * b;

            System.out.println("Сумма:" + c);
            System.out.println("Разность:" + d);
            System.out.println("Произведение:" + e);

        if (b == 0) {
            System.out.println("Деление на ноль - харам");
        } else { int f = a / b;
            System.out.println("Частное:"+ f);
        }



    }
}
