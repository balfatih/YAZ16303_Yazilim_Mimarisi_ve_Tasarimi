public class Main {
    public static void main(String[] args) {


        DatabaseConnector relationalDbConnector = new RelationalDatabaseConnector(new MySqlConnection());
        relationalDbConnector.connect();
        relationalDbConnector.executeQuery("SELECT * FROM tblUsers");



        DatabaseConnector noSqlDbConnector = new NoSqlDatabaseConnector(new MongoDbConnection());
        noSqlDbConnector.connect();
        noSqlDbConnector.executeQuery("db.users.find()");


    }
}