public class Main {
    public static void main(String[] args) {
        int score = 20; // Данный счёт на телефоне
        int Replenishment = 1150; // Пополнение счёта
        int bonus; // Бонусы

        if (Replenishment > 1000) {
            bonus = Replenishment / 20;
        } else {
            bonus = 0;
        }

        int balance = score + Replenishment + bonus;
        System.out.println("Добрый день, баланс успешно пополнен. Ваш баланс: " + balance + " руб. Ваш бонус: " + bonus + " руб.");
    }
}