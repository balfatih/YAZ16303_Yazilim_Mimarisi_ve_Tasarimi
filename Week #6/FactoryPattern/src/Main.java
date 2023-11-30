public class Main {
    public static void main(String[] args) {

        PaymentFactory paymentFactory = new PaymentFactory();



        Payment creditCardPayment =
                paymentFactory.createPayment("CreditCard");
        creditCardPayment.processPayment();

        Payment bankTransferPayment =
                paymentFactory.createPayment("BankTransfer");
        bankTransferPayment.processPayment();
    }
}