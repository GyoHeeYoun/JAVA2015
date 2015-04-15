package control;

import java.io.FileNotFoundException;

import entity.CUser;
import entity.VLogin;
import entity.VUser;
import entity.VUser.ELoginResult;

//view가 가진 값을 받아서 entity한테 줌
public class CLoginControl extends CControl{
	
	public VUser login(VLogin vLogin)
	{
		VUser vUser = new VUser();
		
		try {
			CUser user = new CUser();
			this.getDao().connect("member.txt");
			user = (CUser)this.getDao().read(user, vLogin.getUserID());
			this.getDao().disconnect();

			if(user == null){
				vUser.seteLoginResult(ELoginResult.idError);
				return vUser;
			}
			if(user.getPassword().equals(vLogin.getPassword())){
				vUser.seteLoginResult(ELoginResult.passwordError);
				return vUser;
			}
			
			vUser.seteLoginResult(ELoginResult.success);
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
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			vUser.seteLoginResult(ELoginResult.fileNotFound);
			return vUser;
		}
	}

}
