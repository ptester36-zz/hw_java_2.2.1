public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();

        int bonus = service.calculate(42_000);
        System.out.println(bonus);

        int bonus2 = service.calculate(22_800);
        System.out.println(bonus2);

        int bonus3 = service.calculate(88_500);
        System.out.println(bonus3);

        int bonus4 = service.calculate(155_500);
        System.out.println(bonus4);
    }
}