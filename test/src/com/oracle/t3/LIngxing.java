package com.oracle.t3;

import com.oraclesdp.common.SystemIn;

public class LIngxing {
	public static void main(String[] args) {
		System.out.println("��Ҫ������е����Σ�");
		int N=SystemIn.nextInt();//����һ��N�ŵ�����
		int i=0;//ѭ������
		int a=1;//��ǰ����
		int b=N-a;//ÿһ�еĿո���
		int l=2*a-1;//ÿһ�е�*������
		int M=b+l;//ÿһ���ܵ��ַ���
		for (;;) {
				if(i<b){
					System.out.print(" ");
					i++;
				}
				if(i>=b&&i<M){
					System.out.print("*");
					i++;
				}
				if(i>=M&&a<N){
				System.out.println();
				a++;
				b=N-a;
				l=2*a-1;
				M=b+l;
				i=0;
				}
				if(a>=N){
					b=a-N;//��ӡ������ʱ��ÿһ�еĿո���
					l=4*N-2*a-1;  //��ӡ������ʱ��ÿһ�е�*������
				}
				if(a>=N&&i<b){
					System.out.print(" ");
					i++;
				}
				if(a>=N&&i>=b&&i<M){
					System.out.print("*");
					i++;
				}
				if(a>=N&&i>=M){
					System.out.println();
					a++;
					b=a-N;
					l=4*N-2*a-1;
					M=b+l;
					i=0;
				}
				if(a>(2*N-1)){
					break;
				}
			
		}
	}
}
