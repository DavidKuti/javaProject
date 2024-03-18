/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaproject;

import java.awt.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

/**
 *
 * @author david
 */
public class main extends JFrame{
    JMenuBar mBar = new JMenuBar();
    JMenu mn1 = new JMenu("Home");
    JMenu mn2 = new JMenu("Book Ticket");
    JMenu mn3 = new JMenu("Sign Out");
    JPanel main = new JPanel();
    JPanel main2 = new JPanel();
    JLabel lb1,lb2,lb3,lb4,lb5,icon_;
    
    
    main(){
        this.setLayout(new BorderLayout());
        mn1.setFont(new Font("Serif", Font.BOLD, 20));
        mn2.setFont(new Font("Serif", Font.BOLD, 20));
        mn3.setFont(new Font("Serif", Font.BOLD, 20));
        mBar.add(mn1);
        mBar.add(mn2);
        mBar.add(mn3);
//        mBar.setFont(new Font("Serif", Font.BOLD, 50));
        add(mBar, BorderLayout.NORTH);
        
        mn1.addMenuListener(new MenuListener(){
            @Override
            public void menuSelected(MenuEvent e) {
                if(e.getSource() == mn1){
                    dispose();
                    main lp = new main();
                }
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void menuDeselected(MenuEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void menuCanceled(MenuEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
            
        });
        
        mn2.addMenuListener(new MenuListener(){
            @Override
            public void menuSelected(MenuEvent e) {
                if(e.getSource() == mn2){
                    dispose();
                    try {
                        ticketRes tf = new ticketRes();
                    } catch (SQLException ex) {
                        Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
    //                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }


            @Override
            public void menuDeselected(MenuEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void menuCanceled(MenuEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
            
        });
        
        mn3.addMenuListener(new MenuListener(){
            @Override
            public void menuSelected(MenuEvent e) {
                if(e.getSource() == mn3){
                    dispose();
                    try {
                        loginPage lp = new loginPage();
                    } catch (SQLException ex) {
                        Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void menuDeselected(MenuEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void menuCanceled(MenuEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
            
        });
        
        main.setLayout(new BorderLayout());
        icon_ = new JLabel();
        icon_.setIcon(new ImageIcon("C:\\Users\\david\\Documents\\GitHub\\javaProject\\javaProject\\src\\javaproject\\loginPic.png"));
        
        main2.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        main2.add(icon_,gbc);
        
        lb1 = new JLabel("Welcome to AirlineRes!");
        lb2 = new JLabel("Here at AirlineRes, We take our customer's safety to heart.");
        lb3 = new JLabel("Our customers' safety is our first priority. You can trust us to provide the most premium travelling experience");
        lb4 = new JLabel("You can book your reservations and view your reservations.");
        lb5 = new JLabel("Note!, Reserved tickets cannot be reversed!");
        
        
        lb1.setFont(new Font("Serif", Font.BOLD, 20));
        lb2.setFont(new Font("Serif", Font.BOLD, 20));
        lb3.setFont(new Font("Serif", Font.BOLD, 20));
        lb4.setFont(new Font("Serif", Font.BOLD, 20));
        lb5.setFont(new Font("Serif", Font.BOLD, 17));
        
        gbc.gridx = 0;
        gbc.gridy = 1;
        main2.add(lb1,gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 2;
        main2.add(lb2,gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 3;
        main2.add(lb3,gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 4;
        main2.add(lb4,gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.anchor = gbc.WEST;
        main2.add(lb5,gbc);
        
        add(main2, BorderLayout.CENTER);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setMinimumSize(new Dimension(1900,700));
        setVisible(true);
    }
    public static void main(String[] args) {
        main mn = new main();
    }
}
