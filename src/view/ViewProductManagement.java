package view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class ViewProductManagement extends View {
	public JTextField textStock;
	public JTextField textPrice;
	public JTextField textDescription;
	public JTextField textName;
	public JTextField textID;
	public JLabel lblName;
	public JLabel lblPrice;
	public JLabel lblStock;
	public JLabel lblDescription;
	public JLabel lblID;
	public JButton btnSubmit;
	public GroupLayout groupLayout;
	
	public ViewProductManagement() {
		setTitle("View Product");
		this.getContentPane().setBackground(Color.WHITE);
		this.getContentPane().setForeground(Color.WHITE);
		this.setBounds(100,100,513,433);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		textStock = new JTextField();
		textStock.setEditable(false);
		textStock.setColumns(10);
		
		textPrice = new JTextField();
		textPrice.setEditable(false);
		textPrice.setColumns(10);
		
		textDescription = new JTextField();
		textDescription.setEditable(false);
		textDescription.setColumns(10);
		
		lblName = new JLabel("Name:");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		lblPrice = new JLabel("Price:");
		lblPrice.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		lblStock = new JLabel("Stock:");
		lblStock.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		lblDescription = new JLabel("Description:");
		lblDescription.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		btnSubmit = new JButton("Okay");
		
		lblID = new JLabel("ID:");
		lblID.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		textName = new JTextField();
		textName.setEditable(false);
		textName.setColumns(10);
		
		textID = new JTextField();
		textID.setText("TR0001");
		textID.setEditable(false);
		textID.setColumns(10);
		groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblPrice, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textPrice, GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(lblStock, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
					.addGap(2)
					.addComponent(textStock, GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
					.addGap(39))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addComponent(lblDescription, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(textDescription, GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
					.addGap(39))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(234)
					.addComponent(btnSubmit, GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
					.addGap(147))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblID, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblName, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(textID, GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
							.addGap(368))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(textName, GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
							.addGap(39))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(17)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblID, GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
						.addComponent(textID, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblName, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
						.addComponent(textName, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
									.addGap(1)
									.addComponent(textStock))
								.addGroup(Alignment.LEADING, groupLayout.createParallelGroup(Alignment.BASELINE)
									.addComponent(textPrice, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
									.addComponent(lblStock, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)))
							.addGap(18))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblPrice, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
							.addGap(19)))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblDescription, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
							.addGap(132))
						.addComponent(textDescription, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
					.addGap(11)
					.addComponent(btnSubmit, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addGap(11))
		);
		getContentPane().setLayout(groupLayout);
		this.setLocationRelativeTo(null);
		
		this.setVisible(true);
	}
}