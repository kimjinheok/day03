package day03;

import java.util.Scanner;

public class Ex01 {
public static void main(String[] args) {
	int num = 10;
//	if(num%2 == 0) { //������ ���̸� ���� ���� ����
//		System.out.println("¦��");
//	}else {//if ������ �����̸� else ����
//		System.out.println("Ȧ��");	
//	}
//	System.out.println("���� ����� ����");
//	
	//���� �Է� �޾� 5�� ������� �ƴ��� ����
	
//	   Scanner input = new Scanner(System.in);
//	   System.out.println("�� �Է�");
//	   num = input.nextInt();
//	   if(num%5 == 0) {
//	      System.out.println("5�ǹ��");
//	   }else {
//	      System.out.println("5�� ��� �ƴ�!!!");
//	   }
	   //���� �Է� �޾� 0���� ũ�� 100���� ������ ����,
	   //�ƴϸ� ���������� ���
//	   Scanner input = new Scanner(System.in);
//	   System.out.println("�� �Է�");
//	   num = input.nextInt();
//	   if(num>0 && num <100) {
//		   System.out.println("����");
//	   }else {
//		   System.out.println("������");
//	   }
	   //���� �Է� �޾� ¦���̸鼭 3�� ����̸� ���, �ƴ�
//	   Scanner input = new Scanner(System.in);
//	   System.out.println("�� �Է�");
//	   num = input.nextInt();
//	   if(num%2==0 && num%3 == 0) {//(num%6 == 0)
//		   System.out.println("���");
//	   }else {
//		   System.out.println("�ƴ�");
//	   }
	 // ���� �Է� �޾� ¦���̸鼭 3�� ����̸� ���
	 // 3�� ����� �ƴϸ�, ¦���� �ش��ϸ� ¦��, �Ǵ� Ȧ�� 
	 // ¦���� �ƴϸ�, 3�� ������� �ش��ϸ� 3�� ���, �ƴ�
	 // �ش� ���� ������ �ش� ���� ����
	 Scanner input = new Scanner(System.in);
	   System.out.println("�� �Է�");
	   num = input.nextInt();
	   if(num%6 == 0) {
		   System.out.println("¦���̸鼭 3�� ���");
	   }else {
		   if(num%3 == 0) {
			   System.out.println("3�ǹ��");
		   }else {
			   if(num%2 == 0) {
				   System.out.println("¦��");
			   }else {			
				   System.out.println("�����");
			   }
		   }
	   }
	    
}
}