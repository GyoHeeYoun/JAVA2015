package data_access_object;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import entity.CGwamok;
import entity.CMember;

public class CGwamokDAO {
	public CGwamok read()
	{
		return null;
	}
	
	//member를 주면 읽어서 바꿈(업데이트)
	public static void write(CGwamok gwamok)
	{
		System.out.println("과목 id : "+gwamok.getID());
		System.out.println("과목명 : "+gwamok.getName());
		
		//과목 write
		//object output stream
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("testOut"));
			out.writeObject(gwamok);
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // exception control한다고 함
		
	};
}
