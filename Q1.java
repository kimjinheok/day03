package day03;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		

//		Scanner input = new Scanner(System.in);
//		int num;
//		System.out.println("수 입력");
//		num = input.nextInt();
//		if(num > 100) {
//			System.out.println("100보다 크다");
//		}else if(num > 70) {
//			System.out.println("70보다 크다");
//		}else if(num > 40) {
//			System.out.println("40보다 크다");
//		}else{
//			System.out.println("그 외의 값");
//		}
		// 점수를 입력받아 학점을 부여하시오
				// 90점 이상이면 A
				// 80점 이상 90점 미만이면 B
				// 70점 이상 80점 미만이면 C
				// 60점 이상 70점 미만이면 D
				// 60점 미만이면 F
//		Scanner input = new Scanner(System.in);
//		int num;
//		System.out.println("점수 입력");
//		num = input.nextInt();
//		if(num > 90) {
//			System.out.println('A');
//		}else if(num >= 80) {
//			System.out.println('B');
//		}else if(num >= 70) {
//			System.out.println('C');
//		}else if(num >= 60) {
//			System.out.println('D');
//		}else  {
//			System.out.println('F');
//		}
		//키가 110cm 이상일 시 놀이기구 탑승가능
		//키가 110cm 미만일 시 보호자가 옆에 있어야 탑승가능
		//키가 110cm미만일 경우 있는지 여부 출력
		//보호자가 없을시 보호자동반시 탑승가능 문구 출력
		
		Scanner input = new Scanner(System.in);
		int num; 
		System.out.println("당신의 키는 몇 cm입니까?");
		num = input.nextInt();
		if(num > 110) {
		System.out.println("110cm 이상입니다 탑승가능합니다");
		}else if(num < 110) {
		System.out.println("110cm 미만입니다 보호자와 함께 탑승하십시오");
		System.out.println("보호자가 있습니까? 1:예 2:아니오");
		num = input.nextInt();
		if(num == 1) {
			System.out.println("탑승 가능합니다");
			num = input.nextInt();
		}else if(num == 2) {
			System.out.println("탑승 불가능합니다 보호자랑 함께오세요");
		}else {
			System.out.println("다시 입력해주세요");
			}
		}
	}
}
