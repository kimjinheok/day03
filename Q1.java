package day03;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		

//		Scanner input = new Scanner(System.in);
//		int num;
//		System.out.println("�� �Է�");
//		num = input.nextInt();
//		if(num > 100) {
//			System.out.println("100���� ũ��");
//		}else if(num > 70) {
//			System.out.println("70���� ũ��");
//		}else if(num > 40) {
//			System.out.println("40���� ũ��");
//		}else{
//			System.out.println("�� ���� ��");
//		}
		// ������ �Է¹޾� ������ �ο��Ͻÿ�
				// 90�� �̻��̸� A
				// 80�� �̻� 90�� �̸��̸� B
				// 70�� �̻� 80�� �̸��̸� C
				// 60�� �̻� 70�� �̸��̸� D
				// 60�� �̸��̸� F
//		Scanner input = new Scanner(System.in);
//		int num;
//		System.out.println("���� �Է�");
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
		//Ű�� 110cm �̻��� �� ���̱ⱸ ž�°���
		//Ű�� 110cm �̸��� �� ��ȣ�ڰ� ���� �־�� ž�°���
		//Ű�� 110cm�̸��� ��� �ִ��� ���� ���
		//��ȣ�ڰ� ������ ��ȣ�ڵ��ݽ� ž�°��� ���� ���
		
		Scanner input = new Scanner(System.in);
		int num; 
		System.out.println("����� Ű�� �� cm�Դϱ�?");
		num = input.nextInt();
		if(num > 110) {
		System.out.println("110cm �̻��Դϴ� ž�°����մϴ�");
		}else if(num < 110) {
		System.out.println("110cm �̸��Դϴ� ��ȣ�ڿ� �Բ� ž���Ͻʽÿ�");
		System.out.println("��ȣ�ڰ� �ֽ��ϱ�? 1:�� 2:�ƴϿ�");
		num = input.nextInt();
		if(num == 1) {
			System.out.println("ž�� �����մϴ�");
			num = input.nextInt();
		}else if(num == 2) {
			System.out.println("ž�� �Ұ����մϴ� ��ȣ�ڶ� �Բ�������");
		}else {
			System.out.println("�ٽ� �Է����ּ���");
			}
		}
	}
}
