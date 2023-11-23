//BUILDER (Oluşturucu): Ticket Arayüzü
public interface TicketBuilder {
    void buildPassengerName();
    void buildDepartureLocation();
    void buildDestination();
    void buildDate();
    void buildSeatNumber();
    Ticket getTicket();
}
