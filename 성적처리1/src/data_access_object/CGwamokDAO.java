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
	
	//member�� �ָ� �о �ٲ�(������Ʈ)
	public static void write(CGwamok gwamok)
	{
		System.out.println("���� id : "+gwamok.getID());
		System.out.println("����� : "+gwamok.getName());
		
		//���� write
		//object output stream
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("testOut"));
			out.writeObject(gwamok);
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // exception control�Ѵٰ� ��
		
	};
}
