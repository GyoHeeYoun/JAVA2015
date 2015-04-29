package data_access_object;

import java.io.BufferedWriter;
import java.io.IOException;

import entity.CEntity;
import entity.CSugang;

public interface IDAO {
	public void connect(String name, String mode)  throws IOException;
	public void disconnect() throws IOException;
	public CEntity read(CEntity entity, String ID);
	public void write(CEntity entity) throws IOException;
	public CEntity readNext(CEntity entity);
	public boolean hasNext();
}
