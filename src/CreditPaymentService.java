public class CreditPaymentService {
    public int calculate(int loanAmount, int loanPeriod) {
        // процентная ставка (годовая) по условиям задачи = 9,99%
        double annualInterestRate = 0.0999;
        // вычисляем процент аннуитета
        double annuityRatio = annualInterestRate / 12 * Math.pow((1 + annualInterestRate / 12), loanPeriod) / (Math.pow((1 + annualInterestRate / 12), loanPeriod) - 1);
        // вычисляем размер ежемесячной выплаты (точное значение)
        double exactMonthlyPayment = loanAmount * annuityRatio;
        // округляем размер ежемесячной выплаты (до рублей)
        int monthlyPayment = (int) exactMonthlyPayment;
        return monthlyPayment;
    }
}