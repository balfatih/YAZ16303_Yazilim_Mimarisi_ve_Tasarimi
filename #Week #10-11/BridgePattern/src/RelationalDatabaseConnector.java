public class RelationalDatabaseConnector implements DatabaseConnector{

    protected DatabasePlatform platform;

    public RelationalDatabaseConnector(DatabasePlatform platform) {
        this.platform = platform;
    }
    @Override
    public void connect() {
        System.out.println("İlişkisel veri tabanına bağlandı... ");
        platform.configureConnection();
    }

    @Override
    public void executeQuery(String query) {
        System.out.println("Sorgu çalıştırıldı... :" + query);
    }
}
