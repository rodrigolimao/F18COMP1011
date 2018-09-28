package Model;

import java.sql.SQLException;

public class DBtest {

    public static void main(String[] args) {

        try {
            System.out.println(DBConnect.getOSs());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
