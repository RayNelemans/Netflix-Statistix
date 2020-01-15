public class Account extends DatabaseConnection{
    public String name;

    public void getAccount(){
        DatabaseConnection databaseConnection = new DatabaseConnection();
        databaseConnection.DBConnection("SELECT TOP 3 * FROM Boek");



    }





}
