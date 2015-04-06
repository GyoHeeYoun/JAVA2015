package entity;

import java.io.Serializable;
import java.util.Scanner;

abstract public class CEntity implements Serializable{
	public void read(Scanner scanner){};
	
	public void write(){};
	
}
