package InterfaceEx13;

public class Circle implements Shape{

	private int r;
	
	public Circle(int r) {
		super();
		this.r = r;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("반지름이 " +r+ "인 원입니다.");
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
	return r*r*PI;
	}

}
