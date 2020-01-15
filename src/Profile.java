public class Profile extends DatabaseConnection{

    public void getProfile(){
        DatabaseConnection databaseConnection = new DatabaseConnection();
        databaseConnection.DBConnection("SELECT TOP 2 * FROM Boek");
    }



}
