package data_access_object;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import entity.CEntity;


public class TextDAO implements IDAO{

	@Override
	public Object read(Class clazz, String fileName) {
		// TODO Auto-generated method stub
		try {
			Scanner scanner = new Scanner(new File(fileName));
			CEntity entity = (CEntity)clazz.newInstance();
			entity.read(scanner);
			return entity;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	public void write(Object object, String fileName) {
		// TODO Auto-generated method stub
		java.lang.reflect.Field[] fields = object.getClass().getFields();
	}
}
