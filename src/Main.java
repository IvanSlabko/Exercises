import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите сообщение:");
        String line = in.nextLine();
        System.out.println("Ваше сообщение:" + line);
        System.out.println("Хотите ввести еще?y/n");
        String line1 = in.nextLine();
        if (line1.equals("y")) {
            System.out.println("Введите сообщение:");
            String line2 = in.nextLine();
            System.out.println("Ваше сообщение:" + line2);
        }
            in.close();
        }
    }

