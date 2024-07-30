// src/mytunes/DatabaseManager.java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DatabaseManager {
    private static final String URL = "jdbc:sqlite:mytunes.db";
    
    public static Connection connect() throws Exception {
        return DriverManager.getConnection(URL);
    }

    public static void initialize() {
        try (Connection conn = connect();
             Statement stmt = conn.createStatement()) {
            // Create tables
            String sql = "CREATE TABLE IF NOT EXISTS songs (" +
                         "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                         "title TEXT, artist TEXT, album TEXT, " +
                         "year INTEGER, genre TEXT, comment TEXT, " +
                         "file_path TEXT)";
            stmt.execute(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
