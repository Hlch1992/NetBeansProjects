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
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class BoxLayoutFrame extends JFrame
{
    // set up GUI

    public BoxLayoutFrame()
    {
        super("Demonstrating BoxLayout");

        // create Box containers with BoxLayout
        Box horizontal1 = Box.createHorizontalBox();
        Box vertical1 = Box.createVerticalBox();
        Box horizontal2 = Box.createHorizontalBox();
        Box vertical2 = Box.createVerticalBox();

        final int SIZE = 3; // number of buttons on each Box

        // add buttons to Box horizontal1
        for (int count = 0; count < SIZE; count++)
        {
            horizontal1.add(new JButton("Button " + count));
        }

        // create strut and add buttons to Box vertical1
        for (int count = 0; count < SIZE; count++)
        {
            vertical1.add(Box.createVerticalStrut(25));
            vertical1.add(new JButton("Button " + count));
        }

        // create horizontal glue and add buttons to Box horizontal2
        for (int count = 0; count < SIZE; count++)
        {
            horizontal2.add(Box.createHorizontalGlue());
            horizontal2.add(new JButton("Button " + count));
        }

        // create rigid area and add buttons to Box vertical2
        for (int count = 0; count < SIZE; count++)
        {
            vertical2.add(Box.createRigidArea(new Dimension(12, 8)));
            vertical2.add(new JButton("Button " + count));
        }

        // create vertical glue and add buttons to panel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
 
         for (int count = 0; count < SIZE; count++)
        {
            panel.add(Box.createGlue());
            panel.add(new JButton("Button " + count));
        }

        // create a JTabbedPane
        JTabbedPane tabs = new JTabbedPane(
                JTabbedPane.TOP, JTabbedPane.SCROLL_TAB_LAYOUT);

        // place each container on tabbed pane
        tabs.addTab("Horizontal Box", horizontal1);
        tabs.addTab("Vertical Box with Struts", vertical1);
        tabs.addTab("Horizontal Box with Glue", horizontal2);
        tabs.addTab("Vertical Box with Rigid Areas", vertical2);
        tabs.addTab("Vertical Box with Glue", panel);

        add(tabs); // place tabbed pane on frame
    } // end BoxLayoutFrame constructor
}
