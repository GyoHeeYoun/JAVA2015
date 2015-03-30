package 성적처리v02;

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
		//mvc pattern: 3 계층
		//3 계층 사이를 member라는 object가 만들여저서 왔다갔다함
		//이런 종류의 object를 value object라고함
		
		
		//전부 로그인
		//수정
		//view
		CLoginView loginView = new CLoginView();
		//value object
		CMember member = loginView.login();   //키보드에서 읽음
		
		//control
		CLoginControl loginControl = new CLoginControl();   //읽은 것을 판단
		//logincontrol에게 줌(암호화됨)
		member = loginControl.login(member); //가공해주는 애
		
		//persistent storage에 써라
		//entity
		CMemberDAO memberDAO = new CMemberDAO();
		memberDAO.write(member);  //씀 
		System.out.println("");
		
		//과목개설
		CGwamokView gwamokView = new CGwamokView();
		CGwamok gwamok = CGwamokView.getGwamok();
		
		CGwamokControl gwamokControl = new CGwamokControl();
		gwamok = gwamokControl.processGwamok(gwamok);
		
		CGangjwaDAO gwamokDAO = new CGangjwaDAO();
		CGwamokDAO.write(gwamok);
		System.out.println("");
		
		//과목개설
		CGangjwaView gangjwaView = new CGangjwaView();
		CGangjwa gangjwa = gangjwaView.getGangjwa();
			
		CGangjwaControl gangjwaControl = new CGangjwaControl();
		gangjwa = gangjwaControl.processGangjwa(gangjwa);
				
		CGangjwaDAO gangjwaDAO = new CGangjwaDAO();
		CGangjwaDAO.write(gangjwa);
		
	}

}
