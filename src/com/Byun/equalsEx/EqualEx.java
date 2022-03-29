package com.Byun.equalsEx;

public class EqualEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rect a = new Rect(2, 3);
		Rect b = new Rect(3, 2);
		Rect c = new Rect(4, 2);
		if(a.equals(b)) {
			System.out.println("a와b는 같음");
		}
		else {
			System.out.println("a와b는 다름");
			}
		if(a.equals(c)) {
			System.out.println("a 와 c는 같음");
		}
		
		else {
			System.out.println("a와c는 다름");
		}
		if(b.equals(c)) {
			System.out.println("b와 c는 같음");
		}
		
		else {
			System.out.println("b와c는 다름");
		}
	}

}
