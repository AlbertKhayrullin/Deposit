import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int deposit = 1_000_000; // первоначальная сумма вклада, условия вклада и пополнения без копеек
        double percent = 2.9;
        int replenishment = 0; // сумма пополнения
        int days = 180;       // установленный срок депозита
        int replenishmentDays = 0; // дни до окончания установленного срока депозита для дополненной суммы
        boolean answer = true;     // логическая переменная для прекращения или продления депозита
        int newdays;                  // дни продления депозита
        System.out.println("Вы разместили " + deposit + " руб. под " + percent + "% годовых");
        while (answer != false) {
            double incom = deposit * days / 365 * percent / 100 + replenishment * replenishmentDays / 365 * percent / 100;
            System.out.print("Ваш доход составит ");
            double scale = Math.pow(10, 2);                              // округление результата до копеек
            double result = Math.ceil(incom * scale) / scale;
            System.out.print((result));
            System.out.println(" руб.");
            System.out.println("На какую сумму Вы хотели бы Вы пополнить депозит? укажите сумму, если нет, то 0.");
            replenishment = scanner.nextInt();
            System.out.println("Укажите количество дней до окончания установленного срока депозита, если нет, то 0.");
            replenishmentDays = scanner.nextInt();
            incom = deposit * days * percent / 36500 + replenishment * replenishmentDays * percent / 36500;
            System.out.print("с учетом пополнения Ваш доход составит ");
            scale = Math.pow(10, 2);                              // округление результата до копеек
            result = Math.ceil(incom * scale) / scale;
            System.out.print((result));
            System.out.println(" руб.");
            System.out.println("Хотели бы Вы досрочно снять средства с депозита?, если да - false, если нет true.");
            if (!scanner.nextBoolean()) {
                answer = false;
                System.out.println("Увы, Ваш доход равен 0 руб.");
                break;
            }
            System.out.println("Хотели бы Вы продлить ваш депозит по окончании срока?, если нет false, если да true.");
            if (!scanner.nextBoolean()) {
                answer = false;
                break;
            } else {
                answer = true;
                System.out.println("Если да, то укажите на какое количество дней.");
                newdays = scanner.nextInt();
                if (answer = true) {
                    deposit = deposit + replenishment; // условия для расчета дохода для увеличенной суммы на новый срок
                    replenishment = 0;
                    replenishmentDays = 0;
                    days = newdays;
                }
            }
        }
    }
}


