package com.oracle.shop;

import java.util.Scanner;

public class shop {
	static String adminname = "admin";
	static String adminpsd = "123";
	static int a = 0;
	static int b = 0;
	static int c = 0;
	static int d = 0;
	static int e = 0;
	static int f = 0;
	static int g = 0;
	static int h = 0;
	static String[] shopmz = new String[1000];// ������Ʒ��������
	static int[] shopbh = new int[1000];// ������Ʒ�������
	static int[] shopjg = new int[1000];// ������Ʒ�۸�����
	static int[] shopsl = new int[1000];// ������Ʒ��������
	static String[] shopcd = new String[1000];// ������Ʒ��������

	static String[] usermz = new String[1000];// �����û���Ϣ����
	static String[] userbh = new String[1000];// �����û���Ϣ����
	static String[] userjg = new String[1000];// �����û���Ϣ����
	static String[] usersl = new String[1000];// �����û���Ϣ����

	public static void main(String[] args) {
		// boolean flag = false;
		login();
	}

	public static void login() {
		// boolean flag=false;
		Scanner sc = new Scanner(System.in);
		System.out.println("���������Ա�˺�:");
		String input = sc.next();
		System.out.println("���������Ա����:");
		String input2 = sc.next();
		if (input.equals(adminname) && input2.equals(adminpsd)) {
			System.out.println("��ϲ����½�ɹ���");
			// flag=true;
			menu();
		} else {
			System.out.println("�˺Ż��������");
		}
	}

	public static void menu() {
		System.out.println("��ѡ����:");
		System.out.println("1.��Ʒ����");
		System.out.println("2.�û�����");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		switch (num) {
		case 1:
			shop();
			break;
		case 2:
			user();
			break;
		}
	}

	public static void shop() { // ��Ʒ�������
		System.out.println("**************************");
		System.out.println("��ѡ����:");
		System.out.println("1.�����Ʒ");
		System.out.println("2.ɾ����Ʒ");
		System.out.println("3.�޸���Ʒ");
		System.out.println("4.�鿴��Ʒ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		switch (num) {
		case 1:
			addshop();
			break;
		case 2:
			delshop();
			break;
		case 3:
			modshop();
			break;
		case 4:
			broshop();
			break;
		}

	}

	public static void addshop() { // �����Ʒ
		System.out.println("������������Ϣ��");
		System.out.println("1.��Ʒ����     2.��Ʒ���    3.��Ʒ�۸�    4.��Ʒ����     ");
		System.out.println("1.��Ʒ���ƣ�");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		shopmz[a] = name;
		a++;
		System.out.println("2.��Ʒ��ţ�");
		String bh = sc.next();
		shopbh[b] = bh;
		b++;
		System.out.println("3.��Ʒ�۸�");
		String jg = sc.next();
		shopjg[c] = jg;
		c++;
		System.out.println("4.��Ʒ������");
		String sl = sc.next();
		shopsl[d] = sl;
		d++;
		System.out.println("����ɹ��������Ƿ񷵻�? ȷ���밴y��  ���������밴n");
		String pd = sc.next();
		boolean flag = true;
		while (flag == true) {
			if (pd.equals("y")) {
				shop();
				flag = false;
			} else if (pd.equals("n")) {
				addshop();
				flag = false;
			} else {
				System.out.println("�������,����������");
				pd = sc.next();
				continue;
			}
		}
	}

