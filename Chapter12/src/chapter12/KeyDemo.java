/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter12;

/**
 *
 * @author Hlch1
 */
import javax.swing.JFrame;

public class KeyDemo
{
    public static void main(String[] args)
      {
         KeyDemoFrame keyDemoFrame = new KeyDemoFrame();
         keyDemoFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         keyDemoFrame.setSize(350, 150);
         keyDemoFrame.setVisible(true);
      }
}
