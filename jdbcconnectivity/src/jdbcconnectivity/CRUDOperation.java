
package jdbcconnectivity;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUDOperation {
    static Connection cn;

    public CRUDOperation() {
        cn = Connecction1.getConnection();
    }

    public static void save() {
        try {
            Statement st = cn.createStatement();
            String sql = "insert into studentinfo values('adhar4', 'dahara', 'dakor', 1234567898)";
            int k = st.executeUpdate(sql);
            if (k > 0) {
                System.out.println("Insert done!!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static void delete() {
        String sql1 = "delete from studentinfo where studadrno = 'adhar4'";
        try {
            Statement s2 = cn.createStatement();
            int r = s2.executeUpdate(sql1); 
            if (r > 0) {
                System.out.println("Record deleted!!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void update() {
        String sql2 = "update studentinfo set studname = 'kapur', studaddr = 'ahem', phoneno = 1234567898 where studadrno = 'adhar3'";
        try {
            Statement s3 = cn.createStatement();
            int r = s3.executeUpdate(sql2); 
            if (r > 0) {
                System.out.println("Record updated!!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
