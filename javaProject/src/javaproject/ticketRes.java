
//        
//        GridBagConstraints gbc2 = new GridBagConstraints();
//        
//        jb3 = new JLabel();
//        pan3 = new JLabel("Airport of Destination");
//        pan3.setFont(new Font("Serif", Font.BOLD, 20));
//        jb3.setFont(new Font("Serif", Font.BOLD, 20));
//        jb3.setLayout(new GridBagLayout());
//        gbc2.anchor = gbc2.WEST;
//        gbc2.gridx= 0;
//        gbc2.gridy = 0;
//        jb3.add(pan3,gbc2);
//        
//        gbc2.anchor = gbc2.WEST;
//        gbc2.gridx= 0;
//        gbc2.gridy = 1;
//        jb3.add(combo1,gbc2);
//        jb3.setFont(new Font("Serif", Font.BOLD, 20));
//        gbc1.gridx = 0;
//        gbc1.gridy = 2;
//        mainS.add(jb3, gbc1);
//        
//        main.add(scrollPane, BorderLayout.CENTER);
//        add(main);
package javaproject;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
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
    JMenu mn3 = new JMenu("Sign Out");
    
    JFrame frame = new JFrame();
    ticketRes() throws SQLException{
        setLayout(new BorderLayout());
        mn1.setFont(new Font("Serif", Font.BOLD, 20));
        mn2.setFont(new Font("Serif", Font.BOLD, 20));
        mn3.setFont(new Font("Serif", Font.BOLD, 20));
        mBar.add(mn1);
        mBar.add(mn2);
        mBar.add(mn3);
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
        
        JLabel icon_,title, pan1,pan2,pan3,pan4;
        JPanel title_panel, form_panel, pane1,pane2,pane3,pane4;
        JButton submitBtn,register;
        
        title_panel =  new JPanel();
        form_panel =  new JPanel();
        form_panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        title_panel.setLayout(new FlowLayout());
        icon_ = new JLabel();
        title = new JLabel("Ticket Reservation Page");
        title.setFont(new Font("Serif",Font.BOLD,39));
        icon_.setIcon(new ImageIcon("C:\\Users\\david\\Documents\\GitHub\\javaProject\\javaProject\\src\\javaproject\\loginPic.png"));
//        icon_.setSize(10, 5);
        title_panel.add(icon_);
//        title_panel.add(title);
        validate();
        add(title_panel,BorderLayout.CENTER);
        pane1 = new JPanel();
        pane2 = new JPanel();
        pane3 = new JPanel();
        pane4 = new JPanel();
        pane1.setLayout(new BoxLayout(pane1, BoxLayout.Y_AXIS));
        pane2.setLayout(new BoxLayout(pane2, BoxLayout.Y_AXIS));
        pane3.setLayout(new BoxLayout(pane3, BoxLayout.Y_AXIS));
        pane4.setLayout(new BoxLayout(pane4, BoxLayout.Y_AXIS));
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JavaProject.class.getName()).log(Level.SEVERE, null, ex);
        }
            String url = "jdbc:sqlserver://localhost:1433;databaseName=AirlineResDB";
            String user = "sa";
            String pass = "123456";
            
            Connection con = DriverManager.getConnection(url, user, pass);
            System.out.println("Connection Succeeded!");
            
            GridBagConstraints gbc2 = new GridBagConstraints();
            gbc.gridx = 0;
            gbc.gridy = 5;
            gbc.insets = new Insets(0,0,10,0);
