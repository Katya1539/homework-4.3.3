public class CreditPaymentService {

    public int calculate(int sum, double percent, int period) {

        double z = percent / 100;
        double rate = z / period;                  // К = (М * (1 + М) ^ S) / ((1 + М) ^ S — 1) - коэффициент
        double x = Math.pow((1 + rate), period);
        double coefficient = (rate * x / x - 1);
        double payment = sum * coefficient;    // Х = С * К - аннуительный платеж

        return (int) payment;
    }
}