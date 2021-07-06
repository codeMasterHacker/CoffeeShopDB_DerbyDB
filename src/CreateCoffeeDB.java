import java.sql.*;

public class CreateCoffeeDB
{
   public static void main(String[] args)
   {

      try
      {
         // Create a named constant for the URL.
         // NOTE: This value is specific for Java DB.
         final String DB_URL = "jdbc:derby:CoffeeDB;create=true";

         // Create a connection to the database.
         Connection conn = DriverManager.getConnection(DB_URL);

         // If the DB already exists, drop the tables.
         dropTables(conn);

         // Build the Coffee table.
         buildCoffeeTable(conn);

         // Close the connection.
         conn.close();
      } 
      catch (Exception e)
      {
         System.out.println("Error Creating the Coffee Table");
         System.out.println(e.getMessage());
      }

   }

   /**
    * The dropTables method drops any existing
    * in case the database already exists.
    */
   public static void dropTables(Connection conn)
   {
      System.out.println("Checking for existing tables.");

      try
      {
         // Get a Statement object.
         Statement stmt = conn.createStatement();
         
         // Drop the Coffee table.
         stmt.execute("DROP TABLE Coffee");
         System.out.println("Coffee table dropped.");
      } 
      catch (SQLException ex) {}
   }

   /**
    * The buildCoffeeTable method creates the
    * Coffee table and adds some rows to it.
    */
   public static void buildCoffeeTable(Connection conn)
   {
      try
      {
         // Get a Statement object.
         Statement stmt = conn.createStatement();

         // Create the table.
         stmt.execute("CREATE TABLE Coffee (" +
            "Description CHAR(25), " +
            "ProdNum CHAR(10) NOT NULL PRIMARY KEY, " +
            "Price DOUBLE " +
            ")");

         // Insert row #0.
         stmt.execute("INSERT INTO Coffee VALUES ( " +
            "'Bolivian Dark', " +
            "'14-001', " +
            "8.95 )");

         // Insert row #1.
         stmt.execute("INSERT INTO Coffee VALUES ( " +
            "'Bolivian Medium', " +
            "'14-002', " +
            "8.95 )");

         // Insert row #2.
         stmt.execute("INSERT INTO Coffee VALUES ( " +
            "'Brazilian Dark', " +
            "'15-001', " +
            "7.95 )");

         // Insert row #3.
         stmt.execute("INSERT INTO Coffee VALUES ( " +
            "'Brazilian Medium', " +
            "'15-002', " +
            "7.95 )");

         // Insert row #4.
         stmt.execute("INSERT INTO Coffee VALUES ( " +
            "'Brazilian Decaf', " +
            "'15-003', " +
            "8.55 )");

         // Insert row #5.
         stmt.execute("INSERT INTO Coffee VALUES ( " +
            "'Central American Dark', " +
            "'16-001', " +
            "9.95 )");

         // Insert row #6.
         stmt.execute("INSERT INTO Coffee VALUES ( " +
            "'Central American Medium', " +
            "'16-002', " +
            "9.95 )");

         // Insert row #1.
         stmt.execute("INSERT INTO Coffee VALUES ( " +
            "'Sumatra Dark', " +
            "'17-001', " +
            "7.95 )");

         // Insert row #7.
         stmt.execute("INSERT INTO Coffee VALUES ( " +
            "'Sumatra Decaf', " +
            "'17-002', " +
            "8.95 )");

         // Insert row #8.
         stmt.execute("INSERT INTO Coffee VALUES ( " +
            "'Sumatra Medium', " +
            "'17-003', " +
            "7.95 )");

         // Insert row #9.
         stmt.execute("INSERT INTO Coffee VALUES ( " +
            "'Sumatra Organic Dark', " +
            "'17-004', " +
            "11.95 )");

         // Insert row #10.
         stmt.execute("INSERT INTO Coffee VALUES ( " +
            "'Kona Medium', " +
            "'18-001', " +
            "18.45 )");

         // Insert row #11.
         stmt.execute("INSERT INTO Coffee VALUES ( " +
            "'Kona Dark', " +
            "'18-002', " +
            "18.45 )");

         // Insert row #12.
         stmt.execute("INSERT INTO Coffee VALUES ( " +
            "'French Roast Dark', " +
            "'19-001', " +
            "9.65 )");

         // Insert row #13.
         stmt.execute("INSERT INTO Coffee VALUES ( " +
            "'Galapagos Medium', " +
            "'20-001', " +
            "6.85 )");

         // Insert row #14.
         stmt.execute("INSERT INTO Coffee VALUES ( " +
            "'Guatemalan Dark', " +
            "'21-001', " +
            "9.95 )");

         // Insert row #15.
         stmt.execute("INSERT INTO Coffee VALUES ( " +
            "'Guatemalan Decaf', " +
            "'21-002', " +
            "10.45 )");

         // Insert row #16.
         stmt.execute("INSERT INTO Coffee VALUES ( " +
            "'Guatemalan Medium', " +
            "'21-003', " +
            "9.95 )");

         System.out.println("Coffee table created.");
      } 
      catch (SQLException ex)
      {
         System.out.println("ERROR: " + ex.getMessage());
      }
   }
}
