package Interface;

public class InterfaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone phone = new SmartPhone();
		phone.printLogo();
		phone.sendCall();
		phone.play();
		System.out.println("2�� 5�� ���ϸ�"+ phone.calculate(2,5));
		phone.schedule();
	}

}
