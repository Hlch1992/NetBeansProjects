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
import javax.swing.JFrame;

public class BoxLayoutDemo
{

    public static void main(String[] args)
    {
        BoxLayoutFrame boxLayoutFrame = new BoxLayoutFrame();
        boxLayoutFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        boxLayoutFrame.setSize(400, 220);
        boxLayoutFrame.setVisible(true);
    }
}
