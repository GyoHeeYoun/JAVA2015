package entity;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class CGangjwa extends CEntity {
	
	private static final long serialVersionUID = 1L;
	private String name;
	private int gwamokID;
	
	public String getName() {	return name;	}
	public void setName(String name) {	this.name = name;	}
	public int getGwamokID() {	return gwamokID;	}
	public void setGwamokID(int gwamokID) {	this.gwamokID = gwamokID;	}

	@Override
	public void read(Scanner scanner) throws NoSuchElementException, IllegalStateException{
		// TODO Auto-generated method stub

	}

	@Override
	public void write(Scanner scanner) {
		// TODO Auto-generated method stub

	}

}
