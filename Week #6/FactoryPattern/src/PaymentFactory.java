public class PaymentFactory {

    public Payment createPayment(String paymentType){


        if (paymentType.equalsIgnoreCase("CreditCard")){
            return new CreditCartPayment();
        } else if (paymentType.equalsIgnoreCase("BankTransfer")) {
            return new BankTransferPayment();
        } else if (paymentType.equalsIgnoreCase("PayPal")) {
            return new PayPalPayment();
        }

        return null;
    }

}
