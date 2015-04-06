package 성적처리v02;

import control.CGangjwaControl;
import control.CGwamokControl;
import control.CLoginControl;
import control.CSugangsinchungControl;
import data_access_object.IDAO;
import data_access_object.ObjectDAO;
import data_access_object.TextDAO;
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
		//mvc pattern: 3 계층
		//3 계층 사이를 member라는 object가 만들여저서 왔다갔다함
		//이런 종류의 object를 value object라고함
		
		
		CLoginView loginView = new CLoginView();
		CMember member = loginView.login();   //키보드에서 읽음

		CLoginControl loginControl = new CLoginControl();   //읽은 것을 판단
		member = loginControl.login(member); //가공해주는 애
		
		//persistent storage에 써라
		//entity
		IDAO memberDAO = new ObjectDAO();
		//memberDAO.write(member, "member");  //씀 
		//CMember member = new CMember();
		member = (CMember)memberDAO.read(member.getClass(), "member.txt");
		System.out.println("");
	/*	
		//과목개설
		CGwamokView gwamokView = new CGwamokView();
		CGwamok gwamok = CGwamokView.getGwamok();
		
		CGwamokControl gwamokControl = new CGwamokControl();
		gwamok = gwamokControl.processGwamok(gwamok);
		
		IDAO gwamokDAO = new ObjectDAO();
		//gwamokDAO.write(gwamok, "gwamok");
		gwamok = (CGwamok)gwamokDAO.read("gwamok");  //강제로 자식type으로 변환(type cast라고 함)
		
		//강좌개설
		CGangjwaView gangjwaView = new CGangjwaView();
		CGangjwa gangjwa = gangjwaView.getGangjwa();
			
		CGangjwaControl gangjwaControl = new CGangjwaControl();
		gangjwa = gangjwaControl.processGangjwa(gangjwa);
				
		IDAO gangjwaDAO = new ObjectDAO();
		//gangjwaDAO.write(gangjwa, "gangjwa");
		gangjwa = (CGangjwa)gangjwaDAO.read("gangjwa");
		
		/*
		//수강신청
		CSugangsinchungView sugangsinchungView = new CSugangsinchungView();
		CSugangsinchung sugangsinchung = sugangsinchungView.getSugangsinchung();
		
		CSugangsinchungControl sugangsinchungControl = new CSugangsinchungControl();
		sugangsinchung = sugangsinchungControl.processSugangsinchung(sugangsinchung);
		
		IDAO sugangsinchungDAO = new ObjectDAO();
		sugangsinchungDAO.write(sugangsinchung, "testOut");
		sugangsinchung = (CSugangsinchung)sugangsinchungDAO.read("testOut");
		*/
	}

}
