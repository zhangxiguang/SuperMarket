package com.oracle.t3;

import com.oraclesdp.common.SystemIn;

public class Huiwen {

	public static void main(String[] args) {
		System.out.println("������һ�����֣�");
		int num=SystemIn.nextInt();
		String num2;
		num2=String.valueOf(num);
		int I=num2.length();
		
		//ż���ж��Ƿ��ǻ�����
		if(I%2==0){
			int i=I/2;
			String s1=num2.substring(0,i);
			String s2=num2.substring(i,I);
			StringBuffer s3=new StringBuffer(s2).reverse();//ȡ����
			String s4=s3.toString();//ת��ΪString
			if(s1.equals(s4)){
				System.out.println("��ϲ��������������ǻ�������");
			}
			else{
				System.out.println("���ź�������������ֲ��ǻ�������");
			}
			
		}
		//�����ж��Ƿ��ǻ�����
		else{
			int L=I+1;
			int i=L/2;
			String s1=num2.substring(0,i-1);
			String s2=num2.substring(i,I);
			StringBuffer s3=new StringBuffer(s2).reverse();
			String s4=s3.toString();
			if(s1.equals(s4)){
				System.out.println("��ϲ��������������ǻ�������");
			}
			else{
				System.out.println("���ź�������������ֲ��ǻ�������");
			}
		}
		
		
		
	}

}
