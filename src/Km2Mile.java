import InterfaceEx13.Circle;// �ٸ� ��Ű���� Ŭ���� �ҷ�����

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
	protected String getSrcString() {//��
		return "km";
		// TODO Auto-generated method stub
	}

	@Override
	protected String getDestString() {//��
		// TODO Auto-generated method stub
		return "mile";
	}
	
}
