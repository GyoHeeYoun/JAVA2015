package control;

import entity.CMember;

//view가 가진 값을 받아서 entity한테 줌
public class CLoginControl extends CControl{
	private CMember member;
	
	
	public CMember login(CMember member)
	{
		//.은 전부 pointer
		this.member = member;
		
		return this.member;
	}

}
