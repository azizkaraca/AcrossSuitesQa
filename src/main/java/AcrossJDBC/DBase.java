package AcrossJDBC;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.sql.*;
import java.util.ArrayList;

public class DBase {

    public static Connection connection;
    public static Statement statement;

    public static ArrayList<ArrayList<String>> getListData(String query) {

        ArrayList<ArrayList<String>> table = new ArrayList<>();

        DBConnectionOpen();

        try {
            ResultSet rs = statement.executeQuery(query);
            ResultSetMetaData rsmd = rs.getMetaData();

            for (int i = 1; i <= rsmd.getColumnCount(); i++)
                System.out.printf("%-20s", rsmd.getColumnName(i));
            System.out.println();

            while (rs.next()) {
                for (int i = 1; i <= rsmd.getColumnCount(); i++)
                    System.out.printf("%-20s", rs.getString(i));
                System.out.println();
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }

        DBConnectionClose();
        return table;
    }

    public static void DBConnectionOpen()
    {
        String hostUrl = "jdbc:mysql://10.10.10.79:32723/ACROSS_DB";
        //String hostUrl = "jdbc:mysql://192.168.200.160:30036/ACROSS_DB";
        String username = "basic";
        String password = "basicpass";

        try {
            connection = DriverManager.getConnection(hostUrl, username, password); // click the url  1.step
            statement = connection.createStatement(); // send query to execute queries
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static void DBConnectionClose(){
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
