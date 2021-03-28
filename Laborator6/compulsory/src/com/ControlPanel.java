package com;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ControlPanel extends JPanel {

    MainFrame frame;
    JButton saveBtn = new JButton("Save");
    JButton loadBtn = new JButton("Load");
    JButton exitBtn = new JButton("Exit");
    JButton resetBtn = new JButton("Reset");

    public ControlPanel(MainFrame frame) {
        this.frame = frame;
        init();
    }

    public void init() {
        setLayout(new GridLayout(1, 4));
        add(saveBtn);
        add(loadBtn);
        add(exitBtn);
        add(resetBtn);

        exitBtn.addActionListener(this::exit);
        saveBtn.addActionListener(this::save);
        loadBtn.addActionListener(this::load);
    }

    private void exit(ActionEvent e) {
        frame.dispose();
    }

    private void save(ActionEvent e) {
        try {
            ImageIO.write(frame.canvas.image, "PNG", new File("d:/test.png"));
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }

    private void load(ActionEvent actionEvent) {
        try {
            File input = new File("d:/test.png");
            ImageIO.read(input);
        } catch (IOException ie) {
            System.out.println(ie.getMessage());
        }
    }

}
