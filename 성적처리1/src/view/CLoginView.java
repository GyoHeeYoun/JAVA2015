package view;

//import java.util.Scanner;

import control.CLoginControl;
import entity.VLogin;
import entity.VUser;

public class CLoginView extends CView{
	
	public void login() {
		VLogin vLogin = new VLogin(); // entity
		
		vLogin.setUserID("gyohee");
		vLogin.setPassword("gyoheeeeeee");
		VUser vUser= (VUser) ((CLoginControl)this.getControl()).login(vLogin); // member∏¶ processing«‘
		System.out.println("login result : "+vUser.geteLoginResult().toString());
	}

}
