public class MySqlConnection implements DatabasePlatform{
    @Override
    public void configureConnection() {
        System.out.println("MYSQL için bağlantısı sağlanıyor... ");
    }
}
