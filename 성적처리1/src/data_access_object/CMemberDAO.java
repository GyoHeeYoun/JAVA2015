package data_access_object;

import entity.CMember;



//����, read, write
public class CMemberDAO {
	//data access object�� ���� : read or write data from persistent storage
	
	public CMember read()
	{
		return null;
	}
	
	//member�� �ָ� �о �ٲ�(������Ʈ)
	public void write(CMember member)
	{
		System.out.println("����� id : "+member.getUserID());
		System.out.println("password : "+member.getPassword());
	};
}
