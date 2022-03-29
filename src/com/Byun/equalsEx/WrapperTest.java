package com.Byun.equalsEx;

public class WrapperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(Character.toLowerCase('A'));
		
		char ch1 = '4';
		char ch2 = 'f';
	
	if(Character.isDigit(ch1)) {//숫자 TRUE FAULSE
		System.out.println("숫자입니다.");
	}
    if(Character.isAlphabetic(ch2)){//알파뱉 TRUE FAULSE
		System.out.println("알파벹 입니다.");
		
	}
    
    System.out.println(Integer.parseInt("-1234"));//숫자로 읽어오기
   	
	
    System.out.println(Integer.toHexString(124));
	}		
}
