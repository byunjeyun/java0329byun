package InterfaceEx13;

public class Oval implements Shape {

	int x, y;

	public Oval(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public void draw() {
	// TODO Auto-generated method stub
		System.out.println(x+"x"+y+"에 내접하는 타원입니다.");
	}

	@Override
	public double getArea() {
	// TODO Auto-generated method stub
		return x*y*PI;
	}	
	
}
