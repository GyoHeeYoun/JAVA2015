package control;

import entity.CMember;

//view�� ���� ���� �޾Ƽ� entity���� ��
public class CLoginControl extends CControl{
	private CMember member;
	
	
	public CMember login(CMember member)
	{
		//.�� ���� pointer
		this.member = member;
		
		return this.member;
	}

}
