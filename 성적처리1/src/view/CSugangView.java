package view;

import java.io.FileNotFoundException;
import java.util.Vector;

import control.CSugangControl;
import entity.CGangjwa;

public class CSugangView extends CView{

	public void sugangSinCheong() throws FileNotFoundException {
		// show Gangjwa List
		CSugangControl sugangControl = (CSugangControl) this.getControl();
		Vector<CGangjwa> getGangjwaList = sugangControl.getGangwaList();
		
		// select Gangjwa
		// confirm SugangSincheong
		// show result
		
	}

}
