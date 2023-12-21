public class MongoDbConnection implements DatabasePlatform{

    @Override
    public void configureConnection() {
        System.out.println("MongoDB için veri tabanı bağlantısı sağlanıyor... ");
    }
}
