package singleton;
import java.sql.SQLException;
import java.util.*;
public class Main {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        /*String pass = sc.nextLine();
        String nmdb = sc.nextLine();
        String tableName = sc.nextLine();
        Database db =
        db.query("select * from " + tableName);*/
        Database foo = Database.getInstance();
        foo.query("SELECT * FROM employee");
        Database bar = Database.getInstance();
        bar.query("SELECT * FROM employee");
    }
}
