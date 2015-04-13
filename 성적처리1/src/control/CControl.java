package control;

import data_access_object.IDAO;

public class CControl {
	private IDAO dao;
	
	
	//association
	public IDAO getDao() {
		return dao;
	}


	public void setDao(IDAO dao) {
		this.dao = dao;
	}

}
