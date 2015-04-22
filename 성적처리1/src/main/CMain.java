package main;


import control.CLoginControl;
import data_access_object.IDAO;
import data_access_object.TextDAO;
import view.CExceptionView;
import view.CLoginView;

public class CMain {

	public static void main(String[] args) {
		//mvc pattern: 3 계층
		//3 계층 사이를 member라는 object가 만들여저서 왔다갔다함
		//이런 종류의 object를 value object라고함
		
		//create objects
		
		//start program
		try {
			//view
			CLoginView loginView = new CLoginView();
			//control
			CLoginControl loginControl = new CLoginControl();   //읽은 것을 판단
			//dao
			IDAO dao = new TextDAO();
			
			//association
			loginView.setControl(loginControl);
			loginControl.setDao(dao);
			loginView.login();
		} catch (Exception e){
			CExceptionView.processException(e);
		}
		
		  
		
		//이게 웹페이지가 됨.
	}

}
