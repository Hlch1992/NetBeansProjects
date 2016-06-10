/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter12;

import javax.swing.*;
import java.awt.*;

public class ChapterTwelve {

    static int sum;

    public static void main(String[] args) {

//        String first = JOptionPane.showInputDialog("Enter first integer");
//        String second = JOptionPane.showInputDialog("Enter second integer");
//        try {
//            sum = Integer.parseInt(first) + Integer.parseInt(second);
//        } catch (Exception ex) {
//
//            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.PLAIN_MESSAGE);
//
//        }
//        JOptionPane.showMessageDialog(null, "the sum is " + sum, "Sum of Two Integers", JOptionPane.PLAIN_MESSAGE);
//        LabelFrame lf = new LabelFrame();
//        lf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        lf.setSize(260, 180);
//        lf.setVisible(true);
//        TextFieldFrame lt = new TextFieldFrame();
//        lt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        lt.setSize(400, 600);
//        lt.setVisible(true);
//        ButtonFrame btnFrame = new ButtonFrame();
//        btnFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        btnFrame.setSize(400, 600);
//        btnFrame.setVisible(true);
//        CheckBoxFrame chkBox = new CheckBoxFrame();
//        chkBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        chkBox.setSize(500,600);
//        chkBox.setVisible(true);
//        RadioButtonFrame chkBox = new RadioButtonFrame();
//
//        chkBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        chkBox.setSize(500, 600);
//        chkBox.setVisible(true);
        ComboBoxFrame chkBox = new ComboBoxFrame();

        chkBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        chkBox.setSize(500, 600);
        chkBox.setVisible(true);
//        ListFrame chkBox = new ListFrame();
//
//        chkBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        chkBox.setSize(500, 600);
//        chkBox.setVisible(true);
//        MultipleSelectionFrame chkBox = new MultipleSelectionFrame();
//        chkBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        chkBox.setSize(500, 600);
//        chkBox.setVisible(true);
//        MouseTrackerFrame chkBox = new MouseTrackerFrame();
//        chkBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        chkBox.setSize(500, 600);
//        chkBox.setVisible(true);
//        
//        MouseDetailsFrame chkBox = new MouseDetailsFrame();
//        chkBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        chkBox.setSize(500, 600);
//        chkBox.setVisible(true);
//        KeyDemoFrame chkBox = new KeyDemoFrame();
//        chkBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        chkBox.setSize(500, 600);
//        chkBox.setVisible(true);
//        FlowLayoutFrame chkBox = new FlowLayoutFrame();
//        chkBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        chkBox.setSize(500, 600);
//        chkBox.setVisible(true);
//        BorderLayoutFrame chkBox = new BorderLayoutFrame();
//        chkBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        chkBox.setSize(500, 600);
//        chkBox.setVisible(true);
//        GridLayoutFrame chkBox = new GridLayoutFrame();
//        chkBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        chkBox.setSize(500, 600);
//        chkBox.setVisible(true);
//        PanelFrame chkBox = new PanelFrame();
//        chkBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        chkBox.setSize(500, 600);
//        chkBox.setVisible(true);
        //Painter();
        
        Combobox();
    }

    public static void Painter() {
        JFrame app = new JFrame("Sim");
        PaintPanel pp = new PaintPanel();
        app.add(pp, BorderLayout.CENTER);
        app.add(new JLabel("Drag"), BorderLayout.SOUTH);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(500, 600);
        app.setVisible(true);
    }

    public static void Combobox() {

        ComboBoxFrame cb = new ComboBoxFrame();
        cb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cb.setSize(500, 600);

        cb.setVisible(true);

    }

    public static void TextBox() {
        TextAreaFrame chkBox = new TextAreaFrame();
        chkBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        chkBox.setSize(500, 600);
        chkBox.setVisible(true);
    }
}
