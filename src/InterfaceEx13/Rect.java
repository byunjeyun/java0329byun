package InterfaceEx13;

public class Rect implements Shape {

int a, b;

public Rect(int a, int b) {
	super();
	this.a = a;
	this.b = b;
}

@Override
public void draw() {
	// TODO Auto-generated method stub
	System.out.println(a+"x"+b+" ũ���� �簢�� �Դϴ�.");
}

@Override
public double getArea() {
	// TODO Auto-generated method stub
	return a*b;
}

}
