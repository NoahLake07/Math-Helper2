package com.mathhelper.ui.panel;

import javax.swing.*;
import java.awt.*;

public class OperationChooser extends JPanel {

    public OperationChooser(){
        setLayout(new GridLayout(operations.length,2));
        addButtons();
    }

    private void addButtons(){
        for (int i = 0; i < operations.length; i++) {
            this.add(new JButton(operations[i]));
        }
    }

    String[] operations = {
            "Operation One",
            "Operation Two",
            "Operation Three",
            "Operation Four",
            "Operation Five",
            "Operation Six",
            "Operation Seven",
            "Operation Eight"
    };

}
