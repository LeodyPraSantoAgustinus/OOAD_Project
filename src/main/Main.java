package main;

import controller.LoginController;
import controller.ProductManagementController;
import utility.Connect;
import view.Login;
import view.ProductManagement;
import view.UpdateProductManagement;
import view.ViewProductManagement;
import view.InsertProductManagement;
import view.DeleteProductManagement;
import view.Transaction;
import view.CheckOutTransaction;
import view.ChooseQtyTransaction;
import view.ViewItemAndAddToCartTransaction;
import view.ViewTodayTransaction;
import view.OpenDetailTransaction;

public class Main {

	public Main() {

//		new Login();
//		new ProductManagement();
//		new UpdateProductManagement();
//		new ViewProductManagement();
//		new InsertProductManagement();
//		new DeleteProductManagement();
//		new Transaction();
//		new CheckOutTransaction();
//		new ViewItemAndAddToCartTransaction();
//		new ChooseQtyTransaction();
//		new ViewTodayTransaction();
//		new OpenDetailTransaction();
		
		
//		new LoginController();
		new ProductManagementController();
	}
	
	public static void main(String[] args) {
		new Main();
	}

}