	public static void delshop() { // ɾ����Ʒ
		System.out.println("������ѡ��ɾ����Ʒ�����ƻ�����Ʒ���!");
		System.out.println("ѡ����Ʒ�����밴y��ѡ����Ʒ����밴n");
		Scanner sc = new Scanner(System.in);
		String pd = sc.next();
		boolean flag = true;
		boolean flag2 = true;
		boolean flag3 = true;
		boolean flag4 = true;
		while (flag == true) {
			if (pd.equals("y")) {
				System.out.println("��������Ҫɾ������Ʒ���ƣ�");
				String name = sc.next();
				for (int i = 0; i < shopmz.length; i++) {
					while (flag2 == true) {
						if (name.equals(shopmz[i])) {
							System.out.println("��Ҫɾ������Ʒ��ϢΪ��");
							System.out.println("��Ʒ����:" + shopmz[i] + "��Ʒ���:"
									+ shopbh[i] + "��Ʒ�۸�:" + shopjg[i] + "��Ʒ����:"
									+ shopsl[i]);
							System.out.println("��ȷ���Ƿ�ɾ����ȷ���밴y ȡ���������밴n");
							String pd2 = sc.next();
							while (flag3 == true) {
								if (pd2.equals("y")) {
									shopmz[i] = null;
									shopbh[i] = null;
									shopjg[i] = null;
									shopsl[i] = null;
									System.out.println("��Ʒ��ɾ��������ɾ���밴y�������밴n");
									String pd3 = sc.next();
									while (flag4 = true) {
										if (pd3.equals("y")) {
											delshop();
											flag4 = false;
										} else if (pd3.equals("n")) {
											shop();
											flag4 = false;
										} else {
											System.out.println("�������,����������");
											pd3 = sc.next();
											continue;
										}
									}
								} else if (pd2.equals("n")) {
									shop();
									flag3 = false;
								} else {
									System.out.println("�������,����������");
									pd2 = sc.next();
									continue;
								}
							}
						} else {
							System.out.println("�������,����������");
							pd = sc.next();
							continue;
						}
					}
				}
			} else if (pd.equals("n")) {
				System.out.println("��������Ҫɾ������Ʒ��ţ�");
				String name2 = sc.next();
				for (int i = 0; i < shopbh.length; i++) {
					while (flag2 == true) {
						if (name2.equals(shopbh[i])) {
							System.out.println("��Ҫɾ������Ʒ��ϢΪ��");
							System.out.println("��Ʒ����:" + shopmz[i] + "��Ʒ���:"
									+ shopbh[i] + "��Ʒ�۸�:" + shopjg[i] + "��Ʒ����:"
									+ shopsl[i]);
							System.out.println("��ȷ���Ƿ�ɾ����ȷ���밴y ȡ���������밴n");
							String pd2 = sc.next();
							while (flag3 == true) {
								if (pd2.equals("y")) {
									shopmz[i] = null;
									shopbh[i] = null;
									shopjg[i] = null;
									shopsl[i] = null;
									System.out.println("��Ʒ��ɾ��������ɾ���밴y�������밴n");
									String pd3 = sc.next();
									while (flag4 = true) {
										if (pd3.equals("y")) {
											delshop();
											flag4 = false;
										} else if (pd3.equals("n")) {
											shop();
											flag4 = false;
										} else {
											System.out.println("�������,����������");
											pd3 = sc.next();
											continue;
										}
									}
								} else if (pd2.equals("n")) {
									shop();
									flag3 = false;
								} else {
									System.out.println("�������,����������");
									pd2 = sc.next();
									continue;
								}
							}
						} else {
							System.out.println("�������,����������");
							pd = sc.next();
							continue;
						}
					}
				}
			}

			else {
				System.out.println("�������,����������");
				pd = sc.next();
				continue;
			}
		}
	}

	public static void modshop() { // �޸���Ʒ
		System.out.println("123");
	}

	public static void broshop() { // �鿴��Ʒ
		System.out.println("123");
	}

	public static void user() { // �û��������
		System.out.println("**************************");
		System.out.println("��ѡ����:");
		System.out.println("1.����û�");
		System.out.println("2.ɾ���û�");
		System.out.println("3.�޸��û�");
		System.out.println("4.�鿴�û�");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		switch (num) {
		case 1:
			adduser();
			break;
		case 2:
			deluser();
			break;
		case 3:
			moduser();
			break;
		case 4:
			brouser();
			break;
		}
	}

	public static void adduser() {
		System.out.println("123");
	}

	public static void deluser() {
		System.out.println("123");
	}

	public static void moduser() {
		System.out.println("123");
	}

	public static void brouser() {
		System.out.println("123");
	}

}
