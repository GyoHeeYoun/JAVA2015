package control;

import java.io.IOException;

import valueObject.VLogin;
import valueObject.VUser;
import valueObject.VUser.ELoginResult;
import entity.CUser;
import exception.PasswordNotMatchException;
import exception.UserIDNotFoundException;

//view가 가진 값을 받아서 entity한테 줌
public class CLoginControl extends CControl{
	
	public VUser login(VLogin vLogin) throws UserIDNotFoundException, PasswordNotMatchException, IOException
	{
		VUser vUser = new VUser();
		

		CUser user = new CUser();
		this.getDao().connect("member.txt", "r");
		user = (CUser)this.getDao().read(user, vLogin.getUserID());
		this.getDao().disconnect();
			
		//result 정리 필요
		if(user == null) 
			throw new UserIDNotFoundException();
		
		if(!user.getPassword().equals(vLogin.getPassword())) 
			throw new PasswordNotMatchException();
		
		vUser.seteLoginResult(ELoginResult.success);
		//result 정리 필요
		vUser.setName(user.getName());
		vUser.setName(user.getId());
		
		return vUser;
	}

}
