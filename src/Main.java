public class Main {
    public static void main(String[] args) {
        System.out.println("Здравствуйте!");
        System.out.println();
        BonusMilesService service = new BonusMilesService();
        int price = 19000;
        int miles = service.calculate(price);
        System.out.println(miles);

        System.out.println();

        System.out.println("Спасибо, что остаетесь с нами!");
    }
}