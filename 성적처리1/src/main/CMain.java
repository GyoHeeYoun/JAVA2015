package main;


import control.CGwamokControl;
import control.CLoginControl;
import data_access_object.IDAO;
import data_access_object.ObjectDAO;
import data_access_object.TextDAO;
import entity.CGwamok;

import entity.CMember;

import view.CGwamokView;
import view.CLoginView;

public class CMain {

	public static void main(String[] args) {
		//mvc pattern: 3 계층
		//3 계층 사이를 member라는 object가 만들여저서 왔다갔다함
		//이런 종류의 object를 value object라고함
		
		//create objects
		CLoginView loginView = new CLoginView();
		CLoginControl loginControl = new CLoginControl();   //읽은 것을 판단
		IDAO dao = new TextDAO();
		
		//association
		loginView.setControl(loginControl);
		loginControl.setDao(dao);
		
		//start login
		loginView.login();  //이게 웹페이지가 됨.
	}

}
