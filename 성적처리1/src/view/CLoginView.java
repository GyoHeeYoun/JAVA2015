package view;

//import java.util.Scanner;

import java.io.FileNotFoundException;

import control.CLoginControl;
import entity.VLogin;
import entity.VUser;
import exception.PasswordNotMatchException;
import exception.UserIDNotFoundException;

public class CLoginView extends CView{
	
	public VUser login() throws FileNotFoundException, UserIDNotFoundException, PasswordNotMatchException {
		VLogin vLogin = new VLogin(); // entity
		
		vLogin.setUserID("id5");
		vLogin.setPassword("pw5");
		VUser vUser= (VUser) ((CLoginControl)this.getControl()).login(vLogin); // member∏¶ processing«‘
		System.out.println("login result : "+vUser.geteLoginResult().toString());
		
		return vUser;
	}

}
