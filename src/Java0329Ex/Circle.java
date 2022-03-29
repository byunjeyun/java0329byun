package Java0329Ex;

public class Circle {

	public int x, y, radius;

	public Circle(int x, int y, int radius) {
		super();
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public String toString() {
		return "Circle("+x+","+y+")"+"¹ÝÁö¸§"+radius;
	}
	
	public boolean equals(Object obj) {
		Circle C = (Circle)obj;
		int centerx = C.x;
		int centery = C.y;
		
		int center_sx = this.x;
		int center_sy = this.y;
		
		if(centerx==center_sx && centery==center_sy) {
		return true;
		}
		else {
			return false;
		}
	}
}