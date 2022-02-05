public class CreditPaymentService {
    public int calculate(int loanAmount, int loanPeriod) {
        double annuityRatio = 0.008325 * Math.pow(1.008325, loanPeriod) / (Math.pow(1.008325, loanPeriod) - 1);
        double exactMonthlyPayment = loanAmount * annuityRatio;
        int monthlyPayment = (int) exactMonthlyPayment;
        return monthlyPayment;
    }
}