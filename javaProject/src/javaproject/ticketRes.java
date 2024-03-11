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
import javax.swing.JPanel;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

/**
 *
 * @author david
 */
public class ticketRes extends JFrame{
    JMenuBar mBar = new JMenuBar();
    JMenu mn1 = new JMenu("Home");
    JMenu mn2 = new JMenu("Book Ticket");
    JMenu mn3 = new JMenu("View Reservations");
    JMenu mn4 = new JMenu("Sign Out");
    JPanel main = new JPanel();
    JLabel jb1, jb2, jb3, jb4, icon_;
    ticketRes(){
        this.setLayout(new BorderLayout());
        mn1.setFont(new Font("Serif", Font.BOLD, 20));
        mn2.setFont(new Font("Serif", Font.BOLD, 20));
        mn3.setFont(new Font("Serif", Font.BOLD, 20));
        mn4.setFont(new Font("Serif", Font.BOLD, 20));
        mBar.add(mn1);
        mBar.add(mn2);
        mBar.add(mn3);
        mBar.add(mn4);
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
                    ticketRes tf = new ticketRes();
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

        mn4.addMenuListener(new MenuListener(){
            @Override
            public void menuSelected(MenuEvent e) {
                if(e.getSource() == mn4){
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
        
        main.setBackground(Color.BLACK);
        main.setLayout(new FlowLayout());
        JLabel icon_,title;
        JPanel title_panel;
        title_panel =  new JPanel();
        title_panel.setLayout(new FlowLayout());
        icon_ = new JLabel();
        title = new JLabel("Login Page");
        title.setFont(new Font("Serif",Font.BOLD,39));
        icon_.setIcon(new ImageIcon("C:\\Users\\david\\Documents\\GitHub\\javaProject\\javaProject\\src\\javaproject\\loginPic.png"));
//        icon_.setSize(10, 5);
        title_panel.add(icon_);
//        title_panel.add(title);
        validate();
        main.add(title_panel);
        
        jb1 = new JLabel("Welcome to AirineRes\n Reservation Page.");
        jb1.setForeground(Color.red);
        jb1.setFont(new Font("Serif", Font.BOLD, 50));
//        jb1.setBounds(20, 10, 1000,40);
        main.add(jb1);
        add(main);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setMinimumSize(new Dimension(1900,700));
        setVisible(true);
    }
    
    public static void main(String[] args) {
        ticketRes tr = new ticketRes();
    }
}
