package com.gui;

import java.awt.ActiveEvent;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Swing2 implements ActionListener{

	JFrame f;
	JLabel l1,l2,l3,l4,l5;
	JTextField t1,t2,t3,t4,t5;
	JButton b1,b2,b3,b4;
	public Swing2()
	{
		f=new JFrame("My Swing Crud Example");
		f.setVisible(true);
		f.setSize(360,420);
		f.setResizable(false);
		//f.setLayout(new FlowLayout());
		//f.setLayout(new GridLayout(7,2));
		f.setLayout(null);
		
		l1=new JLabel("ID");
		l2=new JLabel("FULL NAME");
		l3=new JLabel("MOBILE");
		l4=new JLabel("EMAIL");
		l5=new JLabel("ADDRESS");
		
		t1=new JTextField(20);
		t2=new JTextField(20);
		t3=new JTextField(20);
		t4=new JTextField(20);
		t5=new JTextField(20);
		
		b1=new JButton("INSERT");
		b2=new JButton("SEARCH");
		b3=new JButton("UPDATE");
		b4=new JButton("DELETE");
		
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(l3);
		f.add(t3);
		f.add(l4);
		f.add(t4);
		f.add(l5);
		f.add(t5);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		
		l1.setBounds(50, 50, 120, 20);
		l2.setBounds(50, 100, 120, 20);
		l3.setBounds(50, 150, 120, 20);
		l4.setBounds(50, 200, 120, 20);
		l5.setBounds(50, 250, 120, 20);
		
		t1.setBounds(150, 50, 150, 20);
		t2.setBounds(150, 100, 150, 20);
		t3.setBounds(150, 150, 150, 20);
		t4.setBounds(150, 200, 150, 20);
		t5.setBounds(150, 250, 150, 20);
		
		b1.setBounds(50, 300, 120, 20);
		b2.setBounds(175, 300, 120, 20);
		b3.setBounds(50, 330, 120, 20);
		b4.setBounds(175, 330, 120, 20);
	
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}
	public static void main(String[] args) {
		new Swing2();
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1)
		{
			if(t2.getText().equals("") || t3.getText().equals("") || t4.getText().equals("") || t5.getText().equals(""))
			{
				JOptionPane.showMessageDialog(f, "All fiels Are Mandotory");
			}
			else
			{
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/swing2", "root", "");
					String sql="insert into student (fname,mobile,email,address) values(?,?,?,?)";
					PreparedStatement pst=con.prepareStatement(sql);
					pst.setString(1, t2.getText());
					pst.setLong(2, Long.parseLong(t3.getText()));
					pst.setString(3, t4.getText());
					pst.setString(4, t5.getText());
					pst.executeUpdate();
					t2.setText("");
					t3.setText("");
					t4.setText("");
					t5.setText("");
					JOptionPane.showMessageDialog(f, "Data Inserted Successfully");
				}catch(Exception e2)
				{
					e2.printStackTrace();
				}
			}
		}
		else if(e.getSource()==b2)
		{
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/swing2", "root", "");
				String sql="select * from student where id=?";
				PreparedStatement pst=con.prepareStatement(sql);
				pst.setInt(1, Integer.parseInt(t1.getText()));
				ResultSet rs=pst.executeQuery();
				if(rs.next())
				{
					t2.setText(rs.getString("fname"));
					t3.setText(rs.getString("mobile"));
					t4.setText(rs.getString("email"));
					t5.setText(rs.getString("address"));
				}
				else
				{
					t2.setText("");
					t3.setText("");
					t4.setText("");
					t5.setText("");
					JOptionPane.showMessageDialog(f, "ID Not Found");
				}
			}catch(Exception e2)
			{
				e2.printStackTrace();
			}
		}
		else if(e.getSource()==b3)
		{
			if(t1.getText().equals("") || t2.getText().equals("") || t3.getText().equals("") || t4.getText().equals("") || t5.getText().equals(""))
			{
				JOptionPane.showMessageDialog(f, "All fiels Are Mandotory");
			}
			else
			{
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/swing2", "root", "");
					String sql="update student set fname=?,mobile=?,email=?,address=? where id=?";
					PreparedStatement pst=con.prepareStatement(sql);
					pst.setString(1, t2.getText());
					pst.setLong(2, Long.parseLong(t3.getText()));
					pst.setString(3, t4.getText());
					pst.setString(4, t5.getText());
					pst.setInt(5, Integer.parseInt(t1.getText()));
					pst.executeUpdate();
					t2.setText("");
					t3.setText("");
					t4.setText("");
					t5.setText("");
					JOptionPane.showMessageDialog(f, "Data Updated Successfully");
				}catch(Exception e2)
				{
					e2.printStackTrace();
				}
			}
		}
		else if(e.getSource()==b4)
		{
			if(t1.getText().equals(""))
			{
				JOptionPane.showMessageDialog(f, "ID Is Mandotory");
			}
			else
			{
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/swing2", "root", "");
					String sql="delete  from student where id=?";
					PreparedStatement pst=con.prepareStatement(sql);
					pst.setInt(1, Integer.parseInt(t1.getText()));
					pst.executeUpdate();
					t2.setText("");
					t3.setText("");
					t4.setText("");
					t5.setText("");
					JOptionPane.showMessageDialog(f, "Data Deleted Successfully");
				}catch(Exception e2)
				{
					e2.printStackTrace();
				}
			}
		}
	}
}

