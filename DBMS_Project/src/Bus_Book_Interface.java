import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.text.SimpleDateFormat;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import com.toedter.calendar.JDateChooser;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class Bus_Book_Interface extends JFrame {
	/**
	 * @wbp.nonvisual location=-7,114
	 */
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bus_Book_Interface frame = new Bus_Book_Interface();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Bus_Book_Interface() {
		getContentPane().setBackground(SystemColor.inactiveCaption);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 670);
		
		getContentPane().setLayout(null);
		
		
		JComboBox cmb_06 = new JComboBox();
		cmb_06.setModel(new DefaultComboBoxModel(new String[] {"WP ND 6789", "WP ND 5678"}));
		cmb_06.setBounds(155, 404, 98, 22);
		getContentPane().add(cmb_06);
		
		JComboBox cmb_08 = new JComboBox();
		cmb_08.setModel(new DefaultComboBoxModel(new String[] {"WP HP 3008", "WP HP 4067"}));
		cmb_08.setBounds(155, 504, 98, 22);
		getContentPane().add(cmb_08);
		
		JComboBox cmb_03 = new JComboBox();
		cmb_03.setModel(new DefaultComboBoxModel(new String[] {"WP HP 3008", "WP HP 4067"}));
		cmb_03.setBounds(155, 254, 98, 22);
		getContentPane().add(cmb_03);
		
		JLabel lbl_08 = new JLabel("CJ-N-NAC");
		lbl_08.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl_08.setForeground(new Color(153, 153, 51));
		lbl_08.setBounds(20, 500, 98, 22);
		getContentPane().add(lbl_08);
		
		JLabel lbl_03 = new JLabel("JC-D-NAC");
		lbl_03.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl_03.setForeground(new Color(153, 153, 51));
		lbl_03.setBounds(20, 250, 98, 22);
		getContentPane().add(lbl_03);
		
		JLabel lbl_01 = new JLabel("JC-D-AC");
		lbl_01.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl_01.setForeground(new Color(153, 153, 51));
		lbl_01.setBounds(20, 150, 98, 22);
		getContentPane().add(lbl_01);
		
		JLabel lbl_02 = new JLabel("JC-N-AC");
		lbl_02.setForeground(new Color(153, 153, 51));
		lbl_02.setBackground(Color.WHITE);
		lbl_02.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl_02.setBounds(20, 200, 98, 22);
		getContentPane().add(lbl_02);
		
		JLabel lbl_07 = new JLabel("CJ-D-NAC");
		lbl_07.setForeground(new Color(153, 153, 51));
		lbl_07.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl_07.setBounds(20, 450, 98, 22);
		getContentPane().add(lbl_07);
		
		JLabel lbl_05 = new JLabel("CJ-D-AC");
		lbl_05.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl_05.setForeground(new Color(153, 153, 51));
		lbl_05.setBounds(20, 350, 98, 22);
		getContentPane().add(lbl_05);
		
		JLabel lbl_04 = new JLabel("JC-N-NAC");
		lbl_04.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl_04.setForeground(new Color(153, 153, 51));
		lbl_04.setBounds(20, 300, 126, 22);
		getContentPane().add(lbl_04);
		
		JLabel lbl_06 = new JLabel("CJ-N-AC");
		lbl_06.setForeground(new Color(153, 153, 51));
		lbl_06.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl_06.setBounds(20, 400, 98, 22);
		getContentPane().add(lbl_06);
		
		JComboBox cmb_01 = new JComboBox();
		cmb_01.setBounds(155, 154, 98, 22);
		getContentPane().add(cmb_01);
		cmb_01.setModel(new DefaultComboBoxModel(new String[] {"WP ND 6789", "WP ND 5678"}));
		
		JComboBox cmb_02 = new JComboBox();
		cmb_02.setModel(new DefaultComboBoxModel(new String[] {"WP ND 6789", "WP ND 5678"}));
		cmb_02.setBounds(155, 204, 98, 22);
		getContentPane().add(cmb_02);
		
		JComboBox cmb_04 = new JComboBox();
		cmb_04.setModel(new DefaultComboBoxModel(new String[] {"WP HP 3008", "WP HP 4067"}));
		cmb_04.setBounds(155, 304, 98, 22);
		getContentPane().add(cmb_04);
		
		JComboBox cmb_05 = new JComboBox();
		cmb_05.setModel(new DefaultComboBoxModel(new String[] {"WP ND 6789", "WP ND 5678"}));
		cmb_05.setBounds(155, 354, 98, 22);
		getContentPane().add(cmb_05);
		
		JComboBox cmb_07 = new JComboBox();
		cmb_07.setModel(new DefaultComboBoxModel(new String[] {"WP HP 3008", "WP HP 4067"}));
		cmb_07.setBounds(155, 454, 98, 22);
		getContentPane().add(cmb_07);
		
		JDateChooser datechooser = new JDateChooser();
		datechooser.setBounds(155, 100, 98, 22);
		getContentPane().add(datechooser);
		
		JLabel lbl_date = new JLabel("Date");
		lbl_date.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl_date.setBackground(Color.WHITE);
		lbl_date.setForeground(new Color(153, 153, 0));
		lbl_date.setBounds(20, 100, 98, 22);
		getContentPane().add(lbl_date);
		
		JLabel lblNewLabel = new JLabel("BUS ALLOCATION");
		lblNewLabel.setForeground(new Color(153, 153, 51));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setBounds(102, 38, 228, 16);
		getContentPane().add(lblNewLabel);
		
		JButton btn_add = new JButton("ADD");
		btn_add.setHorizontalAlignment(SwingConstants.LEFT);
		btn_add.setIcon(new ImageIcon("C:\\Users\\sanur\\Downloads\\icons8-add-64.png"));
		btn_add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Bus_Booking b;
				String date;
				SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
				date=sdf.format(datechooser.getDate());
				
				String[] aid=new String[8];
				aid[0]=lbl_01.getText();
				aid[1]=lbl_02.getText();
				aid[2]=lbl_03.getText();
				aid[3]=lbl_04.getText();
				aid[4]=lbl_05.getText();
				aid[5]=lbl_06.getText();
				aid[6]=lbl_07.getText();
				aid[7]=lbl_08.getText();
				
				String[] bno= new String[8];
						bno[0]=cmb_01.getSelectedItem().toString();
						bno[1]=cmb_02.getSelectedItem().toString();
						bno[2]=cmb_03.getSelectedItem().toString();
						bno[3]=cmb_04.getSelectedItem().toString();
						bno[4]=cmb_05.getSelectedItem().toString();
						bno[5]=cmb_06.getSelectedItem().toString();
						bno[6]=cmb_07.getSelectedItem().toString();
						bno[7]=cmb_08.getSelectedItem().toString();

					for(int i=0;i<8;i++) {
					b= new Bus_Booking();
					b.set_Date(date);
					b.set_AID(aid[i]);
					b.set_BNO(bno[i]);
					b.insert();
					
				}
			}
		});
		btn_add.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn_add.setBounds(260, 540, 150, 55);
		getContentPane().add(btn_add);
		
		JPanel panel = new mypanel();
		panel.setBounds(0, 0, 432, 94);
		getContentPane().add(panel);
		
	}
}
