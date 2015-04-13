package data_access_object;

import java.io.FileNotFoundException;
import java.util.Scanner;

import entity.CEntity;

public interface IDAO {
	public void connect(String name) throws FileNotFoundException;
	public void disconnect();
	public CEntity read(CEntity entity);
	public void write(Scanner scanner);
	public boolean hasNext();
}
