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

public class Metrics
{
    // execute application

    public static void main(String[] args)
    {
        // create frame for MetricsJPanel
        JFrame frame = new JFrame("Demonstrating FontMetrics");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MetricsJPanel metricsJPanel = new MetricsJPanel();
        frame.add(metricsJPanel);
        frame.setSize(510, 250);
        frame.setVisible(true);
    }
}
