import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.sound.sampled.*;

public class MusicPlayer extends JFrame implements ActionListener, ChangeListener {
    private JButton playButton, pauseButton, stopButton;
    private JSlider volumeSlider;
    private JLabel titleLabel;
    private Clip clip;

    public MusicPlayer() {
        super("Music Player");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Add title label
        titleLabel = new JLabel();
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        add(titleLabel, BorderLayout.NORTH);

        // Add buttons
        JPanel buttonPanel = new JPanel(new FlowLayout());
        playButton = new JButton("Play");
        playButton.addActionListener(this);
        pauseButton = new JButton("Pause");
        pauseButton.addActionListener(this);
        stopButton = new JButton("Stop");
        stopButton.addActionListener(this);
        buttonPanel.add(playButton);
        buttonPanel.add(pauseButton);
        buttonPanel.add(stopButton);
        add(buttonPanel, BorderLayout.CENTER);

        // Add volume slider
        volumeSlider = new JSlider(0, 100, 50);
        volumeSlider.addChangeListener(this);
        add(volumeSlider, BorderLayout.SOUTH);

        // Set up window
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == playButton) {
            try {
                clip.start();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else if (e.getSource() == pauseButton) {
            clip.stop();
        } else if (e.getSource() == stopButton) {
            clip.stop();
            clip.setFramePosition(0);
        }
    }

    public void stateChanged(ChangeEvent e) {
        if (e.getSource() == volumeSlider) {
            float volume = volumeSlider.getValue() / 100f;
            clip.setFramePosition(0);
            FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            gainControl.setValue(20f * (float) Math.log10(volume));
        }
    }

    public void playMusic(String filename) {
        try {
            // Open audio file
            File file = new File(filename);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);

            // Get audio format and clip
            AudioFormat format = audioStream.getFormat();
            DataLine.Info info = new DataLine.Info(Clip.class, format);
            clip = (Clip) AudioSystem.getLine(info);

            // Open clip and set audio data
            clip.open(audioStream);

            // Set up volume control
            float volume = volumeSlider.getValue() / 100f;
            FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            gainControl.setValue(20f * (float) Math.log10(volume));

            // Set title label
            titleLabel.setText(file.getName());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();
        player.playMusic("Afterhours - BIR.mp3");
    }
}
