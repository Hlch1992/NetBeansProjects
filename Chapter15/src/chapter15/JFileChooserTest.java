/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter15;

/**
 *
 * @author Hlch1
 */
import java.io.IOException;
import javax.swing.JFrame;

public class JFileChooserTest
{
    public JFileChooserTest() throws IOException
    {
        JFileChooserDemo application = new JFileChooserDemo();
        application.setSize(420, 420);
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setVisible(true);
    }
}
