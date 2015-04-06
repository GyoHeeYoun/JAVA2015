package data_access_object;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectDAO implements IDAO{
	public Object read(Class clazz, String fileName)
	{
		Object object = null;
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName));
			object = in.readObject();
			in.close();
			
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return object;
	}
	
	public void write(Object object, String fileName) {
		// TODO Auto-generated method stub
		
		//과목 write
		//object output stream
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName));
			out.writeObject(object);
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // exception control한다고 함
	}

}
