package com.Byun.equalsEx;

public class WrapperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(Character.toLowerCase('A'));
		
		char ch1 = '4';
		char ch2 = 'f';
	
	if(Character.isDigit(ch1)) {//���� TRUE FAULSE
		System.out.println("�����Դϴ�.");
	}
    if(Character.isAlphabetic(ch2)){//���Ĺ� TRUE FAULSE
		System.out.println("���ē� �Դϴ�.");
		
	}
    
    System.out.println(Integer.parseInt("-1234"));//���ڷ� �о����
   	
	
    System.out.println(Integer.toHexString(124));
	}		
}
