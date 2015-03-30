package ����ó��v02;

import control.CGangjwaControl;
import control.CGwamokControl;
import control.CLoginControl;
import data_access_object.CGangjwaDAO;
import data_access_object.CGwamokDAO;
import data_access_object.CMemberDAO;
import entity.CGwamok;
import entity.CGangjwa;
import entity.CMember;
import view.CGangjwaView;
import view.CGwamokView;
import view.CLoginView;

public class CMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//mvc pattern: 3 ����
		//3 ���� ���̸� member��� object�� ���鿩���� �Դٰ�����
		//�̷� ������ object�� value object�����
		
		
		//���� �α���
		//����
		//view
		CLoginView loginView = new CLoginView();
		//value object
		CMember member = loginView.login();   //Ű���忡�� ����
		
		//control
		CLoginControl loginControl = new CLoginControl();   //���� ���� �Ǵ�
		//logincontrol���� ��(��ȣȭ��)
		member = loginControl.login(member); //�������ִ� ��
		
		//persistent storage�� ���
		//entity
		CMemberDAO memberDAO = new CMemberDAO();
		memberDAO.write(member);  //�� 
		System.out.println("");
		
		//���񰳼�
		CGwamokView gwamokView = new CGwamokView();
		CGwamok gwamok = CGwamokView.getGwamok();
		
		CGwamokControl gwamokControl = new CGwamokControl();
		gwamok = gwamokControl.processGwamok(gwamok);
		
		CGangjwaDAO gwamokDAO = new CGangjwaDAO();
		CGwamokDAO.write(gwamok);
		System.out.println("");
		
		//���񰳼�
		CGangjwaView gangjwaView = new CGangjwaView();
		CGangjwa gangjwa = gangjwaView.getGangjwa();
			
		CGangjwaControl gangjwaControl = new CGangjwaControl();
		gangjwa = gangjwaControl.processGangjwa(gangjwa);
				
		CGangjwaDAO gangjwaDAO = new CGangjwaDAO();
		CGangjwaDAO.write(gangjwa);
		
	}

}
