package Interface;

public interface PhoneInterfaceEx {
	final int TIMEOUT = 10000;
	
	void sendCall();//�߻�޼ҵ� ����
	void receiveCall();
	
	default void printLogo() {
		System.out.println("** Phone **");
	}
}
