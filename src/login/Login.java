
package login;


public class Login {
    
   

    static DatabaseConnection DBConnector;
    public static void main(String[] args) 
    {
        DBConnector = new DatabaseConnection();
        DBConnector.CreateDB();
        
        

        
       
    }
    
    
}
