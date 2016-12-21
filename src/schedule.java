import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class schedule extends JFrame {

	private JPanel contentPane;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JComboBox comboBox_2;
	private JComboBox comboBox_3;
	private JComboBox comboBox_4;
	private JComboBox comboBox_5;
	private JComboBox comboBox_6;
	private JComboBox comboBox_7;
	private JComboBox comboBox_8;
	private JComboBox comboBox_9;
	private JComboBox comboBox_10;
	private JComboBox comboBox_11;
	private JComboBox comboBox_12;
	private JComboBox comboBox_13;
	private JComboBox comboBox_14;
	private JComboBox comboBox_15;
	private JComboBox comboBox_16;
	private JComboBox comboBox_17;
	private JComboBox comboBox_18;
	private JComboBox comboBox_19;
	private JComboBox comboBox_20;
	private JComboBox comboBox_21;
	private JComboBox comboBox_22;
	private JComboBox comboBox_23;
	private JComboBox comboBox_24;
	private JComboBox comboBox_25;
	private JComboBox comboBox_26;
	private JComboBox comboBox_27;
	private JComboBox comboBox_28;
	private JComboBox comboBox_29;
	private JComboBox comboBox_30;
	private JComboBox comboBox_31;
	private JComboBox comboBox_32;
	private JComboBox comboBox_33;
	private JComboBox comboBox_34;
	private JComboBox comboBox_35;
	private JComboBox comboBox_36;
	private JComboBox comboBox_37;
	private JComboBox comboBox_38;
	private JComboBox comboBox_39;
	private JComboBox comboBox_40;
	private JComboBox comboBox_41;
	private JComboBox comboBox_42;
	private JComboBox comboBox_43;
	private JComboBox comboBox_44;
	private JComboBox comboBox_45;
	private JComboBox comboBox_46;
	private JComboBox comboBox_47;
	private JComboBox comboBox_48;
	private JComboBox comboBox_49;
	private JComboBox comboBox_50;
	private JComboBox comboBox_51;
	private JComboBox comboBox_52;
	private JComboBox comboBox_53;
	private JComboBox comboBox_54;
	private JComboBox comboBox_55;
	private JComboBox comboBox_56;
	private JComboBox comboBox_57;
	private JComboBox comboBox_58;
	private JComboBox comboBox_59;
	private JComboBox comboBox_60;
	private JComboBox comboBox_61;
	private JComboBox comboBox_62;
	private JComboBox comboBox_63;
	private JComboBox comboBox_64;
	private JComboBox comboBox_65;
	private JComboBox comboBox_66;
	private JComboBox comboBox_67;
	private JComboBox comboBox_68;
	private JComboBox comboBox_69;
	private JComboBox comboBox_70;
	private JComboBox comboBox_71;
	private JComboBox comboBox_72;
	private JComboBox comboBox_73;
	private JComboBox comboBox_74;
	private JComboBox comboBox_75;
	private JComboBox comboBox_76;
	private JComboBox comboBox_77;
	private JComboBox comboBox_78;
	private JComboBox comboBox_79;
	private JComboBox comboBox_80;
	private JComboBox comboBox_81;
	private JComboBox comboBox_82;
	private JComboBox comboBox_83;
	private JComboBox comboBox_84;
	private JComboBox comboBox_85;
	private JComboBox comboBox_86;
	private JComboBox comboBox_87;
	private JComboBox comboBox_88;
	private JComboBox comboBox_89;
	private JComboBox comboBox_90;
	private JComboBox comboBox_91;
	
	//private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					schedule frame = new schedule();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	Connection conn = null;
	private JTable table;
	public void fillCombo()
	{
		try{
			String query = "select * from subject"; 
		PreparedStatement pst = conn.prepareStatement(query);
		ResultSet rs = pst.executeQuery();
		while(rs.next())
		{
			comboBox.addItem(rs.getString("subject_name"));
			comboBox_2.addItem(rs.getString("subject_name"));
			//comboBox_4.addItem(rs.getString("subject_name"));
			comboBox_4.addItem(rs.getString("subject_name"));
			comboBox_6.addItem(rs.getString("subject_name"));
			comboBox_8.addItem(rs.getString("subject_name"));
			comboBox_10.addItem(rs.getString("subject_name"));
			comboBox_12.addItem(rs.getString("subject_name"));
			comboBox_14.addItem(rs.getString("subject_name"));
			comboBox_16.addItem(rs.getString("subject_name"));
			comboBox_47.addItem(rs.getString("subject_name"));
			comboBox_48.addItem(rs.getString("subject_name"));
			comboBox_49.addItem(rs.getString("subject_name"));
			comboBox_21.addItem(rs.getString("subject_name"));
			comboBox_54.addItem(rs.getString("subject_name"));
			comboBox_56.addItem(rs.getString("subject_name"));
			comboBox_58.addItem(rs.getString("subject_name"));
			comboBox_60.addItem(rs.getString("subject_name"));
			comboBox_62.addItem(rs.getString("subject_name"));
			comboBox_50.addItem(rs.getString("subject_name"));
			comboBox_52.addItem(rs.getString("subject_name"));
			comboBox_54.addItem(rs.getString("subject_name"));
			comboBox_65.addItem(rs.getString("subject_name"));
			comboBox_68.addItem(rs.getString("subject_name"));
			comboBox_23.addItem(rs.getString("subject_name"));
			comboBox_24.addItem(rs.getString("subject_name"));
			comboBox_25.addItem(rs.getString("subject_name"));
			comboBox_26.addItem(rs.getString("subject_name"));
			comboBox_27.addItem(rs.getString("subject_name"));
			comboBox_28.addItem(rs.getString("subject_name"));
			comboBox_29.addItem(rs.getString("subject_name"));
			comboBox_30.addItem(rs.getString("subject_name"));
			comboBox_31.addItem(rs.getString("subject_name"));
			comboBox_32.addItem(rs.getString("subject_name"));
			comboBox_33.addItem(rs.getString("subject_name"));
			comboBox_34.addItem(rs.getString("subject_name"));
			comboBox_35.addItem(rs.getString("subject_name"));
			comboBox_74.addItem(rs.getString("subject_name"));
			comboBox_76.addItem(rs.getString("subject_name"));
			comboBox_78.addItem(rs.getString("subject_name"));
			comboBox_80.addItem(rs.getString("subject_name"));
			comboBox_82.addItem(rs.getString("subject_name"));
			comboBox_84.addItem(rs.getString("subject_name"));
			comboBox_86.addItem(rs.getString("subject_name"));
			comboBox_88.addItem(rs.getString("subject_name"));
			comboBox_90.addItem(rs.getString("subject_name"));
			comboBox_64.addItem(rs.getString("subject_name"));
			
		}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public void fillCombo1()
	{
		try{
			String query = "select * from course"; 
		PreparedStatement pst = conn.prepareStatement(query);
		ResultSet rs = pst.executeQuery();
		while(rs.next())
		{
			comboBox_45.addItem(rs.getString("course_name"));
			comboBox_46.addItem(rs.getString("semester"));
			//comboBox_1.addItem(rs.getString("semester"));
		}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public void fillCombo2()
	{
		try{
			String query = "select * from classes"; 
		PreparedStatement pst = conn.prepareStatement(query);
		ResultSet rs = pst.executeQuery();
		while(rs.next())
		{
			comboBox_1.addItem(rs.getString("class_name"));
			comboBox_3.addItem(rs.getString("class_name"));
			comboBox_5.addItem(rs.getString("class_name"));
			comboBox_7.addItem(rs.getString("class_name"));
			comboBox_9.addItem(rs.getString("class_name"));
			comboBox_11.addItem(rs.getString("class_name"));
			comboBox_13.addItem(rs.getString("class_name"));
			comboBox_15.addItem(rs.getString("class_name"));
			comboBox_17.addItem(rs.getString("class_name"));
			comboBox_18.addItem(rs.getString("class_name"));
			comboBox_19.addItem(rs.getString("class_name"));
			comboBox_20.addItem(rs.getString("class_name"));
			comboBox_55.addItem(rs.getString("class_name"));
			comboBox_57.addItem(rs.getString("class_name"));
			comboBox_59.addItem(rs.getString("class_name"));
			comboBox_61.addItem(rs.getString("class_name"));
			comboBox_63.addItem(rs.getString("class_name"));
			comboBox_51.addItem(rs.getString("class_name"));
			comboBox_53.addItem(rs.getString("class_name"));
			comboBox_67.addItem(rs.getString("class_name"));
			comboBox_56.addItem(rs.getString("class_name"));
			comboBox_69.addItem(rs.getString("class_name"));
			comboBox_70.addItem(rs.getString("class_name"));
			comboBox_71.addItem(rs.getString("class_name"));
			comboBox_72.addItem(rs.getString("class_name"));
			comboBox_73.addItem(rs.getString("class_name"));
			comboBox_36.addItem(rs.getString("class_name"));
			comboBox_37.addItem(rs.getString("class_name"));
			comboBox_38.addItem(rs.getString("class_name"));
			comboBox_39.addItem(rs.getString("class_name"));
			comboBox_40.addItem(rs.getString("class_name"));
			comboBox_41.addItem(rs.getString("class_name"));
			comboBox_42.addItem(rs.getString("class_name"));
			comboBox_43.addItem(rs.getString("class_name"));
			comboBox_44.addItem(rs.getString("class_name"));
			comboBox_75.addItem(rs.getString("class_name"));
			comboBox_77.addItem(rs.getString("class_name"));
			comboBox_79.addItem(rs.getString("class_name"));
			comboBox_81.addItem(rs.getString("class_name"));
			comboBox_85.addItem(rs.getString("class_name"));
			comboBox_87.addItem(rs.getString("class_name"));
			comboBox_89.addItem(rs.getString("class_name"));
			comboBox_91.addItem(rs.getString("class_name"));
			comboBox_83.addItem(rs.getString("class_name"));
			comboBox_66.addItem(rs.getString("class_name"));
			comboBox_22.addItem(rs.getString("class_name"));
			
			
		}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	/**
	 * Create the frame.
	 */
	public schedule() {
		conn = sqlite_connection.dbConnector();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1310, 603);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Course");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				course c = new course();
				c.main(null);
			}
		});
		menuBar.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Faculty");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				faculty f = new faculty();
				f.main(null);
			}
		});
		menuBar.add(mntmNewMenuItem_1);
		
		JMenuItem mntmClass = new JMenuItem("Class");
		mntmClass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				classes cs = new classes();
				cs.main(null);
			}
		});
		menuBar.add(mntmClass);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Prepare TimeTable");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				schedule s = new schedule();
				s.main(null);
			}
		});
		menuBar.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Log Out");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					dispose();
					login l = new login();
					l.main(null);
				}
				catch(Exception e)
				{
					JOptionPane.showMessageDialog(null,"Logout unsuccessful");
				}
			}
		});
		mntmNewMenuItem_3.setHorizontalAlignment(SwingConstants.RIGHT);
	
		menuBar.add(mntmNewMenuItem_3);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Monday");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(10, 70, 56, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Tuesday");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 132, 56, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Wednesday");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(10, 194, 74, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Thursday");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(10, 259, 62, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Friday");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(10, 325, 56, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("8-9");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setBounds(98, 39, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("9-10");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_6.setBounds(188, 39, 33, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("10-11");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_7.setBounds(272, 39, 46, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("11-12");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_8.setBounds(380, 39, 46, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("12-1");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_9.setBounds(461, 39, 46, 14);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("2-3");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_10.setBounds(546, 39, 46, 14);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("3-4");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_11.setBounds(623, 39, 46, 14);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("4-5");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_12.setBounds(711, 39, 46, 14);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("5-6");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_13.setBounds(799, 39, 46, 14);
		contentPane.add(lblNewLabel_13);
		
		comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/*try{
					String query = "select * from subject"; 
				PreparedStatement pst = conn.prepareStatement(query);
				ResultSet rs = pst.executeQuery();
				while(rs.next())
				{
					comboBox.addItem(rs.getString("credit"));
					//comboBox_1.addItem(rs.getString("semester"));
				}
				}catch(Exception e){
					e.printStackTrace();
				}*/
			}
		});
		comboBox.setBounds(98, 64, 46, 20);
		contentPane.add(comboBox);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setBounds(98, 95, 46, 20);
		contentPane.add(comboBox_1);
		
		comboBox_2 = new JComboBox();
		comboBox_2.setBounds(188, 67, 46, 20);
		contentPane.add(comboBox_2);
		
		comboBox_3 = new JComboBox();
		comboBox_3.setBounds(188, 95, 46, 20);
		contentPane.add(comboBox_3);
		
		comboBox_4 = new JComboBox();
		comboBox_4.setBounds(272, 64, 46, 20);
		contentPane.add(comboBox_4);
		
		comboBox_5 = new JComboBox();
		comboBox_5.setBounds(272, 95, 46, 20);
		contentPane.add(comboBox_5);
		
	  comboBox_6 = new JComboBox();
		comboBox_6.setBounds(380, 64, 46, 20);
		contentPane.add(comboBox_6);
		
		 comboBox_7 = new JComboBox();
		comboBox_7.setBounds(380, 95, 46, 20);
		contentPane.add(comboBox_7);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					//Monday subject
					String query = "insert into MCA (eight_nine,nine_ten,ten_eleven,eleven_twelve,twelve_one,two_three,three_four,four_five,five_six) values (?,?,?,?,?,?,?,?,?)";
					PreparedStatement pst = conn.prepareStatement(query);
					String v1 = comboBox.getSelectedItem().toString();
					pst.setString(1, v1);
					String v2 = comboBox_2.getSelectedItem().toString();
					pst.setString(2, v2);
					String v3 = comboBox_4.getSelectedItem().toString();
					pst.setString(3, v3);
					String v4 = comboBox_6.getSelectedItem().toString();
					pst.setString(4, v4);
					String v5 = comboBox_8.getSelectedItem().toString();
					pst.setString(5, v5);
					String v6 = comboBox_10.getSelectedItem().toString();
					pst.setString(6, v6);
					String v7 = comboBox_12.getSelectedItem().toString();
					pst.setString(7, v7);
					String v8 = comboBox_14.getSelectedItem().toString();
					pst.setString(8, v8);
					String v9 = comboBox_16.getSelectedItem().toString();
					pst.setString(9, v9);
					pst.execute();
					
					//Monday class
					String query1 = "insert into MCA (eight_nine,nine_ten,ten_eleven,eleven_twelve,twelve_one,two_three,three_four,four_five,five_six) values (?,?,?,?,?,?,?,?,?)";
					PreparedStatement pst1 = conn.prepareStatement(query1);
					String v10 = comboBox_1.getSelectedItem().toString();
					pst1.setString(1, v10);
					String v11 = comboBox_3.getSelectedItem().toString();
					pst1.setString(2, v11);
					String v12 = comboBox_5.getSelectedItem().toString();
					pst1.setString(3, v12);
					String v13 = comboBox_7.getSelectedItem().toString();
					pst1.setString(4, v13);
					String v14 = comboBox_9.getSelectedItem().toString();
					pst1.setString(5, v14);
					String v15 = comboBox_11.getSelectedItem().toString();
					pst1.setString(6, v15);
					String v16 = comboBox_13.getSelectedItem().toString();
					pst1.setString(7, v16);
					String v17 = comboBox_15.getSelectedItem().toString();
					pst1.setString(8, v17);
					String v18 = comboBox_17.getSelectedItem().toString();
					pst1.setString(9, v18);
					pst1.execute();
					
					//Tuesday subject
					String query2 = "insert into MCA (eight_nine,nine_ten,ten_eleven,eleven_twelve,twelve_one,two_three,three_four,four_five,five_six) values (?,?,?,?,?,?,?,?,?)";
					PreparedStatement pst2 = conn.prepareStatement(query2);
					String v19 = comboBox_47.getSelectedItem().toString();
					pst2.setString(1, v19);
					String v20 = comboBox_48.getSelectedItem().toString();
					pst2.setString(2, v20);
					String v21 = comboBox_49.getSelectedItem().toString();
					pst2.setString(3, v21);
					String v22 = comboBox_21.getSelectedItem().toString();
					pst2.setString(4, v22);
					String v23 = comboBox_44.getSelectedItem().toString();
					pst2.setString(5, v23);
					String v24 = comboBox_56.getSelectedItem().toString();
					pst2.setString(6, v24);
					String v25 = comboBox_58.getSelectedItem().toString();
					pst2.setString(7, v25);
					String v26 = comboBox_60.getSelectedItem().toString();
					pst2.setString(8, v26);
					String v27 = comboBox_62.getSelectedItem().toString();
					pst2.setString(9, v27);
					pst2.execute();
					
					//Tuesday class
					String query3 = "insert into MCA (eight_nine,nine_ten,ten_eleven,eleven_twelve,twelve_one,two_three,three_four,four_five,five_six) values (?,?,?,?,?,?,?,?,?)";
					PreparedStatement pst3 = conn.prepareStatement(query3);
					String v28 = comboBox_18.getSelectedItem().toString();
					pst3.setString(1, v28);
					String v29 = comboBox_19.getSelectedItem().toString();
					pst3.setString(2, v29);
					String v30 = comboBox_20.getSelectedItem().toString();
					pst3.setString(3, v30);
					String v31 = comboBox_22.getSelectedItem().toString();
					pst3.setString(4, v31);
					String v33 = comboBox_55.getSelectedItem().toString();
					pst3.setString(5, v33);
					String v34 = comboBox_57.getSelectedItem().toString();
					pst3.setString(6, v34);
					String v35 = comboBox_59.getSelectedItem().toString();
					pst3.setString(7, v35);
					String v36 = comboBox_61.getSelectedItem().toString();
					pst3.setString(8, v36);
					String v37 = comboBox_63.getSelectedItem().toString();
					pst3.setString(9, v37);
					pst3.execute();
					
					//Wednesday subject
					String query4 = "insert into MCA (eight_nine,nine_ten,ten_eleven,eleven_twelve,twelve_one,two_three,three_four,four_five,five_six) values (?,?,?,?,?,?,?,?,?)";
					PreparedStatement pst4 = conn.prepareStatement(query4);
					String v38 = comboBox_50.getSelectedItem().toString();
					pst4.setString(1, v38);
					String v39 = comboBox_52.getSelectedItem().toString();
					pst4.setString(2, v39);
					String v40 = comboBox_64.getSelectedItem().toString();
					pst4.setString(3, v40);
					String v41 = comboBox_65.getSelectedItem().toString();
					pst4.setString(4, v41);
					String v42 = comboBox_68.getSelectedItem().toString();
					pst4.setString(5, v42);
					String v43 = comboBox_23.getSelectedItem().toString();
					pst4.setString(6, v43);
					String v44 = comboBox_24.getSelectedItem().toString();
					pst4.setString(7, v44);
					String v45 = comboBox_25.getSelectedItem().toString();
					pst4.setString(8, v45);
					String v46 = comboBox_26.getSelectedItem().toString();
					pst4.setString(9, v46);
					pst4.execute();
					
					//Wednesday class
					String query5 = "insert into MCA (eight_nine,nine_ten,ten_eleven,eleven_twelve,twelve_one,two_three,three_four,four_five,five_six) values (?,?,?,?,?,?,?,?,?)";
					PreparedStatement pst5 = conn.prepareStatement(query1);
					String v47 = comboBox_51.getSelectedItem().toString();
					pst5.setString(1, v47);
					String v48 = comboBox_53.getSelectedItem().toString();
					pst5.setString(2, v48);
					String v49 = comboBox_67.getSelectedItem().toString();
					pst5.setString(3, v49);
					String v50 = comboBox_66.getSelectedItem().toString();
					pst5.setString(4, v50);
					String v51 = comboBox_69.getSelectedItem().toString();
					pst5.setString(5, v51);
					String v52 = comboBox_70.getSelectedItem().toString();
					pst5.setString(6, v52);
					String v53 = comboBox_71.getSelectedItem().toString();
					pst5.setString(7, v53);
					String v54 = comboBox_72.getSelectedItem().toString();
					pst5.setString(8, v54);
					String v55 = comboBox_73.getSelectedItem().toString();
					pst5.setString(9, v55);
					pst5.execute();
					
					//Thursday subject
					String query6 = "insert into MCA (eight_nine,nine_ten,ten_eleven,eleven_twelve,twelve_one,two_three,three_four,four_five,five_six) values (?,?,?,?,?,?,?,?,?)";
					PreparedStatement pst6 = conn.prepareStatement(query6);
					String v56 = comboBox_27.getSelectedItem().toString();
					pst6.setString(1, v56);
					String v57 = comboBox_28.getSelectedItem().toString();
					pst6.setString(2, v57);
					String v58 = comboBox_29.getSelectedItem().toString();
					pst6.setString(3, v58);
					String v59 = comboBox_30.getSelectedItem().toString();
					pst6.setString(4, v59);
					String v60 = comboBox_31.getSelectedItem().toString();
					pst6.setString(5, v60);
					String v61 = comboBox_32.getSelectedItem().toString();
					pst6.setString(6, v61);
					String v62 = comboBox_33.getSelectedItem().toString();
					pst6.setString(7, v62);
					String v63 = comboBox_34.getSelectedItem().toString();
					pst6.setString(8, v63);
					String v64 = comboBox_35.getSelectedItem().toString();
					pst6.setString(9, v64);
					pst6.execute();
					
					//Thursday class
					String query7 = "insert into MCA (eight_nine,nine_ten,ten_eleven,eleven_twelve,twelve_one,two_three,three_four,four_five,five_six) values (?,?,?,?,?,?,?,?,?)";
					PreparedStatement pst7 = conn.prepareStatement(query7);
					String v65 = comboBox_36.getSelectedItem().toString();
					pst7.setString(1, v65);
					String v66 = comboBox_37.getSelectedItem().toString();
					pst7.setString(2, v66);
					String v67 = comboBox_38.getSelectedItem().toString();
					pst7.setString(3, v67);
					String v68 = comboBox_39.getSelectedItem().toString();
					pst7.setString(4, v68);
					String v69 = comboBox_40.getSelectedItem().toString();
					pst7.setString(5, v69);
					String v70 = comboBox_41.getSelectedItem().toString();
					pst7.setString(6, v70);
					String v71 = comboBox_42.getSelectedItem().toString();
					pst7.setString(7, v71);
					String v72 = comboBox_43.getSelectedItem().toString();
					pst7.setString(8, v72);
					String v73 = comboBox_44.getSelectedItem().toString();
					pst7.setString(9, v73);
					pst7.execute();
					
					//Friday subject
					String query8 = "insert into MCA (eight_nine,nine_ten,ten_eleven,eleven_twelve,twelve_one,two_three,three_four,four_five,five_six) values (?,?,?,?,?,?,?,?,?)";
					PreparedStatement pst8 = conn.prepareStatement(query8);
					String v74 = comboBox_74.getSelectedItem().toString();
					pst8.setString(1, v74);
					String v75 = comboBox_76.getSelectedItem().toString();
					pst8.setString(2, v75);
					String v76 = comboBox_78.getSelectedItem().toString();
					pst8.setString(3, v76);
					String v77 = comboBox_80.getSelectedItem().toString();
					pst8.setString(4, v77);
					String v78 = comboBox_82.getSelectedItem().toString();
					pst8.setString(5, v78);
					String v79 = comboBox_84.getSelectedItem().toString();
					pst8.setString(6, v79);
					String v80 = comboBox_86.getSelectedItem().toString();
					pst8.setString(7, v80);
					String v81 = comboBox_88.getSelectedItem().toString();
					pst8.setString(8, v81);
					String v82 = comboBox_90.getSelectedItem().toString();
					pst8.setString(9, v82);
					pst8.execute();
					
					//Friday class
					String query9 = "insert into MCA (eight_nine,nine_ten,ten_eleven,eleven_twelve,twelve_one,two_three,three_four,four_five,five_six) values (?,?,?,?,?,?,?,?,?)";
					PreparedStatement pst9 = conn.prepareStatement(query9);
					String v83 = comboBox_75.getSelectedItem().toString();
					pst9.setString(1, v83);
					String v84 = comboBox_77.getSelectedItem().toString();
					pst9.setString(2, v84);
					String v85 = comboBox_79.getSelectedItem().toString();
					pst9.setString(3, v85);
					String v86 = comboBox_81.getSelectedItem().toString();
					pst9.setString(4, v86);
					String v87 = comboBox_83.getSelectedItem().toString();
					pst9.setString(5, v87);
					String v88 = comboBox_85.getSelectedItem().toString();
					pst9.setString(6, v88);
					String v89 = comboBox_87.getSelectedItem().toString();
					pst9.setString(7, v89);
					String v90 = comboBox_89.getSelectedItem().toString();
					pst9.setString(8, v90);
					String v91 = comboBox_91.getSelectedItem().toString();
					pst9.setString(9, v91);
					pst9.execute();
					
					JOptionPane.showMessageDialog(null,"Data Saved");
					pst.close();
				}catch(Exception e)
				{
					e.printStackTrace();
				}
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(272, 436, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Show");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				show s = new show();
				s.main(null);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBounds(471, 437, 89, 23);
		contentPane.add(btnNewButton_1);
		
		 comboBox_8 = new JComboBox();
		comboBox_8.setBounds(461, 64, 46, 20);
		contentPane.add(comboBox_8);
		
		comboBox_9 = new JComboBox();
		comboBox_9.setBounds(461, 95, 46, 20);
		contentPane.add(comboBox_9);
		
		comboBox_10 = new JComboBox();
		comboBox_10.setBounds(546, 64, 46, 20);
		contentPane.add(comboBox_10);
		
	     comboBox_11 = new JComboBox();
		comboBox_11.setBounds(546, 95, 46, 20);
		contentPane.add(comboBox_11);
		
		comboBox_12 = new JComboBox();
		comboBox_12.setBounds(623, 64, 46, 20);
		contentPane.add(comboBox_12);
		
		comboBox_13 = new JComboBox();
		comboBox_13.setBounds(623, 95, 46, 20);
		contentPane.add(comboBox_13);
		
		comboBox_14 = new JComboBox();
		comboBox_14.setBounds(711, 64, 46, 20);
		contentPane.add(comboBox_14);
		
	    comboBox_15 = new JComboBox();
		comboBox_15.setBounds(711, 95, 46, 20);
		contentPane.add(comboBox_15);
		
		 comboBox_16 = new JComboBox();
		comboBox_16.setBounds(799, 64, 46, 20);
		contentPane.add(comboBox_16);
		
		 comboBox_17 = new JComboBox();
		comboBox_17.setBounds(799, 95, 46, 20);
		contentPane.add(comboBox_17);
		
		comboBox_18 = new JComboBox();
		comboBox_18.setBounds(98, 160, 46, 20);
		contentPane.add(comboBox_18);
		
		comboBox_19 = new JComboBox();
		comboBox_19.setBounds(188, 160, 46, 20);
		contentPane.add(comboBox_19);
		
		comboBox_20 = new JComboBox();
		comboBox_20.setBounds(272, 160, 46, 20);
		contentPane.add(comboBox_20);
		
	    comboBox_21 = new JComboBox();
		comboBox_21.setBounds(380, 132, 46, 20);
		contentPane.add(comboBox_21);
		
		comboBox_22 = new JComboBox();
		comboBox_22.setBounds(380, 160, 46, 20);
		contentPane.add(comboBox_22);
		
	    comboBox_23 = new JComboBox();
		comboBox_23.setBounds(546, 188, 46, 20);
		contentPane.add(comboBox_23);
		
		comboBox_24 = new JComboBox();
		comboBox_24.setBounds(623, 188, 46, 20);
		contentPane.add(comboBox_24);
		
		comboBox_25 = new JComboBox();
		comboBox_25.setBounds(711, 188, 46, 20);
		contentPane.add(comboBox_25);
		
		comboBox_26 = new JComboBox();
		comboBox_26.setBounds(799, 188, 46, 20);
		contentPane.add(comboBox_26);
		
	    comboBox_27 = new JComboBox();
		comboBox_27.setBounds(98, 253, 46, 20);
		contentPane.add(comboBox_27);
		
	    comboBox_28 = new JComboBox();
		comboBox_28.setBounds(188, 253, 46, 20);
		contentPane.add(comboBox_28);
		
	    comboBox_29 = new JComboBox();
		comboBox_29.setBounds(272, 253, 46, 20);
		contentPane.add(comboBox_29);
		
		comboBox_30 = new JComboBox();
		comboBox_30.setBounds(380, 253, 46, 20);
		contentPane.add(comboBox_30);
		
		comboBox_31 = new JComboBox();
		comboBox_31.setBounds(461, 253, 46, 20);
		contentPane.add(comboBox_31);
		
	    comboBox_32 = new JComboBox();
		comboBox_32.setBounds(546, 253, 46, 20);
		contentPane.add(comboBox_32);
		
	    comboBox_33 = new JComboBox();
		comboBox_33.setBounds(623, 253, 46, 20);
		contentPane.add(comboBox_33);
		
		 comboBox_34 = new JComboBox();
		comboBox_34.setBounds(711, 253, 46, 20);
		contentPane.add(comboBox_34);
		
	     comboBox_35 = new JComboBox();
		comboBox_35.setBounds(799, 253, 46, 20);
		contentPane.add(comboBox_35);
		
		comboBox_36 = new JComboBox();
		comboBox_36.setBounds(98, 284, 46, 20);
		contentPane.add(comboBox_36);
		
	    comboBox_37 = new JComboBox();
		comboBox_37.setBounds(188, 284, 46, 20);
		contentPane.add(comboBox_37);
		
		 comboBox_38 = new JComboBox();
		comboBox_38.setBounds(272, 284, 46, 20);
		contentPane.add(comboBox_38);
		
		comboBox_39 = new JComboBox();
		comboBox_39.setBounds(380, 284, 46, 20);
		contentPane.add(comboBox_39);
		
		 comboBox_40 = new JComboBox();
		comboBox_40.setBounds(461, 284, 46, 20);
		contentPane.add(comboBox_40);
		
		comboBox_41 = new JComboBox();
		comboBox_41.setBounds(546, 284, 46, 20);
		contentPane.add(comboBox_41);
		
	   comboBox_42 = new JComboBox();
		comboBox_42.setBounds(623, 284, 46, 20);
		contentPane.add(comboBox_42);
		
		comboBox_43 = new JComboBox();
		comboBox_43.setBounds(711, 284, 46, 20);
		contentPane.add(comboBox_43);
		
		comboBox_44 = new JComboBox();
		comboBox_44.setBounds(799, 284, 46, 20);
		contentPane.add(comboBox_44);
		
		JLabel lblNewLabel_14 = new JLabel("Select");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_14.setBounds(253, 11, 46, 14);
		contentPane.add(lblNewLabel_14);
		
		String[] arr1={"Select"};
		comboBox_45 = new JComboBox(arr1);
		comboBox_45.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		comboBox_45.setBounds(292, 8, 62, 20);
		contentPane.add(comboBox_45);
		
	
		String[] arr={"Select"};
		comboBox_46 = new JComboBox(arr);
		comboBox_46.setBounds(379, 8, 72, 20);
		contentPane.add(comboBox_46);
		
		
		JButton btnNewButton_2 = new JButton("Done");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					String query1 = "select * from subject where course_id = (select course_id from course where course_name = ? and semester = ?)";
					PreparedStatement pst1 = conn.prepareStatement(query1);
					pst1.setString(1, comboBox_45.getSelectedItem().toString());
					pst1.setString(2, comboBox_46.getSelectedItem().toString());
					ResultSet rs1 = pst1.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs1));
					pst1.close();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2.setBounds(461, 5, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(987, 11, 297, 405);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		 comboBox_47 = new JComboBox();
		comboBox_47.setBounds(98, 129, 46, 20);
		contentPane.add(comboBox_47);
		
		comboBox_48 = new JComboBox();
		comboBox_48.setBounds(188, 129, 46, 20);
		contentPane.add(comboBox_48);
		
		comboBox_49 = new JComboBox();
		comboBox_49.setBounds(272, 129, 46, 20);
		contentPane.add(comboBox_49);
		
		comboBox_50 = new JComboBox();
		comboBox_50.setBounds(98, 194, 46, 20);
		contentPane.add(comboBox_50);
		
		comboBox_51 = new JComboBox();
		comboBox_51.setBounds(98, 225, 46, 20);
		contentPane.add(comboBox_51);
		
	  comboBox_52 = new JComboBox();
		comboBox_52.setBounds(188, 191, 46, 20);
		contentPane.add(comboBox_52);
		
		 comboBox_53 = new JComboBox();
		comboBox_53.setBounds(188, 222, 46, 20);
		contentPane.add(comboBox_53);
		
	  comboBox_54 = new JComboBox();
		comboBox_54.setBounds(461, 129, 46, 20);
		contentPane.add(comboBox_54);
		
		 comboBox_55 = new JComboBox();
		comboBox_55.setBounds(461, 160, 46, 20);
		contentPane.add(comboBox_55);
		
		 comboBox_56 = new JComboBox();
		comboBox_56.setBounds(546, 132, 48, 20);
		contentPane.add(comboBox_56);
		
	     comboBox_57 = new JComboBox();
		comboBox_57.setBounds(546, 160, 46, 20);
		contentPane.add(comboBox_57);
		
		comboBox_58 = new JComboBox();
		comboBox_58.setBounds(623, 129, 46, 20);
		contentPane.add(comboBox_58);
		
		 comboBox_59 = new JComboBox();
		comboBox_59.setBounds(623, 160, 46, 20);
		contentPane.add(comboBox_59);
		
		 comboBox_60 = new JComboBox();
		comboBox_60.setBounds(709, 129, 48, 20);
		contentPane.add(comboBox_60);
		
		 comboBox_61 = new JComboBox();
		comboBox_61.setBounds(711, 160, 46, 20);
		contentPane.add(comboBox_61);
		
	    comboBox_62 = new JComboBox();
		comboBox_62.setBounds(799, 129, 46, 20);
		contentPane.add(comboBox_62);
		
	    comboBox_63 = new JComboBox();
		comboBox_63.setBounds(799, 160, 46, 20);
		contentPane.add(comboBox_63);
		
		 comboBox_64 = new JComboBox();
		comboBox_64.setBounds(272, 191, 46, 20);
		contentPane.add(comboBox_64);
		
		 comboBox_65 = new JComboBox();
		comboBox_65.setBounds(380, 191, 46, 20);
		contentPane.add(comboBox_65);
		
		 comboBox_66 = new JComboBox();
		comboBox_66.setBounds(380, 222, 46, 20);
		contentPane.add(comboBox_66);
		
		 comboBox_67 = new JComboBox();
		comboBox_67.setBounds(272, 222, 46, 20);
		contentPane.add(comboBox_67);
		
	    comboBox_68 = new JComboBox();
		comboBox_68.setBounds(461, 191, 46, 20);
		contentPane.add(comboBox_68);
		
		 comboBox_69 = new JComboBox();
		comboBox_69.setBounds(461, 222, 46, 20);
		contentPane.add(comboBox_69);
		
	  comboBox_70 = new JComboBox();
		comboBox_70.setBounds(546, 222, 46, 20);
		contentPane.add(comboBox_70);
		
		 comboBox_71 = new JComboBox();
		comboBox_71.setBounds(621, 219, 48, 20);
		contentPane.add(comboBox_71);
		
		 comboBox_72 = new JComboBox();
		comboBox_72.setBounds(711, 219, 46, 20);
		contentPane.add(comboBox_72);
		
		 comboBox_73 = new JComboBox();
		comboBox_73.setBounds(799, 219, 46, 20);
		contentPane.add(comboBox_73);
		
		 comboBox_74 = new JComboBox();
		comboBox_74.setBounds(98, 322, 46, 20);
		contentPane.add(comboBox_74);
		
		 comboBox_75 = new JComboBox();
		comboBox_75.setBounds(98, 354, 46, 20);
		contentPane.add(comboBox_75);
		
		 comboBox_76 = new JComboBox();
		comboBox_76.setBounds(188, 322, 46, 20);
		contentPane.add(comboBox_76);
		
		 comboBox_77 = new JComboBox();
		comboBox_77.setBounds(188, 354, 46, 20);
		contentPane.add(comboBox_77);
		
	    comboBox_78 = new JComboBox();
		comboBox_78.setBounds(272, 322, 46, 20);
		contentPane.add(comboBox_78);
		
		 comboBox_79 = new JComboBox();
		comboBox_79.setBounds(272, 354, 46, 20);
		contentPane.add(comboBox_79);
		
		 comboBox_80 = new JComboBox();
		comboBox_80.setBounds(380, 322, 48, 20);
		contentPane.add(comboBox_80);
		
		 comboBox_81 = new JComboBox();
		comboBox_81.setBounds(380, 354, 46, 20);
		contentPane.add(comboBox_81);
		
		 comboBox_82 = new JComboBox();
		comboBox_82.setBounds(461, 322, 46, 20);
		contentPane.add(comboBox_82);
		
		comboBox_83 = new JComboBox();
		comboBox_83.setBounds(461, 354, 46, 20);
		contentPane.add(comboBox_83);
		
		 comboBox_84 = new JComboBox();
		comboBox_84.setBounds(546, 322, 46, 20);
		contentPane.add(comboBox_84);
		
		 comboBox_85 = new JComboBox();
		comboBox_85.setBounds(546, 354, 46, 20);
		contentPane.add(comboBox_85);
		
	    comboBox_86 = new JComboBox();
		comboBox_86.setBounds(623, 322, 46, 20);
		contentPane.add(comboBox_86);
		
		 comboBox_87 = new JComboBox();
		comboBox_87.setBounds(623, 354, 46, 20);
		contentPane.add(comboBox_87);
		
		 comboBox_88 = new JComboBox();
		comboBox_88.setBounds(711, 322, 46, 20);
		contentPane.add(comboBox_88);
		
		 comboBox_89 = new JComboBox();
		comboBox_89.setBounds(711, 354, 46, 20);
		contentPane.add(comboBox_89);
		
		 comboBox_90 = new JComboBox();
		comboBox_90.setBounds(799, 322, 46, 20);
		contentPane.add(comboBox_90);
		
		 comboBox_91 = new JComboBox();
		comboBox_91.setBounds(799, 354, 46, 20);
		contentPane.add(comboBox_91);
		
		fillCombo();
		fillCombo1();
		fillCombo2();
		comboBox_45.setSelectedIndex(1);
		comboBox_46.setSelectedIndex(1);
	}
}
