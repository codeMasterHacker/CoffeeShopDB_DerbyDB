import java.sql.*;

public class ShowCoffeeData 
{
    public static void main(String[] args) 
    {
        final String DB_PATH = "/home/enrique/Desktop/coding/java/coffeeDB/";
        final String DB_URL = "jdbc:derby:" + DB_PATH + "CoffeeDB";

        Connection conn = null;
        Statement stmt;
        String sqlStmt;
        ResultSet resultSet;

        try 
        {
            conn = DriverManager.getConnection(DB_URL);
            stmt = conn.createStatement();

            sqlStmt = "SELECT * FROM Coffee";
            resultSet = stmt.executeQuery(sqlStmt);

            System.out.println("Coffee Table Data");
            while (resultSet.next())
            {
                System.out.println("Description:" + resultSet.getString("Description") + 
                                    "\tProdNum:" + resultSet.getString("ProdNum") + 
                                    "\tPrice: $" + resultSet.getDouble("Price"));
            }

            conn.close();
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
