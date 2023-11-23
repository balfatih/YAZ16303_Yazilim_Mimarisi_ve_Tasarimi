//CONCRETE BUILDER SINIFI (Somut olarak oluşturulan sınıf)

public class EconomyTicketBuilder implements TicketBuilder{
    private Ticket ticket;
    @Override
    public void buildPassengerName() {
        ticket.setPassengerName("Bora Aslan");
    }

    @Override
    public void buildDepartureLocation() {
        ticket.setDepartureLocation("İstabul Atatürk Havalimanı");
    }

    @Override
    public void buildDestination() {
        ticket.setDestination("Milas-Bodrum Havalimanı");
    }

    @Override
    public void buildDate() {
        ticket.setDate("20-01-2024");
    }

    @Override
    public void buildSeatNumber() {
        ticket.setSeatNumber("1A");
    }

    @Override
    public Ticket getTicket() {
        return ticket;
    }

    public EconomyTicketBuilder() {
        this.ticket = new Ticket();
    }
}
