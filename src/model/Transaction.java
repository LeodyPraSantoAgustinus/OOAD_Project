package model;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import utility.Connect;

public class Transaction extends Model{
	
	private String transactionId, paymentType;
	private Date date;
	private Vector<TransactionItem> itemList;
	
	public Transaction(String transactionId, Date date, String paymentType, Vector<TransactionItem> itemList) {
		super();
		this.transactionId = transactionId;
		this.date = date;
		this.paymentType = paymentType;
		this.itemList = itemList;
	}
	
	public Vector<Transaction> getTodayTransaction() {
		Vector<Transaction> result = new Vector<Transaction>();
		String query = "SELECT * FROM TransactionHeader WHERE transactionDate = ?";
		
		try {
			PreparedStatement ps = Connect.getConnection().createPreparedStatement(query);
	        ps.setDate(1, new java.sql.Date(System.currentTimeMillis()));
	        
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				result.add(new Transaction(
						rs.getString("transactionId"),
						rs.getDate("transactionDate"),
						rs.getString("paymentType"),
						getTransactionDetailById()
				));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public Vector<Transaction> getTransactionHeaderByYearAndMonth(int year, int month) {
		Vector<Transaction> result = new Vector<Transaction>();
		String query = "SELECT * FROM TransactionHeader WHERE YEAR(transactionDate) = ? AND MONTH(transactionDate) = ?";
		
		try {
			PreparedStatement ps = Connect.getConnection().createPreparedStatement(query);
	        ps.setInt(1, year);
	        ps.setInt(2, month);
	        
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				result.add(new Transaction(
						rs.getString("transactionId"),
						rs.getDate("transactionDate"),
						rs.getString("paymentType"),
						getTransactionDetailById()
				));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public Vector<TransactionItem> getTransactionDetailById() {
		Vector<TransactionItem> result = new Vector<TransactionItem>();
		String query = "SELECT p.productId, qty FROM TransactionDetail td JOIN Product p ON td.productId = p.productId WHERE transactionId = ?";
		
		try {
			PreparedStatement ps = Connect.getConnection().createPreparedStatement(query);
	        ps.setString(1, transactionId);
	        
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				result.add(new TransactionItem(
						rs.getString("productId"),
						rs.getInt("qty")
				));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}

	public boolean createTransaction() {
		if(insertHeader() && insertDetail() && updateQuantity() == true) {
			return true;
		}
		
		return false;
	}
	
	private boolean insertHeader() {
		String query = "INSERT INTO TransactionHeader VALUES(?, ?, ?)";
		try {
			PreparedStatement ps = Connect.getConnection().createPreparedStatement(query);
			ps.setString(1, transactionId);
			ps.setDate(2, date);
			ps.setString(3, paymentType);
			
			return ps.executeUpdate() == 1;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	private boolean insertDetail() {
		String query = "INSERT INTO TransactionDetail VALUES(?, ?, ?)";
		try {
			PreparedStatement ps = Connect.getConnection().createPreparedStatement(query);

			ps.setString(1, transactionId);
			for (TransactionItem item : itemList) {
				ps.setString(2, item.getProductId());
				ps.setInt(3, item.getQty());
				
				ps.executeUpdate();
			}
			
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	private boolean updateQuantity() {
		String query = "UPDATE Product SET productStock = ? WHERE productId = ?";
		try {
			PreparedStatement ps = Connect.getConnection().createPreparedStatement(query);
			
			for (TransactionItem item : itemList) {
				int oldStock = 0;
				
				String querySelect = "SELECT productStock FROM Product WHERE productId = ?";
				
				PreparedStatement ps1 = Connect.getConnection().createPreparedStatement(querySelect);
				ps1.setString(1, item.getProductId());
	
				ResultSet rs1 = ps1.executeQuery();

				while(rs1.next()) {
					oldStock = rs1.getInt("productStock");
				}
				
				ps.setInt(1,  oldStock - item.getQty());
				ps.setString(2, item.getProductId());
				
				ps.executeUpdate();
			}
			
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	
}
