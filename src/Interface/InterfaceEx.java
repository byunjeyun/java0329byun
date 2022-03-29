package Interface;

public class InterfaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone phone = new SmartPhone();
		phone.printLogo();
		phone.sendCall();
		phone.play();
		System.out.println("2와 5를 더하면"+ phone.calculate(2,5));
		phone.schedule();
	}

}
