public interface DatabaseConnector {
    void connect();
    void executeQuery(String query);
}
