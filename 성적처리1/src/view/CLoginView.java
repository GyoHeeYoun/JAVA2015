package view;

import java.util.Scanner;

import valueObject.VLogin;

public class CLoginView extends CView {

	public CLoginView() {
		super("로그인 화면");
		// TODO Auto-generated constructor stub
	}
	
	public void show(Scanner scanner) {
		VLogin vLogin = new VLogin(); // entity
		
		vLogin.setUserID("id5");
		vLogin.setPassword("pw5");

		//VUser vUser= (VUser) ((CLoginControl)this.getControl()).login(vLogin); // member를 processing함
		System.out.println("로그인된 ID :"+vLogin.getUserID());
	}
}
