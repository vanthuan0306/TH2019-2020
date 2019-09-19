/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuan2;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author VanThuan
 */
public class DemoJPanel extends JFrame{
    public DemoJPanel(String title){
        setTitle(title);
        setVisible(true);
        setSize(400,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel pnFlow = new JPanel(new FlowLayout());//pnFlow.setLayout(new FlowLayout());
        pnFlow.setBackground(Color.PINK);
                //thanh phan
        JButton btn1 = new JButton("FlowLayout");
        JButton btn2 = new JButton("Them cac Control");
        JButton btn3 = new JButton("Trên 1 dòng");
        JButton btn4 = new JButton("Hết chỗ chứa");
        JButton btn5 = new JButton("Thì xuống dòng");
        
        pnFlow.add(btn1);
        pnFlow.add(btn2);
        pnFlow.add(btn3);
        pnFlow.add(btn4);
        pnFlow.add(btn5);
                
        Container con = getContentPane();
        con.add(pnFlow);
        
      
    }
    public static void main(String[] args) {
        com.dhpm11.tuan2.DemoJPanel demoJPanel = new com.dhpm11.tuan2.DemoJPanel("Demo FlowLayout");
        
    }
}
