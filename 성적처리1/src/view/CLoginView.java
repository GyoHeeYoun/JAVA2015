package view;

import java.util.Scanner;

import valueObject.VLogin;

public class CLoginView extends CView {

	public CLoginView() {
		super("�α��� ȭ��");
		// TODO Auto-generated constructor stub
	}
	
	public void show(Scanner scanner) {
		VLogin vLogin = new VLogin(); // entity
		
		vLogin.setUserID("id5");
		vLogin.setPassword("pw5");

		//VUser vUser= (VUser) ((CLoginControl)this.getControl()).login(vLogin); // member�� processing��
		System.out.println("�α��ε� ID :"+vLogin.getUserID());
	}
}
