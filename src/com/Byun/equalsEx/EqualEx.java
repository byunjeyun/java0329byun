package com.Byun.equalsEx;

public class EqualEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rect a = new Rect(2, 3);
		Rect b = new Rect(3, 2);
		Rect c = new Rect(4, 2);
		if(a.equals(b)) {
			System.out.println("a��b�� ����");
		}
		else {
			System.out.println("a��b�� �ٸ�");
			}
		if(a.equals(c)) {
			System.out.println("a �� c�� ����");
		}
		
		else {
			System.out.println("a��c�� �ٸ�");
		}
		if(b.equals(c)) {
			System.out.println("b�� c�� ����");
		}
		
		else {
			System.out.println("b��c�� �ٸ�");
		}
	}

}
