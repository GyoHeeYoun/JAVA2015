package data_access_object;

public interface IDAO {
	public Object read(String fileName);
	public static void write(Object object, String fileName) {
	} 
}
