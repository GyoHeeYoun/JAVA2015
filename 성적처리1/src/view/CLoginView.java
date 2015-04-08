package view;

//import java.util.Scanner;

import entity.CMember;

public class CLoginView extends CView{
	
	public void login() {
		CMember member = new CMember(); // entity
		
		member.setUserID("gyohee");
		member.setPassword("gyoheeeeeee");
		member = (CMember) this.getControl().process(member); // member∏¶ processing«‘
	}

}
