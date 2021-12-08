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

public class UpdateProductManagement extends View {
	public JTextField textDescription;
	public JTextField textName;
	public JTextField textID;
	public JLabel lblName;
	public JLabel lblPrice;
	public JLabel lblStock;
	public JLabel lblDescription;
	public JLabel lblID;
	public JButton btnSubmit;
	public JButton btnCancel;
	public JTextField textPrice;
	public JTextField textField;
	public GroupLayout groupLayout;
	
	public UpdateProductManagement() {
		setTitle("Update");
		this.getContentPane().setBackground(Color.WHITE);
		this.getContentPane().setForeground(Color.WHITE);
		this.setBounds(100,100,513,433);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
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
		
		btnSubmit = new JButton("Update");
		
		btnCancel = new JButton("Cancel");
		
		lblID = new JLabel("ID:");
		lblID.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		textName = new JTextField();
		textName.setColumns(10);
		
		textID = new JTextField();
		textID.setText("TR0001");
		textID.setEditable(false);
		textID.setColumns(10);
		
		textPrice = new JTextField();
		textPrice.setColumns(10);
		
		textField = new JTextField();
		textField.setColumns(10);
		groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addComponent(lblID, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textID, GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
					.addGap(365))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
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
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblName, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblPrice, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
							.addGap(13)))
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(textPrice, GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
							.addGap(26)
							.addComponent(lblStock, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
						.addComponent(textName, GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE))
					.addGap(39))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(17)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblID, GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
							.addGap(11))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(textID, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblName, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addComponent(textName, GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(1)
							.addComponent(lblPrice, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
						.addComponent(textPrice, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(textField)
							.addComponent(lblStock, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblDescription, GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
							.addGap(132))
						.addComponent(textDescription, GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnSubmit, GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
						.addComponent(btnCancel, GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
					.addGap(11))
		);
		getContentPane().setLayout(groupLayout);
		this.setLocationRelativeTo(null);
		
		this.setVisible(true);
	}
}