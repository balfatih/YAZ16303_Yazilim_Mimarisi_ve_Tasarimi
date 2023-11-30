public class CreditCardPayment implements Payment{
    @Override
    public void processPayment() {
        System.out.println("Kredi Kartı ile ödemeniz gerçekleştirildi.");
    }
}
