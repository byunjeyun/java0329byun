import InterfaceEx13.Circle;// 다른 패키지의 클래스 불러오기

public class Km2Mile extends Converter {

	
	public Km2Mile(double ratio) {
	this.ratio = ratio;	
	}

	@Override
	protected double convert(double val) {
		// TODO Auto-generated method stub
		return val/ratio;
		}
		
	@Override
	protected String getSrcString() {//원
		return "km";
		// TODO Auto-generated method stub
	}

	@Override
	protected String getDestString() {//달
		// TODO Auto-generated method stub
		return "mile";
	}
	
}
