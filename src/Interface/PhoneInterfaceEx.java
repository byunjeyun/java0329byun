package Interface;

public interface PhoneInterfaceEx {
	final int TIMEOUT = 10000;
	
	void sendCall();//추상메소드 선언
	void receiveCall();
	
	default void printLogo() {
		System.out.println("** Phone **");
	}
}
