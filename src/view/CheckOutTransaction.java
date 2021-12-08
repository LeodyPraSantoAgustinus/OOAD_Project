package view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class CheckOutTransaction extends View {
	public JLabel lblTotal;
	public JTextField textTotal;
	public JLabel lblPaymentMethod;
	public JButton btnAccept;
	public JButton btnCancel;
	public JRadioButton rdbtnCredit;
	public JRadioButton rdbtnCash;
	public ButtonGroup buttonGroup = new ButtonGroup();
	public GroupLayout groupLayout;
	
	public CheckOutTransaction() {
		setTitle("Check Out");
		this.getContentPane().setBackground(Color.WHITE);
		this.getContentPane().setForeground(Color.WHITE);
		this.setBounds(100,100,513,433);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		textTotal = new JTextField();
		textTotal.setEditable(false);
		textTotal.setColumns(10);
		
		lblPaymentMethod = new JLabel("Payment Method");
		lblPaymentMethod.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		btnAccept = new JButton("Accept");
		btnAccept.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		rdbtnCredit = new JRadioButton("Credit");
		buttonGroup.add(rdbtnCredit);
		rdbtnCredit.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		rdbtnCash = new JRadioButton("Cash");
		buttonGroup.add(rdbtnCash);
		rdbtnCash.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(155)
					.addComponent(lblTotal, GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
					.addGap(171))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(155)
					.addComponent(textTotal, GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
					.addGap(171))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(149)
					.addComponent(lblPaymentMethod, GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
					.addGap(153))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(196)
					.addComponent(rdbtnCash, GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
					.addGap(205))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addGap(196)
					.addComponent(rdbtnCredit, GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
					.addGap(205))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(99)
					.addComponent(btnAccept, GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
					.addGap(37)
					.addComponent(btnCancel, GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
					.addGap(113))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(43)
					.addComponent(lblTotal, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
					.addGap(1)
					.addComponent(textTotal, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
					.addGap(11)
					.addComponent(lblPaymentMethod, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
					.addGap(7)
					.addComponent(rdbtnCash, GroupLayout.PREFERRED_SIZE, 23, Short.MAX_VALUE)
					.addGap(10)
					.addComponent(rdbtnCredit, GroupLayout.PREFERRED_SIZE, 23, Short.MAX_VALUE)
					.addGap(23)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnAccept, GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
						.addComponent(btnCancel, GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
					.addGap(115))
		);
		getContentPane().setLayout(groupLayout);
		this.setLocationRelativeTo(null);
		
		this.setVisible(true);
	}
}