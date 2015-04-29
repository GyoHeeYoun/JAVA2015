package entity;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;

abstract public class CEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	protected String ID;
	
	public String getId() {	return ID;	}
	public void setId(String ID) {	this.ID = ID;	};
	
	abstract public void read(Scanner scanner);
	abstract public void write(BufferedWriter bufferWriter) throws IOException;
}
