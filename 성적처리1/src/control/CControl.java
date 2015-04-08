package control;

import data_access_object.IDAO;
import entity.CEntity;
import entity.CMember;

public class CControl {
	private IDAO dao;
	
	
	//association
	public IDAO getDao() {
		return dao;
	}



	public void setDao(IDAO dao) {
		this.dao = dao;
	}

	public CEntity process(CEntity entity) {
		// TODO Auto-generated method stub
		entity = (CEntity) dao.read(entity, "gangjwa.txt");
		return entity;
	}
}
