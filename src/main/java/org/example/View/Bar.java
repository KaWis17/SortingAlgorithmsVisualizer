package org.example.View;

import javax.swing.*;
import java.awt.*;

public class Bar extends JProgressBar {
    Bar(int min, int max, int value){
        setMinimum(min);
        setMaximum(max);
        setValue(value);
        setOrientation(JSlider.VERTICAL);
        setBackground(Color.BLACK);
        setForeground(Color.RED);
        setSize(20, 100);
    }
}
