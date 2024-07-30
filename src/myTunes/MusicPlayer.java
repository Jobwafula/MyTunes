// src/mytunes/MusicPlayer.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MusicPlayer extends JFrame {
    private JButton playButton, stopButton, pauseButton, unpauseButton, nextButton, prevButton;
    private LibraryPanel libraryPanel;

    public MusicPlayer() {
        setTitle("MyTunes");
        setLayout(new BorderLayout());
        
        // Create and add buttons
        JPanel buttonPanel = new JPanel();
        playButton = new JButton("Play");
        stopButton = new JButton("Stop");
        pauseButton = new JButton("Pause");
        unpauseButton = new JButton("Unpause");
        nextButton = new JButton("Next");
        prevButton = new JButton("Previous");
        
        buttonPanel.add(playButton);
        buttonPanel.add(stopButton);
        buttonPanel.add(pauseButton);
        buttonPanel.add(unpauseButton);
        buttonPanel.add(nextButton);
        buttonPanel.add(prevButton);
        
        add(buttonPanel, BorderLayout.SOUTH);

        // Create and add library panel
        libraryPanel = new LibraryPanel();
        add(libraryPanel, BorderLayout.CENTER);

        // Set button actions (placeholders for now)
        playButton.addActionListener(e -> System.out.println("Play button clicked"));
        stopButton.addActionListener(e -> System.out.println("Stop button clicked"));
        pauseButton.addActionListener(e -> System.out.println("Pause button clicked"));
        unpauseButton.addActionListener(e -> System.out.println("Unpause button clicked"));
        nextButton.addActionListener(e -> System.out.println("Next button clicked"));
        prevButton.addActionListener(e -> System.out.println("Previous button clicked"));
    }
}
