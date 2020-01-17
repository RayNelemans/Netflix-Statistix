public class Account extends DatabaseConnection{
    public String name;

    public void getAccount(){
        DatabaseConnection databaseConnection = new DatabaseConnection();
        databaseConnection.dbConnectionAccount("SELECT TOP 30 * FROM Account");



    }





}
