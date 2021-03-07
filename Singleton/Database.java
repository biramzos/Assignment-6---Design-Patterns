package singleton;

import java.sql.*;

public class Database
{
    private static String db = "Director";
    private static Connection con;
    private static Statement stmt;
    private static ResultSet res;
    private static Database instance;
    private static String password = "020716";
    public Database(String password,String db) throws SQLException
    {
        this.db = db;
        this.password = password;
        try
        {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + db,"postgres",password);
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }
    private Database() {}
    public static Database getInstance() {
        if (instance == null) instance = new Database();
        return instance;
    }
    public void query(String query) throws SQLException
    {
        Database.instance = new Database(password,db);
        stmt = con.createStatement();
        res = stmt.executeQuery(query);
        while(res.next())
        {
            System.out.println(res);
        }
    }
}
