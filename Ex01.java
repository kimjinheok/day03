package day03;

import java.util.Scanner;

public class Ex01 {
public static void main(String[] args) {
	int num = 10;
//	if(num%2 == 0) { //조건이 참이면 종속 문장 실행
//		System.out.println("짝수");
//	}else {//if 조건이 거짓이면 else 실행
//		System.out.println("홀수");	
//	}
//	System.out.println("다음 문장들 실행");
//	
	//수를 입력 받아 5의 배수인지 아닌지 구분
	
//	   Scanner input = new Scanner(System.in);
//	   System.out.println("수 입력");
//	   num = input.nextInt();
//	   if(num%5 == 0) {
//	      System.out.println("5의배수");
//	   }else {
//	      System.out.println("5의 배수 아님!!!");
//	   }
	   //수를 입력 받아 0보다 크고 100보다 작으면 정상,
	   //아니면 비정상으로 출력
//	   Scanner input = new Scanner(System.in);
//	   System.out.println("수 입력");
//	   num = input.nextInt();
//	   if(num>0 && num <100) {
//		   System.out.println("정상");
//	   }else {
//		   System.out.println("비정상");
//	   }
	   //수를 입력 받아 짝수이면서 3의 배수이면 출력, 아님
//	   Scanner input = new Scanner(System.in);
//	   System.out.println("수 입력");
//	   num = input.nextInt();
//	   if(num%2==0 && num%3 == 0) {//(num%6 == 0)
//		   System.out.println("출력");
//	   }else {
//		   System.out.println("아님");
//	   }
	 // 수를 입력 받아 짝수이면서 3의 배수이면 출력
	 // 3의 배수가 아니며, 짝수만 해당하면 짝수, 또는 홀수 
	 // 짝수가 아니며, 3의 배수에만 해당하면 3의 배수, 아님
	 // 해당 되지 않으면 해당 되지 않음
	 Scanner input = new Scanner(System.in);
	   System.out.println("수 입력");
	   num = input.nextInt();
	   if(num%6 == 0) {
		   System.out.println("짝수이면서 3의 배수");
	   }else {
		   if(num%3 == 0) {
			   System.out.println("3의배수");
		   }else {
			   if(num%2 == 0) {
				   System.out.println("짝수");
			   }else {			
				   System.out.println("벗어낫다");
			   }
		   }
	   }
	    
}
}