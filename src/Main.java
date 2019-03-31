import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String line;
            int j=0;
            String[] str = new String[10];
            do {
                System.out.println("Введите сообщение:");
                line = in.nextLine();
                str[j] = line;
                for (int i=0; i < str.length; i++) {
                    System.out.println("Ваше сообщение:" + str[i]);
                }
                j++;
                    System.out.println("Хотите ввести еще? y/n");
                    line = in.nextLine();
            } while (line.equals("y")) ;
            in.close();
        }
        }



