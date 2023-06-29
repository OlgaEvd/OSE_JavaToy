import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Raffle r = new Raffle();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("""
                    _______________________________
                    Меню:
                    1 - Добавить игрушку
                    2 - Изменить частоту выпадения
                    3 - Провести розыгрыш
                    0 - Выход
                    >\s""");
            var selection = sc.next();
            switch (selection) {
                case "1" -> r.addToy();
                case "2" -> r.setFrequency();
                case "3" -> r.raffle();
                case "0" -> {
                    System.out.println("Выход выполнен");
                    System.exit(0);
                }
                default -> System.out.println("Выберите число из меню.");
            }
        }
    }
}