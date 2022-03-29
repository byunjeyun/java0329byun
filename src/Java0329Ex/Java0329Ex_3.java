package Java0329Ex;

public class Java0329Ex_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle a = new Circle(2, 3, 5);
		Circle b = new Circle(2, 3, 50);
		System.out.println("원 a :"+ a);
		System.out.println("원 b :"+ b);
		
		if(a.equals(b)) {
			System.out.println("같은 원");
		}
		else {
			System.out.println("서로 다른 원");
		}
		
	}

}
