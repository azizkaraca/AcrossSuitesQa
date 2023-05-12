package Features.AcrossJDBC;

import java.sql.*;
import java.util.ArrayList;

public class DBase {

    public static Connection connection;
    public static Statement statement;

    public static ArrayList<ArrayList<String>> getListData(String sql) {
        DBConnectionOpen();
        ArrayList<ArrayList<String>> tablo = new ArrayList<>();

        try {
            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {

                ArrayList<String> satir = new ArrayList<>();
                for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
                    satir.add(rs.getString(i));
                }

                tablo.add(satir);
            }
        }
        catch (Exception e){
            System.out.println("e.getMessage() = " + e.getMessage());
        }
        DBConnectionClose();
        return tablo;
    }


    public static void DBConnectionOpen()
    {
        String hostUrl = "jdbc:mysql://10.10.10.79:32723/ACROSS_DB";
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
