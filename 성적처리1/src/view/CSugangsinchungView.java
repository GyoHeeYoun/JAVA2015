package view;

import entity.CSugangsinchung;

public class CSugangsinchungView {
	public CSugangsinchung getSugangsinchung()
	{
		CSugangsinchung sugangsinchung = new CSugangsinchung();
		
		sugangsinchung.setUserId("gyohee");
		sugangsinchung.setPassword("1111");
		sugangsinchung.setSugangGwamok("database");
		
		return sugangsinchung;
	}
}
