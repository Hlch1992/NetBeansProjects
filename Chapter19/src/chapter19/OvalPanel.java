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
import java.awt.Graphics;
import java.awt.Dimension;
import javax.swing.JPanel;

public class OvalPanel extends JPanel
{

    private int diameter = 10;

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.fillOval(10, 10, diameter, diameter);
    }

    public void setDiameter(int newDiameter)
    {
        // if diameter invalid, default to 10
        diameter = (newDiameter >= 0 ? newDiameter : 10);
        repaint(); // repaint panel
    }

    // used by layout manager to determine preferred size
    public Dimension getPreferredSize()
    {
        return new Dimension(200, 200);
    }

    // used by layout manager to determine minimum size 
    public Dimension getMinimumSize()
    {
        return getPreferredSize();
    }
}
