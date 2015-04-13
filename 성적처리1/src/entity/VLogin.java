package entity;

import java.util.Scanner;

// Entity class or Value class
//속성으로만 구성되있음
//자바에서는 속성을 절대 public으로 놓지 않음.
public class VLogin{
	
	//data의 value를 중심으로 정의됨
	//data를 저장하기 위한 class
	//이 경우는 함수가 거의 없음.
	
	//attribute
	//일반 structure
	private String userID, name;
	
	public String getUserID() {return userID;}
	public void setUserID(String userID) {this.userID = userID;}
	public String getPassword() {return name;}
	public void setPassword(String name) {this.name = name;}
	
	public void read(Scanner scanner){
		
	};
	
	public void write(){
		
	};

}
