package com.mathhelper.ui;

import com.mathhelper.ui.panel.OperationChooser;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Math_Helper extends JFrame {

    public Math_Helper(){
        this.setVisible(true);
        this.setSize(800,500);
        this.setTitle("Math Helper");
        try {
            BufferedImage img = ImageIO.read(new File("res/icon1.png"));
            this.setIconImage(img);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        JScrollPane pane = new JScrollPane(new OperationChooser());
        this.add(new OperationChooser());
    }

    public static void main(String[] args) {
        new Math_Helper();
    }

}
