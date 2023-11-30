public class BankTransferPayment implements Payment{
    @Override
    public void processPayment() {
        System.out.println("Banka Transferi ile ödemeniz gerçekleştirildi.");
    }
}
