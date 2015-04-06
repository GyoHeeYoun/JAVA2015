package entity;

import java.io.Serializable;
import java.util.Scanner;

// Entity class or Value class
//속성으로만 구성되있음
//자바에서는 속성을 절대 public으로 놓지 않음.
public class CMember implements Serializable{
	
	//data의 value를 중심으로 정의됨
	//data를 저장하기 위한 class
	//이 경우는 함수가 거의 없음.

	
	
	//attribute
	//일반 structure
	private String userID, password;
	
	
	//get은 data를 읽어옴
	//set은 값을 씀
	//여기까지 value object를 만듦
	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public void read(Scanner scanner){
		userID = scanner.next();
		password = scanner.next();
	};
	
	public void write(){
		
	};

}
