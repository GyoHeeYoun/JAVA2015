package view;

import entity.CGwamok;

public class CGwamokView {

	public static CGwamok getGwamok() {
		// TODO Auto-generated method stub
		CGwamok gwamok = new CGwamok();
		
		//과목의 기본적인 정보 셋팅
		gwamok.setID(21);
		gwamok.setName("자바플그래밍");
		gwamok.setHakjeom("A");
		
		return gwamok;
	}

}
