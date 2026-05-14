import database.DatabaseConnection;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        DatabaseConnection db = DatabaseConnection.getInstance();
        try {
            db.connect("users.db");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
