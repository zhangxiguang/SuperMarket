package ShaiXuan;

import java.util.Arrays;
import java.util.Scanner;

public class ShaiXuan {
	public static void main(String[] args) {
		System.out.println("������һ�����֣�����0��ֹͣ����");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] number = new int[100];
		int[] number2 = new int[100];
		int[] number3 = new int[100];
		int scount = 0;
		int scount2 = 0;
		int scount3 = 0;
		while (num != 0) { // ��������
			number[scount] = num;
			scount++;
			num = sc.nextInt();
		}
		for (int i = 0; i < scount; i++) { // ��һ��ɸѡ��ѡ���������ε����ݣ�¼��ڶ�������
			for (int j = 0; j < scount; j++) {
				if (number[i] == number[j] && i != j) {
					number2[scount2] = number[i];
//					System.out.println(number2[scount2]);
					scount2++;
					number[i] = 0;
				}
			}
		}
		for (int i = 0; i < scount2; i++) {
//			System.out.println(number2[i]);
		}

		for (int i = 0; i < scount2; i++) { // �ڶ���ɸѡ���ٴ�ѡ���������ε����ݣ�¼�����������
			for (int j = 0; j < scount2; j++) {
				if (number2[i] == number2[j] && i != j && number2[i] != 0) {
					number3[scount3] = number2[i];
//					System.out.println(number3[scount3]);
					scount3++;
					number2[i] = 0;
//					System.out.println(number3[scount3-1]);
				}
			}
		}

		Arrays.sort(number3);
		for (int i = 0; i < number3.length; i++) {
			if (number3[i] != 0) {
				System.out.println(number3[i]);
			}
		}
	}
}
