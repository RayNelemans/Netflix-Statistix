public class Account {
    public int AccountID;

    public int getAccountID() {
        return AccountID;
    }

    public void getAccount(){
        DatabaseConnection databaseConnection = new DatabaseConnection();
        databaseConnection.dbConnectionAccount("SELECT TOP 30 * FROM Account");



    }





}
