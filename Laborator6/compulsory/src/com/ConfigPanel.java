package com;

import javax.swing.*;
import java.awt.*;

public class ConfigPanel extends JPanel {
    final MainFrame frame;
    JLabel label;
    JSpinner sizeField;
    JSpinner sidesField;
    JComboBox colorCombo;

    public ConfigPanel(MainFrame frame) {
        this.frame = frame;
        init();
    }


    private void init() {
        sizeField = new JSpinner(new SpinnerNumberModel(1, 1, 1000, 1));
        label = new JLabel(" Sides:");
        sidesField = new JSpinner(new SpinnerNumberModel(3, 3, 100, 1));
        sidesField.setValue(3);

        Color colors[] = {new Color((int) ((float) Math.random() * 255), (int) ((float) Math.random() * 255), (int) ((float) Math.random() * 255), (int) ((float) Math.random() * 255)), Color.YELLOW};

        colorCombo = new JComboBox(colors);
        add(sizeField);
        add(label);
        add(sidesField);
        add(colorCombo);

    }

}