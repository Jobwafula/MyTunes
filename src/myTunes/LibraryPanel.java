// src/mytunes/LibraryPanel.java
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class LibraryPanel extends JPanel {
    private JTable songTable;
    private DefaultTableModel tableModel;

    public LibraryPanel() {
        setLayout(new BorderLayout());
        
        // Define table columns
        String[] columnNames = {"Title", "Artist", "Album", "Year", "Genre", "Comment"};
        tableModel = new DefaultTableModel(columnNames, 0);
        songTable = new JTable(tableModel);
        add(new JScrollPane(songTable), BorderLayout.CENTER);
    }

    // Method to add a song to the table
    public void addSong(String title, String artist, String album, int year, String genre, String comment) {
        tableModel.addRow(new Object[]{title, artist, album, year, genre, comment});
    }
}
