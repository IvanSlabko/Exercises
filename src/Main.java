import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите сообщение:");
        String line = in.nextLine();
        System.out.println("Ваше сообщение:" + line);
        System.out.println("Хотите ввести еще? y/n");
        line = in.nextLine();
        if (line.equals("y")) {
            System.out.println("Введите сообщение:");
            line = in.nextLine();
            System.out.println("Ваше сообщение:" + line);
        }
            in.close();
        }
    }

