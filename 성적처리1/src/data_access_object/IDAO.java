package data_access_object;

public interface IDAO {
	public Object read(Class clazz, String fileName);
	public void write(Object object, String fileName);
}
