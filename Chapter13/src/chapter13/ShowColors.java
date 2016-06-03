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
import javax.swing.JFrame;

public class ShowColors
{
    // execute application

    public static void main(String[] args)
    {
        // create frame for ColorJPanel
        JFrame frame = new JFrame("Using colors");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ColorJPanel colorJPanel = new ColorJPanel();
        frame.add(colorJPanel);
        frame.setSize(450, 200);
        frame.setVisible(true);
    }
}
