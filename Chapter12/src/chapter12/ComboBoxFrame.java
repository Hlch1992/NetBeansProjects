/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter12;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ComboBoxFrame extends JFrame {

    private final JComboBox<String> Images;
    private final JLabel lbl;

    private static final String[] names = {"bug1.GIF", "bug2.GIF", "travelbug.gif", "buganim.gif"};
    private final Icon[] icons = {
        new ImageIcon(getClass().getResource(names[0])),
        new ImageIcon(getClass().getResource(names[1])),
        new ImageIcon(getClass().getResource(names[2])),
        new ImageIcon(getClass().getResource(names[3]))};

    public ComboBoxFrame() {
        super("Testing JcomboBox");
        setLayout(new FlowLayout());

        Images = new JComboBox<>(names);
        Images.setMaximumRowCount(3);
         add(Images);
        lbl = new JLabel(icons[0]);
        add(lbl);
        Images.addItemListener((ItemEvent event) -> {
            if (event.getStateChange() == ItemEvent.SELECTED) {
                lbl.setIcon(icons[Images.getSelectedIndex()]);
            }
        });
       
    }

}
