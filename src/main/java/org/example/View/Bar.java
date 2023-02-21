package org.example.View;

import javax.swing.*;

public class Bar extends JProgressBar {
    Bar(int max, int value){
        setMinimum(0);
        setMaximum(max);
        setValue(value);
        setOrientation(JSlider.VERTICAL);
        setSize(20, 100);
    }
}
