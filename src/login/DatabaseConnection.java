
package login;

import java.sql.Connection;
import java.sql.DriverManager;


public class DatabaseConnection {
    public void CreateDB()
    {
        Connection con = null;
     try 
        {
        
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","TheSingleMan 123");
            if(con != null)
            {
              System.out.println("Connected Sucessfully");
            }
            
            
        }
        catch(Exception e)
        {
            System.out.println("Not Connected " + e);
        }
    
    }
    
}
