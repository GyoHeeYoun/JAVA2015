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
		//mvc pattern: 3 ����
		//3 ���� ���̸� member��� object�� ���鿩���� �Դٰ�����
		//�̷� ������ object�� value object�����
		
		//create objects
		CLoginView loginView = new CLoginView();
		CLoginControl loginControl = new CLoginControl();   //���� ���� �Ǵ�
		IDAO dao = new TextDAO();
		
		//association
		loginView.setControl(loginControl);
		loginControl.setDao(dao);
		
		//start login
		loginView.login();  //�̰� ���������� ��.
	}

}
