package view;

//import java.util.Scanner;

import java.io.IOException;
import java.util.Scanner;

import valueObject.VLogin;
import valueObject.VUser;
import control.CLoginControl;
import exception.PasswordNotMatchException;
import exception.UserIDNotFoundException;

public class CMainView extends CView{
	private VUser vUser;
	private CHaksaengView haksaengView;
	Scanner scanner;
	
	public CMainView() {
		super("main view");
		scanner = new Scanner(System.in);
	}
	
	public void login() throws UserIDNotFoundException, PasswordNotMatchException, IOException {
		VLogin vLogin = new VLogin(); // entity
		CHaksaengView haksaengView;
		
		vLogin.setUserID("id5");
		vLogin.setPassword("pw5");

		vUser= (VUser) ((CLoginControl)this.getControl()).login(vLogin); // member를 processing함
		System.out.println("login result : "+vUser.getName());

	}

	public void start(){
		// TODO Auto-generated method stub
		try {
			CLoginView loginView = new CLoginView();
			loginView.show(scanner);
			
			haksaengView = new CHaksaengView(vUser); //유저 정보를 넘겨줌
			haksaengView.show(scanner);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
