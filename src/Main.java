public class Main {
    public static void main(String[] args) {
        int deposit = 1_000_000;
        double percent = 2.9;
        int replenishment = 2_000_000;
        int days = 90;
        int replenishmentDays = 30;
        int incom = (int) (deposit * days / 365 * percent / 100 + replenishment * replenishmentDays / 365 * percent / 100);
        System.out.print(incom);
        System.out.println(" руб.");
    }
}


