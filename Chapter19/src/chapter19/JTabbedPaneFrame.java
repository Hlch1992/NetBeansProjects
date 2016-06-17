/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter19;

/**
 *
 * @author Hlch1
 */
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class JTabbedPaneFrame extends JFrame
{
    // set up GUI

    public JTabbedPaneFrame()
    {
        super("JTabbedPane Demo ");

        JTabbedPane tabbedPane = new JTabbedPane(); // create JTabbedPane 

        // set up pane11 and add it to JTabbedPane
        JLabel label1 = new JLabel("panel one", SwingConstants.CENTER);
        JPanel panel1 = new JPanel();
        panel1.add(label1);
        tabbedPane.addTab("Tab One", null, panel1, "First Panel");

        // set up panel2 and add it to JTabbedPane
        JLabel label2 = new JLabel("panel two", SwingConstants.CENTER);
        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.YELLOW);
        panel2.add(label2);
        tabbedPane.addTab("Tab Two", null, panel2, "Second Panel");

        // set up panel3 and add it to JTabbedPane
        JLabel label3 = new JLabel("panel three");
        JPanel panel3 = new JPanel();
        panel3.setLayout(new BorderLayout());
        panel3.add(new JButton("North"), BorderLayout.NORTH);
        panel3.add(new JButton("West"), BorderLayout.WEST);
        panel3.add(new JButton("East"), BorderLayout.EAST);
        panel3.add(new JButton("South"), BorderLayout.SOUTH);
        panel3.add(label3, BorderLayout.CENTER);
        tabbedPane.addTab("Tab Three", null, panel3, "Third Panel");

        add(tabbedPane); // add JTabbedPane to frame
    }
}
