package ����ó��v02;

import control.CGangjwaControl;
import control.CGwamokControl;
import control.CLoginControl;
import control.CSugangsinchungControl;
import data_access_object.IDAO;
import data_access_object.ObjectDAO;
import entity.CGwamok;
import entity.CGangjwa;
import entity.CMember;
import entity.CSugangsinchung;
import view.CGangjwaView;
import view.CGwamokView;
import view.CLoginView;
import view.CSugangsinchungView;

public class CMain {

	public static void main(String[] args) {
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
		IDAO memberDAO = new ObjectDAO();
		IDAO.write(member, "member");  //�� 
		member = (CMember)memberDAO.read("member");
		System.out.println("");
		
		//���񰳼�
		CGwamokView gwamokView = new CGwamokView();
		CGwamok gwamok = CGwamokView.getGwamok();
		
		CGwamokControl gwamokControl = new CGwamokControl();
		gwamok = gwamokControl.processGwamok(gwamok);
		
		IDAO gwamokDAO = new ObjectDAO();
		IDAO.write(gwamok, "gwamok");
		gwamok = (CGwamok)gwamokDAO.read("gwamok");  //������ �ڽ�type���� ��ȯ(type cast��� ��)
		
		//���°���
		CGangjwaView gangjwaView = new CGangjwaView();
		CGangjwa gangjwa = gangjwaView.getGangjwa();
			
		CGangjwaControl gangjwaControl = new CGangjwaControl();
		gangjwa = gangjwaControl.processGangjwa(gangjwa);
				
		IDAO gangjwaDAO = new ObjectDAO();
		IDAO.write(gangjwa, "gangjwa");
		gangjwa = (CGangjwa)gangjwaDAO.read("gangjwa");
		
		//������û
		CSugangsinchungView sugangsinchungView = new CSugangsinchungView();
		CSugangsinchung sugangsinchung = sugangsinchungView.getSugangsinchung();
		
		CSugangsinchungControl sugangsinchungControl = new CSugangsinchungControl();
		sugangsinchung = sugangsinchungControl.processSugangsinchung(sugangsinchung);
		
		IDAO sugangsinchungDAO = new ObjectDAO();
		IDAO.write(sugangsinchung, "testOut");
		sugangsinchung = (CSugangsinchung)sugangsinchungDAO.read("testOut");
		
	}

}
