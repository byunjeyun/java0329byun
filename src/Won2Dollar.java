
public class Won2Dollar extends Converter {
	
	
	public Won2Dollar(double ratio) {
	this.ratio = ratio;	
	}

	@Override
	protected double convert(double val) {
		// TODO Auto-generated method stub
		return val/ratio;
		}
		
	@Override
	protected String getSrcString() {//��
		return "��";
		// TODO Auto-generated method stub
	}

	@Override
	protected String getDestString() {//��
		// TODO Auto-generated method stub
		return "�޶�";
	}
//
//	
//	double val = scanner.nextDouble();
//	Double res = convert(val);
//	System.out.println("��ȯ���:"+res + getDestString()+"�Դϴ�");
//	
	
//	int won;
//	double dollar;
//	int rate;
//	
//	public Won2Dollar(int rate) {
//		super();
//		this.won = won;
//		this.dollar = dollar;
//		this.rate = rate;
//	}
//	
//	public void run() {
//	System.out.println("���� �޷��� �ٲߴϴ�");
//	System.out.println("���� �Է��ϼ���");
//	won = scanner.nextInt();
//	dollar = won/rate;
//	System.out.println(dollar);
//	}
}