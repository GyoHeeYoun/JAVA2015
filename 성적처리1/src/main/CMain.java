package main;


import control.CLoginControl;
import data_access_object.IDAO;
import data_access_object.TextDAO;
import view.CExceptionView;
import view.CLoginView;

public class CMain {

	public static void main(String[] args) {
		//mvc pattern: 3 ����
		//3 ���� ���̸� member��� object�� ���鿩���� �Դٰ�����
		//�̷� ������ object�� value object�����
		
		//create objects
		
		//start program
		try {
			//view
			CLoginView loginView = new CLoginView();
			//control
			CLoginControl loginControl = new CLoginControl();   //���� ���� �Ǵ�
			//dao
			IDAO dao = new TextDAO();
			
			//association
			loginView.setControl(loginControl);
			loginControl.setDao(dao);
			loginView.login();
		} catch (Exception e){
			CExceptionView.processException(e);
		}
		
		  
		
		//�̰� ���������� ��.
	}

}
