package main;


import control.CGangjwaControl;
import control.CLoginControl;
import data_access_object.IDAO;
import data_access_object.TextDAO;
import entity.VUser;
import view.CLoginView;
import view.CExceptionView;
import view.CSugangView;

public class CMain {

	public static void main(String[] args) {
		//mvc pattern: 3 계층
		//3 계층 사이를 member라는 object가 만들여저서 왔다갔다함
		//이런 종류의 object를 value object라고함
		
		//create objects
		
		//start program
		try {
			//view, component
			CLoginView loginView = new CLoginView();
			//control
			CLoginControl loginControl = new CLoginControl();   //읽은 것을 판단
			//dao
			IDAO dao = new TextDAO();
			
			CSugangView sugangView = new CSugangView();
			CGangjwaControl gangjwaControl = new CGangjwaControl();
	
			
			//association연결함
			loginView.setControl(loginControl);
			loginControl.setDao(dao);
			
			sugangView.setControl(gangjwaControl);
			gangjwaControl.setDao(dao);
			
			
			//시작점을 찾아 호출(start program)
			VUser vUser = loginView.login();
			sugangView.sugangSinCheong(vUser);
		} catch (Exception e){
			CExceptionView.processException(e);
		}
	}
}
