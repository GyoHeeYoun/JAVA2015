package data_access_object;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import entity.CGangjwa;
import entity.CGwamok;

public class CGangjwaDAO {
	
	public CGangjwa read()
	{
		return null;
	}
	
	public static void write(CGangjwa gangjwa) {
		// TODO Auto-generated method stub
		System.out.println("���� id : "+gangjwa.getID());
		System.out.println("���¸� : "+gangjwa.getName());
		
		//���� write
		//object output stream
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("./gangjwa"));
			out.writeObject(gangjwa);
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // exception control�Ѵٰ� ��
	}

}
