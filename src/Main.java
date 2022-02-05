public class Main {
    public static void main(String[] args) {
        // Создание объекта
        CreditPaymentService service = new CreditPaymentService();
        // Переменные: s - loan amount [rubles]
        int s = 1_000_000;
        // Loan for 1 year
        int monthlyPayment1 = service.calculate(s, 12);
        System.out.println("If you take 1 million rubles for 1 year, you have to pay the bank " + monthlyPayment1 + " rubles a month");
        // Loan for 2 years
        int monthlyPayment2 = service.calculate(s, 24);
        System.out.println("If you take 1 million rubles for 2 years, you have to pay the bank " + monthlyPayment2 + " rubles a month");
        // Loan for 3 years
        int monthlyPayment3 = service.calculate(s, 36);
        System.out.println("If you take 1 million rubles for 3 years, you have to pay the bank " + monthlyPayment3 + " rubles a month");
    }
}
