package ����ó��v02;

import control.CGangjwaControl;
import control.CGwamokControl;
import control.CLoginControl;
import data_access_object.DAO;
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
		DAO memberDAO = new DAO();
		memberDAO.write(member, "member");  //�� 
		member = (CMember)memberDAO.read("member");
		System.out.println("");
		
		//���񰳼�
		CGwamokView gwamokView = new CGwamokView();
		CGwamok gwamok = CGwamokView.getGwamok();
		
		CGwamokControl gwamokControl = new CGwamokControl();
		gwamok = gwamokControl.processGwamok(gwamok);
		
		DAO gwamokDAO = new DAO();
		DAO.write(gwamok, "gwamok");
		gwamok = (CGwamok)gwamokDAO.read("gwamok");  //������ �ڽ�type���� ��ȯ(type cast��� ��)
		
		//���°���
		CGangjwaView gangjwaView = new CGangjwaView();
		CGangjwa gangjwa = gangjwaView.getGangjwa();
			
		CGangjwaControl gangjwaControl = new CGangjwaControl();
		gangjwa = gangjwaControl.processGangjwa(gangjwa);
				
		DAO gangjwaDAO = new DAO();
		DAO.write(gangjwa, "gangjwa");
		gangjwa = (CGangjwa)gangjwaDAO.read("gangjwa");
		
	}

}
