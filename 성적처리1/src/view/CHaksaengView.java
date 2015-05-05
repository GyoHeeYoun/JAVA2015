package view;

import valueObject.VUser;

public class CHaksaengView extends CView {
	private VUser vUser;
	
	public CHaksaengView(VUser vUser) {
		// TODO Auto-generated constructor stub
		super("학생 메인");
		this.vUser = vUser;
		this.add(new CSugangView());
	}
	
}
