package controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.util.Vector;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import model.Product;
import view.ProductManagement;

public class ProductManagementController extends Controller{
	
	protected ProductManagement pm;
	
	public ProductManagementController() {
		pm = new ProductManagement();
		Vector<Product> productList = Product.getAll();
		DefaultTableModel model = (DefaultTableModel) pm.table.getModel();
		
		for (Product product : productList) {
			System.out.println(product.getName());
			model.addRow(new Object[] {product.getId(), product.getName(), product.getPrice(), product.getStock(), "update", "delete", "view"});
		}
		
		pm.table.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent event) {
				int row = pm.table.rowAtPoint(event.getPoint());
				int column = pm.table.columnAtPoint(event.getPoint());
				
			}
		});
		
	}
}
