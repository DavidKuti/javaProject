/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaproject;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author david
 */
public class JavaProject extends JFrame{
    JFrame frame = new JFrame();
    JLabel icon_,title, pan1,pan2,pan3,pan4,pan5,pan6,pan7,pan8,pan9;
    JPanel title_panel, form_panel, pane1,pane2,pane3,pane4,pane5,pane6,pane7,pane8,pane9;
    JButton submitBtn,login;
    String txt8;
    
    JavaProject() throws SQLException{
        
        setLayout(new BorderLayout());
        title_panel =  new JPanel();
        form_panel =  new JPanel();
        form_panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        title_panel.setLayout(new FlowLayout());
        icon_ = new JLabel();
        title = new JLabel("Customer Registration Page");
        title.setFont(new Font("Serif",Font.BOLD,39));
        icon_.setIcon(new ImageIcon("C:\\Users\\david\\Documents\\GitHub\\javaProject\\javaProject\\src\\javaproject\\download2.png"));
//        icon_.setSize(10, 5);
        title_panel.add(icon_);
//        title_panel.add(title);
        validate();
        add(title_panel,BorderLayout.NORTH);
        pane1 = new JPanel();
        pane2 = new JPanel();
        pane3 = new JPanel();
        pane4 = new JPanel();
        pane5 = new JPanel();
        pane6 = new JPanel();
        pane7 = new JPanel();
        pane8 = new JPanel();
        pane9 = new JPanel();
        
        pane1.setLayout(new BoxLayout(pane1, BoxLayout.Y_AXIS));
        pane2.setLayout(new BoxLayout(pane2, BoxLayout.Y_AXIS));
        pane3.setLayout(new BoxLayout(pane3, BoxLayout.Y_AXIS));
        pane4.setLayout(new BoxLayout(pane4, BoxLayout.Y_AXIS));
        pane5.setLayout(new BoxLayout(pane5, BoxLayout.Y_AXIS));
        pane6.setLayout(new BoxLayout(pane6, BoxLayout.Y_AXIS));
        pane7.setLayout(new BoxLayout(pane7, BoxLayout.Y_AXIS));
        pane8.setLayout(new BoxLayout(pane8, BoxLayout.Y_AXIS));
        pane9.setLayout(new BoxLayout(pane9, BoxLayout.Y_AXIS));
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
            
            pan1 = new JLabel("First Name");
            pan1.setFont(new Font("Serif", Font.BOLD, 20));
            pane1.setFont(new Font("Serif", Font.BOLD, 20));
            pane1.setLayout(new GridBagLayout());
            gbc2.anchor = gbc2.WEST;
            gbc2.gridx= 0;
            gbc2.gridy = 0;
            pane1.add(pan1,gbc2);
            TextField txt1 = new TextField(35);
            gbc2.anchor = gbc2.WEST;
            gbc2.gridx= 0;
            gbc2.gridy = 1;
            pane1.add(txt1,gbc2);
            
            gbc.gridx = 0;
            gbc.gridy = 10;
            form_panel.add(pane1,gbc);
            
            pan2 = new JLabel("Last Name");
            pan2.setFont(new Font("Serif", Font.BOLD, 20));  
            pane2.setFont(new Font("Serif", Font.BOLD, 20));
            pane2.setLayout(new GridBagLayout());
            gbc2.anchor = gbc2.WEST;
            gbc2.gridx= 0;
            gbc2.gridy = 0;
            pane2.add(pan2,gbc2);
            TextField txt2 = new TextField(35);
            gbc2.anchor = gbc2.WEST;
            gbc2.gridx= 0;
            gbc2.gridy = 1;
            pane2.add(txt2,gbc2);

            pan3 = new JLabel("Nationality");
            pan3.setFont(new Font("Serif", Font.BOLD, 20));
            pane3.setFont(new Font("Serif", Font.BOLD, 20));
            pane3.setLayout(new GridBagLayout());
            gbc2.anchor = gbc2.WEST;
            gbc2.gridx= 0;
            gbc2.gridy = 0;
            pane3.add(pan3,gbc2);
            JComboBox combo1 = new JComboBox();
            combo1.setFont(new Font("Serif", Font.BOLD, 20));
            String[] nations = {"Nigerian", "Japanese", "British",
                                "Chinese", "Portugese", "American", 
                                "Malaysian"};
            for(int i = 0; i < nations.length; i++){
                combo1.addItem(nations[i]);
            }
            String txt3 = (String) combo1.getSelectedItem();
            gbc2.anchor = gbc2.WEST;
            gbc2.gridx= 0;
            gbc2.gridy = 1;
            pane3.add(combo1,gbc2);

            pan4 = new JLabel("National Identification Number(NIN)");
            pan4.setFont(new Font("Serif", Font.BOLD, 20));
            pane4.setFont(new Font("Serif", Font.BOLD, 20));
            pane4.setLayout(new GridBagLayout());
            gbc2.anchor = gbc2.WEST;
            gbc2.gridx= 0;
            gbc2.gridy = 0;
            pane4.add(pan4,gbc2);
            TextField txt4 = new TextField(35);
            gbc2.anchor = gbc2.WEST;
            gbc2.gridx= 0;
            gbc2.gridy = 1;
            pane4.add(txt4,gbc2);

            pan5 = new JLabel("Contact Number(+234)");
            pan5.setFont(new Font("Serif", Font.BOLD, 20));
            pane5.setFont(new Font("Serif", Font.BOLD, 20));
            pane5.setLayout(new GridBagLayout());
            gbc2.anchor = gbc2.WEST;
            gbc2.gridx= 0;
            gbc2.gridy = 0;
            pane5.add(pan5,gbc2);
            TextField txt5 = new TextField(35);
            gbc2.anchor = gbc2.WEST;
            gbc2.gridx= 0;
            gbc2.gridy = 1;
            pane5.add(txt5,gbc2);
            
            gbc.gridx = 0;
            gbc.gridy = 15;
            form_panel.add(pane2,gbc);

            gbc.gridx = 0;
            gbc.gridy = 20;
            gbc.anchor = gbc.WEST;
            form_panel.add(pane3,gbc);

            gbc.gridx = 0;
            gbc.gridy = 25;
            gbc.anchor = gbc.WEST;
            form_panel.add(pane4,gbc);

            gbc.gridx = 0;
            gbc.gridy = 30;
            form_panel.add(pane5,gbc);
            
            pan6 = new JLabel("Residential Address");
            pan6.setFont(new Font("Serif", Font.BOLD, 20));
            pane6.setFont(new Font("Serif", Font.BOLD, 20));
            pane6.setLayout(new GridBagLayout());
            gbc2.anchor = gbc2.WEST;
            gbc2.gridx= 0;
            gbc2.gridy = 0;
            pane6.add(pan6,gbc2);
            TextField txt6 = new TextField(35);
            gbc2.anchor = gbc2.WEST;
            gbc2.gridx= 0;
            gbc2.gridy = 1;
            pane6.add(txt6,gbc2);
            
            gbc.gridx = 0;
            gbc.gridy = 35;
            form_panel.add(pane6,gbc);
            
            pan7 = new JLabel("Postal Code");
            pan7.setFont(new Font("Serif", Font.BOLD, 20));
            pane7.setFont(new Font("Serif", Font.BOLD, 20));
            pane7.setLayout(new GridBagLayout());
            gbc2.anchor = gbc2.WEST;
            gbc2.gridx= 0;
            gbc2.gridy = 0;
            pane7.add(pan7,gbc2);
            TextField txt7 = new TextField(35);
            gbc2.anchor = gbc2.WEST;
            gbc2.gridx= 0;
            gbc2.gridy = 1;
            pane7.add(txt7,gbc2);
            
            gbc.gridx = 0;
            gbc.gridy = 40;
            form_panel.add(pane7,gbc);
            
            pan8 = new JLabel("Gender");
            pan8.setFont(new Font("Serif", Font.BOLD, 20));
            pane8.setFont(new Font("Serif", Font.BOLD, 20));
            pane8.setLayout(new GridBagLayout());
            gbc2.anchor = gbc2.WEST;
            gbc2.gridx= 0;
            gbc2.gridy = 0;
            pane8.add(pan8,gbc2);
            JRadioButton male, female, other;
            ButtonGroup bg;
            male = new JRadioButton("Male");
            female = new JRadioButton("Female");
            other = new JRadioButton("Others");
            male.setFont(new Font("Serif", Font.BOLD, 20));
            female.setFont(new Font("Serif", Font.BOLD, 20));
            other.setFont(new Font("Serif", Font.BOLD, 20));
            bg = new ButtonGroup();
            bg.add(male);
            bg.add(female);
            bg.add(other);
            gbc2.anchor = gbc2.WEST;
            gbc2.gridx= 0;
            gbc2.gridy = 1;
            pane8.add(male,gbc2);
            gbc2.gridx= 1;
            gbc2.gridy = 1;
            pane8.add(female,gbc2);
            gbc2.gridx= 2;
            gbc2.gridy = 1;
            pane8.add(other,gbc2);
            
            
            gbc.gridx = 0;
            gbc.gridy = 45;
            form_panel.add(pane8,gbc);
            
            pan9 = new JLabel("Password");
            pan9.setFont(new Font("Serif", Font.BOLD, 20));
            pane9.setFont(new Font("Serif", Font.BOLD, 20));
            pane9.setLayout(new GridBagLayout());
            gbc2.anchor = gbc2.WEST;
            gbc2.gridx= 0;
            gbc2.gridy = 0;
            pane9.add(pan9,gbc2);
            JTextField txt9 = new JTextField(10);
            txt9.setFont(new Font("Serif", Font.BOLD, 20));
            
            gbc2.anchor = gbc2.WEST;
            gbc2.gridx= 0;
            gbc2.gridy = 1;
            pane9.add(txt9,gbc2);
            
            gbc.gridx = 0;
            gbc.gridy = 50;
            form_panel.add(pane9,gbc);
            
            submitBtn = new JButton("Register");
            gbc.anchor = gbc.EAST;
            gbc.gridy = 55;
            submitBtn.setFont(new Font("Serif", Font.BOLD, 20));

            form_panel.add(submitBtn, gbc);
            
            login = new JButton("Head to login");
            gbc.anchor = gbc.WEST;
            gbc.gridy = 55;
            login.setFont(new Font("Serif", Font.BOLD, 20));
            form_panel.add(login, gbc);
            
            JScrollPane scrollPane = new JScrollPane(form_panel);
            login.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    dispose();
                    loginPage lp = new loginPage();
                } catch (SQLException ex) {
                    Logger.getLogger(JavaProject.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                
            });
            submitBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
//                HashMap<String, Object> txts = new HashMap<>();
//
//                txts.put("txt1", txt1);
//                txts.put("txt2", txt2);
//                txts.put("txt3", txt3);
//                txts.put("txt4", txt4);
//                txts.put("txt5", txt5);
//                txts.put("txt6", txt6);
//                txts.put("txt7", txt7);
//                txts.put("txt8", txt8);
//                txts.put("txt9", txt9);
//                for(int y = 1; y <= txts.size(); y++){
//                    String targetVariable = "txt".concat(String.valueOf(y));
//                    if (txts.containsKey(targetVariable)) {
//                        
//                    }
//                }
//                if(txt.length > 0){
                    try{
                            if (male.isSelected()) {
                                txt8 = "m";
                            }else if (female.isSelected()) {
                                txt8 = "f";
                            }else if(other.isSelected()){
                            }else{
                                throw new exception("Gender");
                            }
                            if(txt9.getText().isBlank()||txt7.getText().isBlank()||txt6.getText().isBlank()||txt5.getText().isBlank()||txt4.getText().isBlank()
                                    ||txt2.getText().isBlank()||txt1.getText().isBlank()){
                                throw new exception("Field");
                            }
                            if(txt1.getText().length() > 30||txt2.getText().length() > 30||txt4.getText().length() > 20||txt5.getText().length() > 11||
                                    txt6.getText().length() > 200||txt7.getText().length() > 6||txt9.getText().length() > 20){
                                throw new exception("Field");
                            }
                            try{
                                Integer.valueOf(txt4.getText());
                                Integer.valueOf(txt5.getText());
                                Integer.valueOf(txt7.getText());
                            }catch(Exception er){
                                throw new exception("Field");
                            }
                            String query2 = "select NIN from Customer";
                            Statement st = con.createStatement();
                            ResultSet rf = st.executeQuery(query2);
                            ArrayList ar = new ArrayList<String>();
                            while(rf.next()){
                                ar.add(rf.getString(1));
                            }
                            for (Object el : ar) {
                               if(el.equals(txt4.getText())){
                                   throw new exception();
                               }
                            };

                            String query =  "Insert into Customer Values("
                                    + "'"+txt1.getText()+"',"
                                    + "'"+txt2.getText()+"',"
                                    + "'"+txt3+"',"
                                    + "'"+txt4.getText()+"',"
                                    + "'"+txt5.getText()+"',"
                                    + "'"+txt6.getText()+"',"
                                    + "'"+txt7.getText()+"',"
                                    + "'"+txt8+"',"
                                    + "'"+txt9.getText()+"'"
                                    + ")";

                            int rs = st.executeUpdate(query);
                            System.out.println(rs);
                            JOptionPane.showMessageDialog(rootPane, "Registration Successful!");
                            frame.dispose();
                            loginPage lp = new loginPage();
                        }catch(SQLException se){
                            JOptionPane.showMessageDialog(rootPane, "Registration UnSuccessful!");
                        }catch(exception ee){
                        }
//                        catch(Exception ex){
//                            JOptionPane.showMessageDialog(rootPane, "Registration UnSuccessful!");
//                        }
                }
//            }
            
            });
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setMinimumSize(new Dimension(1900,700));
            this.getContentPane().add(scrollPane, BorderLayout.CENTER);
//            setSize(800,800);
            setVisible(true);
            
            
    }
    
    class exception extends RuntimeException{
        exception(String colName){
            JOptionPane.showMessageDialog(frame,("Invalid value provided for " + colName));
        }
        exception(){
            JOptionPane.showMessageDialog(frame,("Your Account exists! Kindly log in!"));
        }
    }
    
    public static void main(String[] args) throws SQLException {
        JavaProject jp = new JavaProject();
    }
}

