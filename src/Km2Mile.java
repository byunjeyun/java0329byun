
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
	protected String getSrcString() {//Пј
		return "km";
		// TODO Auto-generated method stub
	}

	@Override
	protected String getDestString() {//До
		// TODO Auto-generated method stub
		return "mile";
	}
	
}
