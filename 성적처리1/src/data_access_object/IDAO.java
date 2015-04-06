package data_access_object;

import entity.CEntity;

public interface IDAO {
	public Object read(CEntity entity, String fileName);
	public void write(Object object, String fileName);
}
