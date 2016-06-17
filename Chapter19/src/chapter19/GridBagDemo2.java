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

public class GridBagDemo2
{

    public static void main(String[] args)
    {
        GridBagFrame2 gridBagFrame = new GridBagFrame2();
        gridBagFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gridBagFrame.setSize(300, 200);
        gridBagFrame.setVisible(true);
    }
}
