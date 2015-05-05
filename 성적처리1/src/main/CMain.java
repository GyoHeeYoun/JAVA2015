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
		//mvc pattern: 3 ����
		//3 ���� ���̸� member��� object�� ���鿩���� �Դٰ�����
		//�̷� ������ object�� value object�����
		
		//create objects
		
		//start program
		try {
			Scanner scanner = new Scanner(System.in);
			/*
			//view, component
			CMainView mainView = new CMainView();
			//control
			CLoginControl loginControl = new CLoginControl();   //���� ���� �Ǵ�
			//dao
			IDAO dao = new TextDAO();
			
			//association������
			mainView.setControl(loginControl);
			loginControl.setDao(dao);
			
			//VUser vUser = mainView.login();
			//
			CSugangView sugangView = new CSugangView();
			CGangjwaControl gangjwaControl = new CGangjwaControl();
			
			sugangView.setControl(gangjwaControl);
			gangjwaControl.setDao(dao);
			
			
			//�������� ã�� ȣ��(start program)
			*/
			CMainView mainView = new CMainView();
			mainView.show(scanner);
		} catch (Exception e){
			CExceptionView.processException(e);
		}
	}
}
