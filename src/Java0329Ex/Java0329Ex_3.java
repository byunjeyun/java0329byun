package Java0329Ex;

public class Java0329Ex_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle a = new Circle(2, 3, 5);
		Circle b = new Circle(2, 3, 50);
		System.out.println("�� a :"+ a);
		System.out.println("�� b :"+ b);
		
		if(a.equals(b)) {
			System.out.println("���� ��");
		}
		else {
			System.out.println("���� �ٸ� ��");
		}
		
	}

}
