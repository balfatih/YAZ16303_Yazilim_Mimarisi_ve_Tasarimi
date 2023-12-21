public class NoSqlDatabaseConnector implements DatabaseConnector{

    protected DatabasePlatform platform;

    public NoSqlDatabaseConnector(DatabasePlatform platform) {
        this.platform = platform;
    }

    @Override
    public void connect() {
        System.out.println("NOSQL veri tabanına bağlanıyor.... ");
        platform.configureConnection();
    }

    @Override
    public void executeQuery(String query) {
        System.out.println("Soru çalışırıldı...." + query);
    }
}
