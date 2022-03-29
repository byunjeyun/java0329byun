
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
	protected String getSrcString() {//원
		return "원";
		// TODO Auto-generated method stub
	}

	@Override
	protected String getDestString() {//달
		// TODO Auto-generated method stub
		return "달라";
	}
//
//	
//	double val = scanner.nextDouble();
//	Double res = convert(val);
//	System.out.println("변환결과:"+res + getDestString()+"입니다");
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
//	System.out.println("원을 달러로 바꿉니다");
//	System.out.println("원을 입력하세요");
//	won = scanner.nextInt();
//	dollar = won/rate;
//	System.out.println(dollar);
//	}
}