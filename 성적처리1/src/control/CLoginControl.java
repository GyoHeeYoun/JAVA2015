package control;

import java.io.FileNotFoundException;

import entity.CUser;
import entity.VLogin;
import entity.VUser;
import entity.VUser.ELoginResult;
import exception.PasswordNotMatchException;
import exception.UserIDNotFoundException;

//view�� ���� ���� �޾Ƽ� entity���� ��
public class CLoginControl extends CControl{
	
	public VUser login(VLogin vLogin) throws UserIDNotFoundException, FileNotFoundException, PasswordNotMatchException
	{
		VUser vUser = new VUser();
		

			CUser user = new CUser();
			this.getDao().connect("member.txt");
			user = (CUser)this.getDao().read(user, vLogin.getUserID());
			this.getDao().disconnect();
			
			//result ���� �ʿ�
			if(user == null) throw new UserIDNotFoundException();
			if(!user.getPassword().equals(vLogin.getPassword())) throw new PasswordNotMatchException();
			vUser.seteLoginResult(ELoginResult.success);
			//result ���� �ʿ�
			vUser.setName(user.getName());
			vUser.setName(user.getId());
			/*
			while(this.getDao().hasNext()){
				CUser user = new CUser();
				user = (CUser)this.getDao().read(user);
				if(vUser.getUserID().equals(vLogin.getUserID())){
					if(user.getPassword().equals(vLogin.getPassword())){
						vUser.seteLoginResult(ELoginResult.success);
						vUser.setName(user.getName());
						vUser.setName(user.getId());
					}
					else
					{
						vUser.seteLoginResult(ELoginResult.passwordError);
					}
					this.getDao().disconnect();
					return vUser;
				}
			}
			*/
			return vUser;
	}

}
