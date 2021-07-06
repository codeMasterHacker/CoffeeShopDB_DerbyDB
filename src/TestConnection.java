import java.sql.*;

public class TestConnection 
{
    public static void main(String[] args) 
    {
        final String DB_PATH = "/home/enrique/Desktop/coding/java/coffeeDB/";
        final String DB_URL = "jdbc:derby:" + DB_PATH + "CoffeeDB";

        Connection conn = null;

        try 
        {
            conn = DriverManager.getConnection(DB_URL);
            System.out.println("Connection Established");

            conn.close();
            System.out.println("Connection Closed");
        } 
        catch (Exception e) 
        {
            System.out.println("ERROR: " + e.getMessage());

            try 
            {
                if (conn != null)
                conn.close();
            } 
            catch (Exception ex) { System.out.println("ERROR: " + ex.getMessage()); }
        }
    }
}
