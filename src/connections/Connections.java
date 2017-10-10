
package connections;
import java.sql.*;

public class Connections {
 
    public static Connection openConnection(String driver, String url, String username, String password) throws Exception {
      try {
        Class.forName(driver).newInstance();
        return DriverManager.getConnection(url, username, password);
      }
      catch (SQLException sqle) {
        throw new Exception("Establishing new connection was not successful", sqle);
      }
      catch (ClassNotFoundException e) {
        throw new Exception("Did not found driver", e);
      }
    }

    
    public static boolean closeConnection(Connection connection) {
      if (connection!=null) {
        try {
          connection.close();
          return true;
        }
        catch (SQLException sqle) {
          return false;
        }
      }
      else {
        return false;
      }
    }

    
    public static boolean closeStatement(Statement statement) {
      if (statement!=null) {
        try {
          statement.close();
          return true;
        }
        catch (SQLException sqle) {
          return false;
        }
      }
      return false;
    }
    
    
    public static boolean closeResultSet(ResultSet resultset) {
      if (resultset!=null) {
        try {
          resultset.close();
          return true;
        }
        catch (SQLException sqle) {
          return false;
        }
      }
      return false;
    }
}



