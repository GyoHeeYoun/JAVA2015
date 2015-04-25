package data_access_object;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

import entity.CEntity;

public interface IDAO {
	public void connect(String name) throws FileNotFoundException;
	public void disconnect();
	public CEntity read(CEntity entity, String ID);
	public void write(Scanner scanner);
	public Vector<CEntity> readAll();
}