//            gbc.anchor = gbc.WEST;
            form_panel.add(title, gbc);
            
            pan1 = new JLabel("Airport of Destination");
            pan1.setFont(new Font("Serif", Font.BOLD, 20));
            pane1.setFont(new Font("Serif", Font.BOLD, 20));
            pane1.setLayout(new GridBagLayout());
            JComboBox combo1 = new JComboBox();
            combo1.setFont(new Font("Serif", Font.BOLD, 20));
            String size = "0";
            try{
                System.out.println("Connection Succeeded!");
                String query =  "select COUNT(DestinationID) from Destination";
                Statement st = con.createStatement();
                ResultSet rf = st.executeQuery(query);
                System.out.println(rf);
                while(rf.next()){
                    size = rf.getString(1);
                    System.out.println(size);
                }

                String query2 = "select DestinationAirportName from Destination;";
                ResultSet rf2 = st.executeQuery(query2);
                ArrayList<String> nations = new ArrayList<>();

                while(rf2.next()){
                    String cv = rf2.getString("DestinationAirportName");
                    nations.add(cv);
                }
                for(int i = 0; i < nations.size(); i++){
                    combo1.addItem(nations.get(i));
                    System.out.println(nations.get(i));
                }
            }catch(SQLException ee){
                System.out.println(ee);
            }
            gbc2.anchor = gbc2.WEST;
            gbc2.gridx= 0;
            gbc2.gridy = 0;
            pane1.add(combo1,gbc2);
            gbc.gridx = 0;
            gbc.gridy = 10;
            form_panel.add(pane1,gbc);
            
            pan2 = new JLabel("Airport City");
            pan2.setFont(new Font("Serif", Font.BOLD, 20));  
            pane2.setFont(new Font("Serif", Font.BOLD, 20));
            pane2.setLayout(new GridBagLayout());
            gbc2.anchor = gbc2.WEST;
            gbc2.gridx= 0;
            gbc2.gridy = 0;
            pane2.add(pan2,gbc2);
            TextField txt2 = new TextField(35);
            combo1.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e) {
                try{
                    String txt1 = (String) combo1.getSelectedItem();
                    String query =  "select City from Destination where "
                            + "DestinationAirportName = '" + txt1 + "'";
                    Statement st = con.createStatement();
                    ResultSet rf = st.executeQuery(query);
                    while(rf.next()){
                        txt2.setText(rf.getString(1));
                    }
                    }catch(SQLException eee){
                        System.out.println(eee);
                    }
                    txt2.setEditable(false);
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }   
            });
            
            gbc2.anchor = gbc2.WEST;
            gbc2.gridx= 0;
            gbc2.gridy = 1;
            pane2.add(txt2,gbc2);
            
            gbc.gridx = 0;
            gbc.gridy = 15;
            form_panel.add(pane2,gbc);
            
            pan3 = new JLabel("Airport Country");
            pan3.setFont(new Font("Serif", Font.BOLD, 20));
            pane3.setFont(new Font("Serif", Font.BOLD, 20));
            pane3.setLayout(new GridBagLayout());
            gbc2.anchor = gbc2.WEST;
            gbc2.gridx= 0;
            gbc2.gridy = 0;
            pane3.add(pan3,gbc2);
            TextField txt3 = new TextField(35);
            combo1.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e) {
                try{
                    String txt1 = (String) combo1.getSelectedItem();
                    String query =  "select Country from Destination where "
                            + "DestinationAirportName = '" + txt1 + "'";
                    Statement st = con.createStatement();
                    ResultSet rf = st.executeQuery(query);
                    while(rf.next()){
                        txt3.setText(rf.getString(1));
                    }
                    }catch(SQLException eee){
                        System.out.println(eee);
                    }
                    txt3.setEditable(false);
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }   
            });
            gbc2.anchor = gbc2.WEST;
            gbc2.gridx= 0;
            gbc2.gridy = 1;
            pane3.add(txt3,gbc2);
            
            gbc.gridx = 0;
            gbc.gridy = 30;
            form_panel.add(pane3,gbc);
            
            pan4 = new JLabel("Available Seats Positions");
            pan4.setFont(new Font("Serif", Font.BOLD, 20));
            pane4.setFont(new Font("Serif", Font.BOLD, 20));
            pane4.setLayout(new GridBagLayout());
            JComboBox combo2 = new JComboBox();
            combo2.setFont(new Font("Serif", Font.BOLD, 20));
            String seats = "0";
            try{
                System.out.println("Connection Succeeded!");
                String query =  "select COUNT(SeatNo) from SeatInfo";
                Statement st = con.createStatement();
                ResultSet rf = st.executeQuery(query);
                System.out.println(rf);
                while(rf.next()){
                    size = rf.getString(1);
                    System.out.println(size);
                }

                String query2 = "select SeatPosition from SeatInfo where ReservationStatus = 'No';";
                ResultSet rf2 = st.executeQuery(query2);
                ArrayList<String> availSeats = new ArrayList<>();

                while(rf2.next()){
                    String cf = rf2.getString("SeatPosition");
                    availSeats.add(cf);
                }
                for(int i = 0; i < availSeats.size(); i++){
                    combo2.addItem(availSeats.get(i));
                    System.out.println(availSeats.get(i));
                }
                
            }catch(SQLException ee){
                System.out.println(ee);
            }
            gbc2.anchor = gbc2.WEST;
            gbc2.gridx= 0;
            gbc2.gridy = 0;
            pane4.add(pan4,gbc2);
            
//            gbc2.anchor = gbc2.WEST;
            gbc2.gridx= 0;
            gbc2.gridy = 1;
            pane4.add(combo2,gbc2);
            
            gbc.gridx = 0;
            gbc.gridy = 50;
            form_panel.add(pane4,gbc);
            
            submitBtn = new JButton("Submit");
            gbc.anchor = gbc.EAST;
            gbc.gridy = 55;
            submitBtn.setFont(new Font("Serif", Font.BOLD, 20));

            form_panel.add(submitBtn, gbc);
            JScrollPane scrollPane = new JScrollPane(form_panel);
            
            submitBtn.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    String txt1 = (String) combo1.getSelectedItem();
                    String txt2 = (String) combo2.getSelectedItem();
                    String query =  "Insert into TicketInfo2 Values("
                                    + "getDate(),"
                                    + "'"+txt1+"',"
                                    + "'"+txt2+"'"
                                    + ")";
                    try {
                        Statement st = con.createStatement();
                        int rf3 = st.executeUpdate(query);
                        System.out.println(rf3);
                    } catch (SQLException ex) {
                        Logger.getLogger(ticketRes.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    JOptionPane.showMessageDialog(rootPane, "Ticket Reserved Successfully!");
                    dispose();
                }
            });
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setMinimumSize(new Dimension(1900,700));
            this.getContentPane().add(scrollPane, BorderLayout.CENTER);
//            setSize(800,800);
            setVisible(true);
    }       
    
    class exception extends RuntimeException{
        exception(){
            JOptionPane.showMessageDialog(frame,("Invalid Details!"));
        }
    }
    public static void main(String[] args) throws SQLException {
        ticketRes tr = new ticketRes();
    }
}
