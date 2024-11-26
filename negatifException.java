package tp8;

public class negatifException extends Exception {
	private String msg;
	public negatifException (String n){
		msg=n;
	}
	public String getmessage() {
		return msg;
	}
}
