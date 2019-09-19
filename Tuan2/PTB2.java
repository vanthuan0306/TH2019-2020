/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuan2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
/**
 *
 * @author VanThuan
 */
public class PTB2 extends JFrame{
    public PTB2(String title) {
        setTitle(title);
        setLocationRelativeTo(null);
        setSize(400, 300);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //panel GPTB2
        JPanel pnBorder = new JPanel();
        pnBorder.setLayout(new BorderLayout());
        
        JPanel pnNorth = new JPanel();
        JLabel lblTieuDe = new JLabel("Giải phường trình bậc 2");
        pnNorth.add(lblTieuDe);
        pnBorder.add(pnNorth,BorderLayout.NORTH);
        lblTieuDe.setForeground(Color.BLUE);
        Font ft = new Font("arial", Font.BOLD, 25) ;
        lblTieuDe.setFont(ft);
        
        //công cụ
        JPanel pnSouth = new JPanel();
        JButton btnGiai = new JButton("Giải");
        JButton btnXoa = new JButton("Xóa Trắng");
        JButton btnThoat =new JButton("Thoát");
        pnSouth.add(btnGiai);
        pnSouth.add(btnXoa);
        pnSouth.add(btnThoat);
        
        pnBorder.add(pnSouth,BorderLayout.SOUTH);
        pnSouth.setBackground(Color.LIGHT_GRAY);
        Border southborder = BorderFactory.createLineBorder(Color.RED);
        TitledBorder southTitleBorder = new TitledBorder(southborder,"Chọn thao tác:");
        pnSouth.setBorder (southTitleBorder);
        
        JPanel pnCenter = new JPanel();
        pnCenter.setLayout(new BoxLayout(pnCenter, BoxLayout.Y_AXIS));
        pnBorder.add(pnCenter,BorderLayout.CENTER);
        Border centerborder = BorderFactory.createLineBorder(Color.RED);
        TitledBorder centerTitleBorder = new TitledBorder(centerborder, "Nhập a, b, c:");
        pnCenter.setBorder(centerTitleBorder);
        
        JPanel pna = new JPanel();
        JLabel lbla = new JLabel("Nhập a:");
        final JTextField txtSoa = new JTextField(15);
        pna.add(lbla);
        pna.add(txtSoa);
        pnCenter.add(pna);
        
        JPanel pnb = new JPanel();
        JLabel lblb = new JLabel("Nhập b:");
        final JTextField txtSob = new JTextField(15);
        pna.add(lblb);
        pna.add(txtSob);
        pnCenter.add(pnb);
        
        JPanel pnc = new JPanel();
        JLabel lblc = new JLabel("Nhập c:");
        final JTextField txtSoc = new JTextField(15);
        pna.add(lblc);
        pna.add(txtSoc);
        pnCenter.add(pnc);
        
        JPanel pnkq = new JPanel();
        TextArea takq = new TextArea("Kết quả:");
        JLabel lblkq = new JLabel();
        final JTextField txtkq = new JTextField(15);
        pna.add(lblkq);
        pna.add(txtkq);
        pnCenter.add(pnkq);
        
        lbla.setPreferredSize(lblkq.getPreferredSize());
        lblb.setPreferredSize(lblkq.getPreferredSize());
        lblc.setPreferredSize(lblkq.getPreferredSize());
        
        //thoát
        btnThoat.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                int ret=JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn thoát chương trình???", "Thoát", JOptionPane.YES_NO_OPTION);
                if(ret==JOptionPane.YES_OPTION)
                    System.exit(0);
            }
        });
        
        //xóa
        btnXoa.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent arg0) {
            txtSoa.setText("");
            txtSob.setText("");
            txtSoc.setText("");
            txtkq.setText("");
            
            }
        });
        btnGiai.addActionListener(new ActionListener() {

        public void actionPerformed(ActionEvent arg0) {
            String soa=txtSoa.getText();
            
        int a=0;
            try {
                a=Integer.parseInt(soa);
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null, "Định dạng sai!");
            
            txtSoa.selectAll();
            txtSoa.requestFocus();
            return;
            }
        
        String sob=txtSob.getText();
        int b=0;
            try {
                b = Integer.parseInt(sob);
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null, "Định dạng sai!");
            
            txtSob.selectAll();
            txtSob.requestFocus();
            return;
            }
            
            String soc=txtSoc.getText();
        int c=0;
            try {
                c = Integer.parseInt(soc);
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null, "Định dạng sai!");
            
            txtSoc.selectAll();
            txtSoc.requestFocus();
            return;
            }
            
            String kq="";
            RunPTB2 run=new RunPTB2(a, b, c);
            kq=run.compute();
            txtkq.setText(kq);
        }
        });
        
        Container con=getContentPane();

con.add(pnBorder);

}
    
        
    public static void main(String[] args) {
        PTB2 ptb2 = new PTB2("ptb2");
    }
}
    

