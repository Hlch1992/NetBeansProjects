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
  
    public class LookAndFeelDemo
    {
       public static void main(String[] args)
       {
          LookAndFeelFrame lookAndFeelFrame = new LookAndFeelFrame();
         lookAndFeelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         lookAndFeelFrame.setSize(400, 220);
         lookAndFeelFrame.setVisible(true);
      }
   }