package control;

import java.io.FileNotFoundException;
import java.util.Vector;

import data_access_object.IDAO;
import entity.CEntity;
import entity.CGangjwa;

public class CSugangControl extends CControl {

	public Vector<CGangjwa> getGangwaList() throws FileNotFoundException {
		// TODO Auto-generated method stub
		IDAO dao = this.getDao(); // ����list�� �޶�� ��.
		
		this.getDao().connect("member.txt");
		Vector<CEntity> entityList = this.getDao().readAll();
		this.getDao().disconnect();
		
		Vector<CGangjwa> gangjwaList = new Vector<CGangjwa>();
		for(CEntity entity : entityList){
			gangjwaList.add((CGangjwa)entity);
		}
		
		return gangjwaList;
	}

}
