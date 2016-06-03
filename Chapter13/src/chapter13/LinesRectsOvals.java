/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter13;

/**
 *
 * @author Hlch1
 */
import java.awt.Color;
import javax.swing.JFrame;

public class LinesRectsOvals
{
    // execute application

    public static void main(String[] args)
    {
        // create frame for LinesRectsOvalsJPanel
        JFrame frame
                = new JFrame("Drawing lines, rectangles and ovals");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        LinesRectsOvalsJPanel linesRectsOvalsJPanel
                = new LinesRectsOvalsJPanel();
        linesRectsOvalsJPanel.setBackground(Color.WHITE);
        frame.add(linesRectsOvalsJPanel);
        frame.setSize(400, 210);
        frame.setVisible(true);
    }
}
