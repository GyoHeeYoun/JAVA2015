package valueObject;

public class VUser {
	public enum ELoginResult {success, idError, passwordError, fileNotFound};
	private ELoginResult eLoginResult;
	private String userID, name;
	
	//get은 data를 읽어옴
	//set은 값을 씀
	//여기까지 value object를 만듦
	public String getUserID() {return userID;}
	public void setUserID(String userID) {this.userID = userID;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	
	public ELoginResult geteLoginResult() {return eLoginResult;}
	public void seteLoginResult(ELoginResult eLoginResult) {this.eLoginResult = eLoginResult;}
	
	public void read(){};
	public void write(){};
}
