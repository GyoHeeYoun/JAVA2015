package data_access_object;

import entity.CMember;



//저장, read, write
public class CMemberDAO {
	//data access object의 약자 : read or write data from persistent storage
	
	public CMember read()
	{
		return null;
	}
	
	//member를 주면 읽어서 바꿈(업데이트)
	public void write(CMember member)
	{
		System.out.println("사용자 id : "+member.getUserID());
		System.out.println("password : "+member.getPassword());
	};
}
