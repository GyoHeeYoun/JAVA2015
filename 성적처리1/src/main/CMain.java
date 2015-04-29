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
		//mvc pattern: 3 ����
		//3 ���� ���̸� member��� object�� ���鿩���� �Դٰ�����
		//�̷� ������ object�� value object�����
		
		//create objects
		
		//start program
		try {
			//view, component
			CLoginView loginView = new CLoginView();
			//control
			CLoginControl loginControl = new CLoginControl();   //���� ���� �Ǵ�
			//dao
			IDAO dao = new TextDAO();
			
			CSugangView sugangView = new CSugangView();
			CGangjwaControl gangjwaControl = new CGangjwaControl();
	
			
			//association������
			loginView.setControl(loginControl);
			loginControl.setDao(dao);
			
			sugangView.setControl(gangjwaControl);
			gangjwaControl.setDao(dao);
			
			
			//�������� ã�� ȣ��(start program)
			VUser vUser = loginView.login();
			sugangView.sugangSinCheong(vUser);
		} catch (Exception e){
			CExceptionView.processException(e);
		}
	}
}
