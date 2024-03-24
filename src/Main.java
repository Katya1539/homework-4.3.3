public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int sum = 1_000_000;
        int period = 12;
        double percent = 9.99;
        double payment = service.calculate(sum, percent, period);

        System.out.println(" Ежемесячный платеж " + (int) payment);

    }
}