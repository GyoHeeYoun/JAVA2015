package ����ó��v02;


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
		
		
		CLoginView loginView = new CLoginView();
		CMember member = loginView.login();   //Ű���忡�� ����

		CLoginControl loginControl = new CLoginControl();   //���� ���� �Ǵ�
		member = loginControl.login(member); //�������ִ� ��
		
		//persistent storage�� ���
		//entity
		IDAO memberDAO = new TextDAO();
		//memberDAO.write(member, "member");  //�� 
		//CMember member = new CMember();
		member = (CMember)memberDAO.read(member, "gangjwa.txt");
		System.out.println("");
		
	}

}
