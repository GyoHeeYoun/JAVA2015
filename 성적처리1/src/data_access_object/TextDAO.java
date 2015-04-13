package data_access_object;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import entity.CEntity;


public class TextDAO implements IDAO{
	private Scanner scanner;
	
	@Override
	public void connect(String name) throws FileNotFoundException {
		// TODO Auto-generated method stub
		this.scanner = new Scanner(new File(name));

	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		this.scanner.close();
	}
	
	@Override
	public CEntity read(CEntity entity) {
		// TODO Auto-generated method stub
		entity.read(scanner);
		return entity;
	}
	
	public void write(CEntity entity) {
		// TODO Auto-generated method stub
		entity.write(scanner);
	}

	@Override
	public void write(Scanner scanner) {
		// TODO Auto-generated method stub
		
	}
	
	public boolean hasNext(){
		return this.scanner.hasNext();
	}
}
