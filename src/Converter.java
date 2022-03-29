
import java.util.Scanner;
public abstract class Converter {
	
	abstract protected double convert(double src);
	abstract protected String getSrcString();
	abstract protected String getDestString();
	protected double ratio; 
	
	public void run() {
		Scanner scanner = new Scanner(System.in); 
		System.out.println(getSrcString()+"��"+getDestString() +"�� �ٲߴϴ�.");
		System.out.println(getSrcString()+"�� �Է��ϼ���>>");
		double val = scanner.nextDouble();
		Double res = convert(val);
		System.out.println("��ȯ���:"+res + getDestString()+"�Դϴ�");
		scanner.close();
		}
}
