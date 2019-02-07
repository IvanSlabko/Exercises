import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число:");
        int a = in.nextInt();
        System.out.print("Введите число:");
        int b = in.nextInt();
        System.out.print("Сумма:");
        System.out.println(a+b);

        System.out.print("Введите число:");
        a = in.nextInt();
        System.out.print("Введите число:");
        b = in.nextInt();
        System.out.print("Разность:");
        System.out.println(a-b);

        System.out.print("Введите число:");
        a = in.nextInt();
        System.out.print("Введите число:");
        b = in.nextInt();
        System.out.print("Произведение:");
        System.out.println(a*b);

        System.out.print("Введите число:");
        a = in.nextInt();
        System.out.print("Введите число:");
        b = in.nextInt();
        System.out.print("Частное:");
        System.out.println(a/b);
        in.close();
    }
}