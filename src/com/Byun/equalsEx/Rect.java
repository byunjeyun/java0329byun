package com.Byun.equalsEx;

public class Rect {
	private int width, height;
	
	public Rect(int width, int height) { 
		this.width=width;
		this.height=height;
	}
	
//	public boolean equals(Rect rec) {
//		int area = rec.height*rec.width;
//		
//		int area_self = this.width * this.height;
//		
//		if (area == area_self)
//			return true;
//		else return false;
	
	public boolean equals(Object obj) {
		Rect P = (Rect)obj;
		if (width*height == P.width*P.height) {
			return true;
		}
			else { 
				return false;
			}
	}		
}