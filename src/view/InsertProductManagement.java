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

public class InsertProductManagement extends View {
	public JTextField textPrice;
	public JTextField textStock;
	public JTextField textDescription;
	public JTextField textName;
	public JLabel lblName;
	public JLabel lblPrice;
	public JLabel lblStock;
	public JLabel lblDescription;
	public JButton btnSubmit;
	public JButton btnCancel;
	public GroupLayout groupLayout;
	
	public InsertProductManagement() {
		setTitle("Insert Product");
		this.getContentPane().setBackground(Color.WHITE);
		this.getContentPane().setForeground(Color.WHITE);
		this.setBounds(100,100,513,433);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		textPrice = new JTextField();
		textPrice.setColumns(10);
		
		textStock = new JTextField();
		textStock.setColumns(10);
		
		textDescription = new JTextField();
		textDescription.setColumns(10);
		
		lblName = new JLabel("Name:");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		lblPrice = new JLabel("Price:");
		lblPrice.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		lblStock = new JLabel("Stock:");
		lblStock.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		lblDescription = new JLabel("Description:");
		lblDescription.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		btnSubmit = new JButton("Submit");
		
		btnCancel = new JButton("Cancel");
		
		textName = new JTextField();
		textName.setColumns(10);
		groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblDescription, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(textDescription, GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
					.addGap(39))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(159)
					.addComponent(btnSubmit, GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
					.addGap(10)
					.addComponent(btnCancel, GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
					.addGap(120))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblPrice)
						.addComponent(lblName))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(textStock, GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblStock, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textPrice, GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))
						.addComponent(textName, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE))
					.addGap(39))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(37)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(textName, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
							.addGap(3))
						.addComponent(lblName, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblPrice, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
									.addComponent(textPrice, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
									.addGap(2))
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
									.addGroup(groupLayout.createSequentialGroup()
										.addGap(1)
										.addComponent(textStock, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
									.addGroup(groupLayout.createSequentialGroup()
										.addGap(7)
										.addComponent(lblStock, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))))))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(textDescription, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(btnSubmit, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
								.addComponent(btnCancel, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)))
						.addComponent(lblDescription))
					.addGap(17))
		);
		getContentPane().setLayout(groupLayout);
		this.setLocationRelativeTo(null);
		
		this.setVisible(true);
	}
}