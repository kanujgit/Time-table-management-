import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class add_subject extends JFrame {

	private JPanel contentPane;
	private JComboBox comboBox;
	private JComboBox comboBox_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					add_subject frame = new add_subject();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	Connection conn = null;
	public void fillCombo()
	{
		try{
			String query = "select * from course"; 
		PreparedStatement pst = conn.prepareStatement(query);
		ResultSet rs = pst.executeQuery();
		while(rs.next())
		{
			comboBox.addItem(rs.getString("course_name"));
			//comboBox_1.addItem(rs.getString("semester"));
		}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	/*public void fillCombo2()
	{
		try{
			String query = "select * from course where course_name = ?"; 
			PreparedStatement pst = conn.prepareStatement(query);
			pst.setString(1, (String)comboBox.getSelectedItem());
			ResultSet rs = pst.executeQuery();
			while(rs.next())
			{
				//comboBox.addItem(rs.getString("course_name"));
				comboBox_1.addItem(rs.getString("semester"));
			}
			pst.close();
			}catch(Exception e){
			e.printStackTrace();
			}
	}*/
	/*
	 * Create the frame.
	 */
	public add_subject() {
		conn = sqlite_connection.dbConnector();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Add Subject");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(174, 24, 93, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Course");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(43, 61, 63, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Semester");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(43, 97, 77, 14);
		contentPane.add(lblNewLabel_2);
		
		comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/*try{
					String query = "select semester from course where course_name = ?"; 
					PreparedStatement pst = conn.prepareStatement(query);
					pst.setString(1, (String)comboBox.getSelectedItem());
					ResultSet rs = pst.executeQuery();
					while(rs.next())
					{
						//comboBox.addItem(rs.getString("course_name"));
						comboBox_1.addItem(rs.getString("semester"));
					}
					pst.close();
					}catch(Exception e){
					e.printStackTrace();
					}*/
			}
		});
		comboBox.setBounds(174, 59, 93, 20);
		contentPane.add(comboBox);
		String[] arr={"1","2","3","4","5","6"};
		comboBox_1 = new JComboBox(arr);
	
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/*try{
					String query = "select * from course where course_name = ?"; 
					PreparedStatement pst = conn.prepareStatement(query);
					pst.setString(1, (String)comboBox.getSelectedItem());
					ResultSet rs = pst.executeQuery();
					while(rs.next())
					{
						//comboBox.addItem(rs.getString("course_name"));
						comboBox_1.addItem(rs.getString("semester"));
					}
					pst.close();
					}catch(Exception e){
					e.printStackTrace();
					}*/
			}
		});
		comboBox_1.setBounds(174, 95, 93, 20);
		contentPane.add(comboBox_1);
		
		JButton btnNewButton = new JButton("Next");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				add_subject1 a = new add_subject1();
				a.main(null);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(85, 183, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBounds(208, 183, 89, 23);
		contentPane.add(btnNewButton_1);
		fillCombo();
		//fillCombo2();
	
	}
}
