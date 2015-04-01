package data_access_object;


public class TextDAO implements IDAO{

	@Override
	public Object read(String fileName) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void write(Object object, String fileName) {
		// TODO Auto-generated method stub
		java.lang.reflect.Field[] fields = object.getClass().getFields();
	}
}
