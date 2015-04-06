package 성적처리v02;


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
		//mvc pattern: 3 계층
		//3 계층 사이를 member라는 object가 만들여저서 왔다갔다함
		//이런 종류의 object를 value object라고함
		
		
		CLoginView loginView = new CLoginView();
		CMember member = loginView.login();   //키보드에서 읽음

		CLoginControl loginControl = new CLoginControl();   //읽은 것을 판단
		member = loginControl.login(member); //가공해주는 애
		
		//persistent storage에 써라
		//entity
		IDAO memberDAO = new TextDAO();
		//memberDAO.write(member, "member");  //씀 
		//CMember member = new CMember();
		member = (CMember)memberDAO.read(member, "gangjwa.txt");
		System.out.println("");
		
	}

}
