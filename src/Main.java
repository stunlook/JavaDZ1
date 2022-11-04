public class Main {
    public static void main(String[] args) {

        int price = 250;
        int amount_for_bonus = 20;
        int bonus = 1;

        System.out.println("Начисленые мили: " + price / amount_for_bonus * bonus);
    }
}