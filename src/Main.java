import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line;
        do{
            System.out.println("Введите сообщение:");
            line = in.nextLine();
            System.out.println("Ваше сообщение:" + line);
            System.out.println("Хотите ввести еще? y/n");
            line = in.nextLine();
         }while (line.equals("y"));
            in.close();
        }
    }

