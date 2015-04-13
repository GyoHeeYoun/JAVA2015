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
			this.getDao().connect("member.txt");
			while(this.getDao().hasNext()){
				CUser user = new CUser();
				user = (CUser)this.getDao().read(user);
				if(vUser.getUserID().equals(vLogin.getUserID())){
					if(user.getPassword().equals(vLogin.getPassword())){
						vUser.seteLoginResult(ELoginResult.success);
						vUser.setName(user.getName());
						vUser.setName(user.getUserID());
					}
					else
					{
						vUser.seteLoginResult(ELoginResult.passwordError);
					}
					this.getDao().disconnect();
					return vUser;
				}
			}
			this.getDao().disconnect();
			vUser.seteLoginResult(ELoginResult.idError);
			return vUser;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			vUser.seteLoginResult(ELoginResult.fileNotFound);
			return vUser;
		}
	}

}
