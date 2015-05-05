package main;


import java.util.Scanner;

import control.CGangjwaControl;
import control.CLoginControl;
import data_access_object.IDAO;
import data_access_object.TextDAO;
import valueObject.VUser;
import view.CExceptionView;
import view.CMainView;
import view.CSugangView;

public class CMain {

	public static void main(String[] args) {
		//mvc pattern: 3 계층
		//3 계층 사이를 member라는 object가 만들여저서 왔다갔다함
		//이런 종류의 object를 value object라고함
		
		//create objects
		
		//start program
		try {
			Scanner scanner = new Scanner(System.in);
			/*
			//view, component
			CMainView mainView = new CMainView();
			//control
			CLoginControl loginControl = new CLoginControl();   //읽은 것을 판단
			//dao
			IDAO dao = new TextDAO();
			
			//association연결함
			mainView.setControl(loginControl);
			loginControl.setDao(dao);
			
			//VUser vUser = mainView.login();
			//
			CSugangView sugangView = new CSugangView();
			CGangjwaControl gangjwaControl = new CGangjwaControl();
			
			sugangView.setControl(gangjwaControl);
			gangjwaControl.setDao(dao);
			
			
			//시작점을 찾아 호출(start program)
			*/
			CMainView mainView = new CMainView();
			mainView.show(scanner);
		} catch (Exception e){
			CExceptionView.processException(e);
		}
	}
}
