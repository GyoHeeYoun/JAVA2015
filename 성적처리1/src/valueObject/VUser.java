package valueObject;

public class VUser {
	public enum ELoginResult {success, idError, passwordError, fileNotFound};
	private ELoginResult eLoginResult;
	private String userID, name;
	
	//get�� data�� �о��
	//set�� ���� ��
	//������� value object�� ����
	public String getUserID() {return userID;}
	public void setUserID(String userID) {this.userID = userID;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	
	public ELoginResult geteLoginResult() {return eLoginResult;}
	public void seteLoginResult(ELoginResult eLoginResult) {this.eLoginResult = eLoginResult;}
	
	public void read(){};
	public void write(){};
}
