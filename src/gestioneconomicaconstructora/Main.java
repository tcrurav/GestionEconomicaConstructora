/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioneconomicaconstructora;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import login.FrmLogin;

/**
 *
 * @author Tiburcio
 */
public class Main {
    public static void main(String[] args){
        FrmLogin login = new FrmLogin("Constructora");
        //login.setVisible(true);
        
        //JFrame frame = new JFrame("HelloWorldSwing");
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());        
        panel.add(new JButton("W"), BorderLayout.NORTH);
        panel.add(new JButton("E"), BorderLayout.SOUTH);
        login.add(panel);
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        login.pack();
        login.setVisible(true);
    }
}
