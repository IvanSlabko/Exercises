import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите сообщение:");
        String line = in.nextLine();
        System.out.println("Ваше сообщение:");
        System.out.println(line);
        in.close();
    }
}
