package control;

import java.io.IOException;

import valueObject.VLogin;
import valueObject.VUser;
import valueObject.VUser.ELoginResult;
import entity.CUser;
import exception.PasswordNotMatchException;
import exception.UserIDNotFoundException;

//view�� ���� ���� �޾Ƽ� entity���� ��
public class CLoginControl extends CControl{
	
	public VUser login(VLogin vLogin) throws UserIDNotFoundException, PasswordNotMatchException, IOException
	{
		VUser vUser = new VUser();
		

		CUser user = new CUser();
		this.getDao().connect("member.txt", "r");
		user = (CUser)this.getDao().read(user, vLogin.getUserID());
		this.getDao().disconnect();
			
		//result ���� �ʿ�
		if(user == null) 
			throw new UserIDNotFoundException();
		
		if(!user.getPassword().equals(vLogin.getPassword())) 
			throw new PasswordNotMatchException();
		
		vUser.seteLoginResult(ELoginResult.success);
		//result ���� �ʿ�
		vUser.setName(user.getName());
		vUser.setName(user.getId());
		
		return vUser;
	}

}
