package entity;

import java.io.Serializable;
import java.util.Scanner;

// Entity class or Value class
//�Ӽ����θ� ����������
//�ڹٿ����� �Ӽ��� ���� public���� ���� ����.
public class CMember implements Serializable{
	
	//data�� value�� �߽����� ���ǵ�
	//data�� �����ϱ� ���� class
	//�� ���� �Լ��� ���� ����.

	
	
	//attribute
	//�Ϲ� structure
	private String userID, password;
	
	
	//get�� data�� �о��
	//set�� ���� ��
	//������� value object�� ����
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
