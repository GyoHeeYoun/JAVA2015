package entity;

import java.io.Serializable;
import java.util.Scanner;

public class CEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	protected String ID;
	
	public String getId() {	return ID;	}
	public void setId(String ID) {	this.ID = ID;	};
	
	public void read(Scanner scanner){};
	public void write(Scanner scanner){};
}
