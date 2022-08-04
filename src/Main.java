public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 1000;
        int miles = service.calculate(price);
        System.out.println("За каждые 20 рублей, потраченные на билет, вам начисляется 1 миля. За эту покупку вам начислено " + miles +" бонус(ов)!");
    }
}