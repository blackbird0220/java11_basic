package org.kh.app;
//조건문 if~else~ : if(조건식) {조건이 참일 때의 실행문;} else {조건이 거짓일 때의 조건문}
public class Condition2 {
	public static void main(String[] args) {
		char sel = '1';
		//성별코드(sel)가 1이거나 3이면, 성별이 "남성", 아니면 "여성"
		String gender;
		if(sel=='1' || sel=='3') {
			gender = "남성";
		} else {
			gender = "여성";
		}
		/*
		 if(sel=='1' || sel=='3') {
			gender = "남성";
		} else {
			gender = "여성";} 
		 */
		System.out.printf("%s",gender);
	}
	
}

