package com.oracle.shop;

import java.util.Scanner;

public class shop {
	static String adminname = "admin";
	static String adminpsd = "123";
	static int err = 0; // �������
	static int err2 = 3 - err;// ��ʣ�µĴ������

	static int a = 0;// ������Ʒ����
	static int b = 0;// ������Ʒ���
	static int c = 0;// ������Ʒ�۸�
	static int d = 0;// ������Ʒ����
	static int e = 0;// ������Ʒ����
	static int f = 0;
	static int g = 0;
	static int h = 0;
	static String[] shopmz = new String[1000];// ������Ʒ��������
	static int[] shopbh = new int[1000]; // ������Ʒ�������
	static int[] shopjg = new int[1000]; // ������Ʒ�۸�����
	static int[] shopsl = new int[1000]; // ������Ʒ��������
	static String[] shopgs = new String[1000];// ������Ʒ��˾����

	static String[] usermz = new String[1000];// �����û���Ϣ����
	static String[] userbh = new String[1000];// �����û���Ϣ����
	static String[] userjg = new String[1000];// �����û���Ϣ����
	static String[] usersl = new String[1000];// �����û���Ϣ����

	public static void main(String[] args) {
		showMenu();
	}

	public static void showMenu() { // ������
		System.out.println("******************************");
		System.out.println("*****��ӭʹ�þ��Ǻ��Ƴ��й���ϵͳ*****");
		System.out.println("******************************");
		System.out.println("��ѡ����: 1.��½   2.�˳�ϵͳ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		while (true) {
			if (num == 1) {
				login();
				break;
			} else if (num == 2) {
				System.exit(0);
			} else {
				System.err.println("�����������������");
				num = sc.nextInt();

			}
		}
	}

	public static void login() { // ��½����
		while (err < 3) {
			Scanner sc = new Scanner(System.in);
			System.out.println("���������Ա�˺�:");
			String input = sc.next();
			System.out.println("���������Ա����:");
			String input2 = sc.next();

			if (input.equals(adminname) && input2.equals(adminpsd)) {
				System.out.println("��ϲ����½�ɹ���");
				err = 3;
				// flag=true;
				menu();
			} else { // �ж�����������������γ����˳�����
				err++;
				err2 = 3 - err;
				System.err.println("�˺Ż������������3����������˳�����");
				System.out.println("��ע�⣡��ǰ��ʣ" + err2 + "�λ��ᣡ");
				while (err < 3) {
					System.out.println("���������밴1��������һ���밴2���˳������밴3");
					int input3 = sc.nextInt();
					if (input3 == 1) {
						login();
					} else if (input3 == 2) {
						showMenu();
					} else if (input3 == 3) {
						System.exit(0);
					} else {
						System.err.println("�����������������");
						input3 = sc.nextInt();
					}
				}

			}
		}

	}

	public static void menu() { // �˵�
		System.out.println("��ѡ����:");
		System.out.println("1.��Ʒ����");
		System.out.println("2.�û�����");
		System.out.println("3.�˳�ϵͳ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		switch (num) {
		case 1:
			shop();
			break;
		case 2:
			user();
			break;
		case 3:
			System.exit(0);
			break;
		default:
			System.err.println("����������������룬���������һ���밴4���˳������밴5");
			int pd = sc.nextInt();
			boolean flag = true;
			while (flag == true) {
				if (pd == 1) {
					shop();
					break;
				} else if (pd == 2) {
					user();
					break;
				} else if (pd == 3) {
					System.exit(0);
					break;
				} else if (pd == 4) {
					menu();
					break;
				} else if (pd == 5) {
					System.exit(0);
					break;
				} else {
					System.err.println("�������,���������룬����뷵����һ���밴3���˳������밴4");
					pd = sc.nextInt();
					if (pd == 3) {
						menu();
						break;
					} else if (pd == 4) {
						System.exit(0);
						break;
					}
					continue;
				}
			}
		}
	}

	public static void shop() { // ��Ʒ�������
		System.out.println("**************************");
		System.out.println("*******��ѡ����:***********");
		System.out.println("       1.�����Ʒ");
		System.out.println("       2.ɾ����Ʒ");
		System.out.println("       3.�޸���Ʒ");
		System.out.println("       4.�鿴��Ʒ");
		System.out.println("       5.�����ϲ�");
		System.out.println("       6.�˳�ϵͳ");
		System.out.println("**************************");
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
		case 5:
			menu();
			break;
		case 6:
			System.exit(0);
			break;
		default:
			System.err.println("����������������룬���������һ���밴7���˳������밴8");
			int pd = sc.nextInt();
			boolean flag = true;
			while (flag == true) {
				if (pd == 1) {
					addshop();
					break;
				} else if (pd == 2) {
					delshop();
					break;
				} else if (pd == 3) {
					modshop();
					break;
				} else if (pd == 4) {
					broshop();
					break;
				} else if (pd == 7) {
					menu();
					break;
				} else if (pd == 8) {
					System.exit(0);
					break;
				} else {
					System.err.println("�������,���������룬����뷵����һ���밴7���˳������밴8");
					pd = sc.nextInt();
					if (pd == 7) {
						menu();
						break;
					} else if (pd == 8) {
						System.exit(0);
						break;
					}
					continue;
				}
			}

		}

	}

	public static void addshop() { // �����Ʒ
		System.out.println("������������Ϣ��");
		System.out.println("1.��Ʒ����     2.��Ʒ���    3.��Ʒ�۸�    4.��Ʒ����    5.��Ʒ���� ");
		System.out.println("1.��Ʒ���ƣ�");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		shopmz[a] = name;
		a++;
		System.out.println("2.��Ʒ��ţ�");
		int bh = sc.nextInt();
		shopbh[b] = bh;
		b++;
		System.out.println("3.��Ʒ�۸�");
		int jg = sc.nextInt();
		shopjg[c] = jg;
		c++;
		System.out.println("4.��Ʒ������");
		int sl = sc.nextInt();
		shopsl[d] = sl;
		d++;
		System.out.println("5.��Ʒ��˾��");
		String gs = sc.next();
		shopgs[e] = gs;
		e++;
		System.out.println("����ɹ��������Ƿ񷵻�? ");
		System.out.println("ȷ�������밴1��  ���������밴2, �˳������밴3");
		int pd = sc.nextInt();
		boolean flag = true;
		while (flag == true) {
			if (pd == 1) {
				shop();
				flag = false;
			} else if (pd == 2) {
				addshop();
				flag = false;
			} else if (pd == 3) {
				System.exit(0);
				flag = false;
			} else {
				System.err.println("�������,�������룬����뷵����һ���밴6���˳������밴7");
				pd = sc.nextInt();
				if (pd == 6) {
					shop();
					break;
				} else if (pd == 7) {
					System.exit(0);
					break;
				}
				continue;
			}
		}
	}

	public static void delshop() { // ɾ����Ʒ
		System.out.println("������ѡ��ɾ����Ʒ�����ƻ�����Ʒ���!");
		System.out.println("ѡ����Ʒ�����밴1��ѡ����Ʒ����밴2,�����밴3���˳������밴4");
		Scanner sc = new Scanner(System.in);
		int pd = sc.nextInt();
		boolean flag = true;
		boolean flag2 = true;
		boolean flag3 = true;
		boolean flag4 = true;
		while (flag == true) {
			if (pd == 1) {
				System.out.println("��������Ҫɾ������Ʒ���ƣ�");
				String name = sc.next();
				for (int i = 0; i < shopmz.length; i++) {
					while (flag2 == true) {
						if (name.equals(shopmz[i])) {
							System.out.println("��Ҫɾ������Ʒ��ϢΪ��");
							System.out.println("��Ʒ����:" + shopmz[i] + " " + "��Ʒ���:" + shopbh[i] + " " + "��Ʒ�۸�:"
									+ shopjg[i] + " " + "��Ʒ����:" + shopsl[i] + " " + "��Ʒ��˾:" + shopgs[i]);
							System.out.println("��ȷ���Ƿ�ɾ����ȷ���밴y ȡ���������밴n");
							String pd2 = sc.next();
							while (flag3 == true) {
								if (pd2.equals("y")) {
									shopmz[i] = null;
									shopbh[i] = 0;
									shopjg[i] = 0;
									shopsl[i] = 0;
									shopgs[i] = null;
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
											System.err.println("�������,����������");
											pd3 = sc.next();
											continue;
										}
									}
								} else if (pd2.equals("n")) {
									shop();
									flag3 = false;
								} else {
									System.err.println("�������,����������");
									pd2 = sc.next();
									continue;
								}
							}
						} else {
							System.err.println("�������,���������룬����뷵����һ���밴8���˳������밴9");
							pd = sc.nextInt();
							if (pd == 8) {
								shop();
								break;
							} else if (pd == 9) {
								System.exit(0);
								break;
							}
							continue;
						}
					}
				}
			} else if (pd == 2) {
				System.out.println("��������Ҫɾ������Ʒ��ţ�");
				int name2 = sc.nextInt();
				for (int i = 0; i < shopbh.length; i++) {
					while (flag2 == true) {
						if (name2 == shopbh[i]) {
							System.out.println("��Ҫɾ������Ʒ��ϢΪ��");
							System.out.println("��Ʒ����:" + shopmz[i] + " " + "��Ʒ���:" + shopbh[i] + " " + "��Ʒ�۸�:"
									+ shopjg[i] + " " + "��Ʒ����:" + shopsl[i] + " " + "��Ʒ��˾:" + shopgs[i]);
							System.out.println("��ȷ���Ƿ�ɾ����ȷ���밴y ȡ���������밴n");
							String pd2 = sc.next();
							while (flag3 == true) {
								if (pd2.equals("y")) {
									shopmz[i] = null;
									shopbh[i] = 0;
									shopjg[i] = 0;
									shopsl[i] = 0;
									shopgs[i] = null;
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
											System.err.println("�������,���������룬����뷵����һ���밴1���˳������밴2");
											int pd4 = sc.nextInt();
											if (pd4 == 1) {
												shop();
												break;
											} else if (pd4 == 2) {
												System.exit(0);
												break;
											}
											continue;
										}
									}
								} else if (pd2.equals("n")) {
									shop();
									flag3 = false;
								} else {
									System.err.println("�������,���������룬����뷵����һ���밴1���˳������밴2");
									int pd4 = sc.nextInt();
									if (pd4 == 1) {
										shop();
										break;
									} else if (pd4 == 2) {
										System.exit(0);
										break;
									}
									continue;
								}
							}
						} else {
							pd = sc.nextInt();
							if (pd == 1) {
								shop();
								break;
							} else if (pd == 2) {
								System.exit(0);
								break;
							}
							continue;
						}
					}
				}
			} else if (pd == 3) {
				shop();
				break;
			} else if (pd == 4) {
				System.exit(0);
				break;
			}

			else {
				pd = sc.nextInt();
				if (pd == 1) {
					shop();
					break;
				} else if (pd == 2) {
					System.exit(0);
					break;
				}
				continue;
			}
		}
	}

	public static void modshop() { // �޸���Ʒ
		System.out.println("������ѡ���޸ĵ���Ʒ���ƻ�����Ʒ���!");
		System.out.println("ѡ����Ʒ�����밴1��ѡ����Ʒ����밴2,�����밴3���˳������밴4");
		Scanner sc = new Scanner(System.in);
		int pd = sc.nextInt();
		boolean flag = true;
		boolean flag2 = true;
		boolean flag3 = true;
		boolean flag4 = true;
		while (flag == true) {
			if (pd == 1) {
				System.out.println("��������Ҫ�޸ĵ���Ʒ���ƣ�");
				String name = sc.next();
				for (int i = 0; i < shopmz.length; i++) {
					while (flag2 == true) {
						if (name.equals(shopmz[i])) {
							System.out.println("��Ҫ�޸ĵ���Ʒ��ϢΪ��");
							System.out.println("��Ʒ����:" + shopmz[i] + " " + "��Ʒ���:" + shopbh[i] + " " + "��Ʒ�۸�:"
									+ shopjg[i] + " " + "��Ʒ����:" + shopsl[i] + " " + "��Ʒ��˾:" + shopgs[i]);
							System.out.println("��ѡ���޸Ĳ���:1.��Ʒ���ơ�2.��Ʒ��š�3.��Ʒ�۸�4.��Ʒ������5.��Ʒ��˾��6.������һ�㡢7.�˳�ϵͳ");
							int pd2 = sc.nextInt();
							while (flag3 == true) {

								if (pd2 == 1) {
									System.out.println("��������Ҫ�޸ĵ�����");
									String pd3 = sc.next();
									shopmz[i] = pd3;
									System.out.println("���ѳɹ�����Ϣ����Ϊ:" + shopmz[i]);
									System.out.println("���������밴1��������һ���밴2���˳�ϵͳ�밴3");
									while (flag4 = true) {
										int pd4 = sc.nextInt();
										if (pd4 == 1) {
											modshop();
											flag4 = false;
										} else if (pd4 == 2) {
											shop();
											flag4 = false;
										} else if (pd4 == 3) {
											System.exit(0);
											flag4 = false;
										} else {
											System.err.println("�������,���������룬����뷵����һ���밴1���˳������밴2");
											pd4 = sc.nextInt();
											if (pd4 == 1) {
												shop();
												break;
											} else if (pd4 == 2) {
												System.exit(0);
												break;
											}
											continue;
										}
									}
								}

								else if (pd2 == 2) {
									System.out.println("��������Ҫ�޸ĵ�����");
									int pd3 = sc.nextInt();
									shopbh[i] = pd3;
									System.out.println("���ѳɹ�����Ϣ����Ϊ:" + shopbh[i]);
									System.out.println("���������밴1��������һ���밴2���˳�ϵͳ�밴3");
									while (flag4 = true) {
										int pd4 = sc.nextInt();
										if (pd4 == 1) {
											modshop();
											flag4 = false;
										} else if (pd4 == 2) {
											shop();
											flag4 = false;
										} else if (pd4 == 3) {
											System.exit(0);
											flag4 = false;
										} else {
											System.err.println("�������,���������룬����뷵����һ���밴1���˳������밴2");
											pd4 = sc.nextInt();
											if (pd4 == 1) {
												shop();
												break;
											} else if (pd4 == 2) {
												System.exit(0);
												break;
											}
											continue;
										}
									}
								}

								else if (pd2 == 3) {
									System.out.println("��������Ҫ�޸ĵ�����");
									int pd3 = sc.nextInt();
									shopjg[i] = pd3;
									System.out.println("���ѳɹ�����Ϣ����Ϊ:" + shopjg[i]);
									System.out.println("���������밴1��������һ���밴2���˳�ϵͳ�밴3");
									while (flag4 = true) {
										int pd4 = sc.nextInt();
										if (pd4 == 1) {
											modshop();
											flag4 = false;
										} else if (pd4 == 2) {
											shop();
											flag4 = false;
										} else if (pd4 == 3) {
											System.exit(0);
											flag4 = false;
										} else {
											System.err.println("�������,���������룬����뷵����һ���밴1���˳������밴2");
											pd4 = sc.nextInt();
											if (pd4 == 1) {
												shop();
												break;
											} else if (pd4 == 2) {
												System.exit(0);
												break;
											}
											continue;
										}
									}
								}

								else if (pd2 == 4) {
									System.out.println("��������Ҫ�޸ĵ�����");
									int pd3 = sc.nextInt();
									shopsl[i] = pd3;
									System.out.println("���ѳɹ�����Ϣ����Ϊ:" + shopsl[i]);
									System.out.println("���������밴1��������һ���밴2���˳�ϵͳ�밴3");
									while (flag4 = true) {
										int pd4 = sc.nextInt();
										if (pd4 == 1) {
											modshop();
											flag4 = false;
										} else if (pd4 == 2) {
											shop();
											flag4 = false;
										} else if (pd4 == 3) {
											System.exit(0);
											flag4 = false;
										} else {
											System.err.println("�������,���������룬����뷵����һ���밴1���˳������밴2");
											pd4 = sc.nextInt();
											if (pd4 == 1) {
												shop();
												break;
											} else if (pd4 == 2) {
												System.exit(0);
												break;
											}
											continue;
										}
									}
								}

								else if (pd2 == 5) {
									System.out.println("��������Ҫ�޸ĵ�����");
									String pd3 = sc.next();
									shopgs[i] = pd3;
									System.out.println("���ѳɹ�����Ϣ����Ϊ:" + shopgs[i]);
									System.out.println("���������밴1��������һ���밴2���˳�ϵͳ�밴3");
									while (flag4 = true) {
										int pd4 = sc.nextInt();
										if (pd4 == 1) {
											modshop();
											flag4 = false;
										} else if (pd4 == 2) {
											shop();
											flag4 = false;
										} else if (pd4 == 3) {
											System.exit(0);
											flag4 = false;
										} else {
											System.err.println("�������,���������룬����뷵����һ���밴1���˳������밴2");
											pd4 = sc.nextInt();
											if (pd4 == 1) {
												shop();
												break;
											} else if (pd4 == 2) {
												System.exit(0);
												break;
											}
											continue;
										}
									}
								}

								else if (pd2 == 6) {
									shop();
									flag3 = false;
								}

								else if (pd2 == 7) {
									System.exit(0);
									flag3 = false;
								}

								else {
									System.err.println("�������,���������룬����뷵����һ���밴1���˳������밴2");
									pd2 = sc.nextInt();
									if (pd2 == 1) {
										shop();
										break;
									} else if (pd2 == 2) {
										System.exit(0);
										break;
									}
									continue;
								}
							}
						}

					}
				}
			} else if (pd == 2) {
				System.out.println("��������Ҫ�޸ĵ���Ʒ��ţ�");
				int name2 = sc.nextInt();
				for (int i1 = 0; i1 < shopbh.length; i1++) {
					while (flag2 == true) {
						if (name2 == shopbh[i1]) {
							System.out.println("��Ҫ�޸ĵ���Ʒ��ϢΪ��");
							System.out.println("��Ʒ����:" + shopmz[i1] + " " + "��Ʒ���:" + shopbh[i1] + " " + "��Ʒ�۸�:"
									+ shopjg[i1] + " " + "��Ʒ����:" + shopsl[i1] + " " + "��Ʒ��˾:" + shopgs[i1]);
							System.out.println("��ѡ���޸Ĳ���:1.��Ʒ���ơ�2.��Ʒ��š�3.��Ʒ�۸�4.��Ʒ������5.��Ʒ��˾��6.������һ�㡢7.�˳�ϵͳ");
							int pd2 = sc.nextInt();
							while (flag3 == true) {
								if (pd2 == 1) {
									System.out.println("��������Ҫ�޸ĵ�����");
									String pd3 = sc.next();
									shopmz[i1] = pd3;
									System.out.println("���ѳɹ�����Ϣ����Ϊ:" + shopmz[i1]);
									System.out.println("���������밴1��������һ���밴2���˳�ϵͳ�밴3");
									while (flag4 = true) {
										int pd4 = sc.nextInt();
										if (pd4 == 1) {
											modshop();
											flag4 = false;
										} else if (pd4 == 2) {
											shop();
											flag4 = false;
										} else if (pd4 == 3) {
											System.exit(0);
											flag4 = false;
										} else {
											System.err.println("�������,���������룬����뷵����һ���밴1���˳������밴2");
											pd4 = sc.nextInt();
											if (pd4 == 1) {
												shop();
												break;
											} else if (pd4 == 2) {
												System.exit(0);
												break;
											}
											continue;
										}
									}
								} else if (pd2 == 2) {
									System.out.println("��������Ҫ�޸ĵ�����");
									int pd3 = sc.nextInt();
									shopbh[i1] = pd3;
									System.out.println("���ѳɹ�����Ϣ����Ϊ:" + shopbh[i1]);
									System.out.println("���������밴1��������һ���밴2���˳�ϵͳ�밴3");
									while (flag4 = true) {
										int pd4 = sc.nextInt();
										if (pd4 == 1) {
											modshop();
											flag4 = false;
										} else if (pd4 == 2) {
											shop();
											flag4 = false;
										} else if (pd4 == 3) {
											System.exit(0);
											flag4 = false;
										} else {
											System.err.println("�������,���������룬����뷵����һ���밴1���˳������밴2");
											pd4 = sc.nextInt();
											if (pd4 == 1) {
												shop();
												break;
											} else if (pd4 == 2) {
												System.exit(0);
												break;
											}
											continue;
										}
									}
								} else if (pd2 == 3) {
									System.out.println("��������Ҫ�޸ĵ�����");
									int pd3 = sc.nextInt();
									shopjg[i1] = pd3;
									System.out.println("���ѳɹ�����Ϣ����Ϊ:" + shopjg[i1]);
									System.out.println("���������밴1��������һ���밴2���˳�ϵͳ�밴3");
									while (flag4 = true) {
										int pd4 = sc.nextInt();
										if (pd4 == 1) {
											modshop();
											flag4 = false;
										} else if (pd4 == 2) {
											shop();
											flag4 = false;
										} else if (pd4 == 3) {
											System.exit(0);
											flag4 = false;
										} else {
											System.err.println("�������,���������룬����뷵����һ���밴1���˳������밴2");
											pd4 = sc.nextInt();
											if (pd4 == 1) {
												shop();
												break;
											} else if (pd4 == 2) {
												System.exit(0);
												break;
											}
											continue;
										}
									}
								} else if (pd2 == 4) {
									System.out.println("��������Ҫ�޸ĵ�����");
									int pd3 = sc.nextInt();
									shopsl[i1] = pd3;
									System.out.println("���ѳɹ�����Ϣ����Ϊ:" + shopsl[i1]);
									System.out.println("���������밴1��������һ���밴2���˳�ϵͳ�밴3");
									while (flag4 = true) {
										int pd4 = sc.nextInt();
										if (pd4 == 1) {
											modshop();
											flag4 = false;
										} else if (pd4 == 2) {
											shop();
											flag4 = false;
										} else if (pd4 == 3) {
											System.exit(0);
											flag4 = false;
										} else {
											System.err.println("�������,���������룬����뷵����һ���밴1���˳������밴2");
											pd4 = sc.nextInt();
											if (pd4 == 1) {
												shop();
												break;
											} else if (pd4 == 2) {
												System.exit(0);
												break;
											}
											continue;
										}
									}
								} else if (pd2 == 5) {
									System.out.println("��������Ҫ�޸ĵ�����");
									String pd3 = sc.next();
									shopgs[i1] = pd3;
									System.out.println("���ѳɹ�����Ϣ����Ϊ:" + shopgs[i1]);
									System.out.println("���������밴1��������һ���밴2���˳�ϵͳ�밴3");
									while (flag4 = true) {
										int pd4 = sc.nextInt();
										if (pd4 == 1) {
											modshop();
											flag4 = false;
										} else if (pd4 == 2) {
											shop();
											flag4 = false;
										} else if (pd4 == 3) {
											System.exit(0);
											flag4 = false;
										} else {
											System.err.println("�������,���������룬����뷵����һ���밴1���˳������밴2");
											pd4 = sc.nextInt();
											if (pd4 == 1) {
												shop();
												break;
											} else if (pd4 == 2) {
												System.exit(0);
												break;
											}
											continue;
										}
									}
								} else if (pd2 == 6) {
									shop();
									flag3 = false;
								} else if (pd2 == 7) {
									System.exit(0);
									flag3 = false;
								}

								else {
									System.err.println("�������,���������룬����뷵����һ���밴1���˳������밴2");
									pd2 = sc.nextInt();
									if (pd2 == 1) {
										shop();
										break;
									} else if (pd2 == 2) {
										System.exit(0);
										break;
									}
									continue;
								}

							}
						}
					}
				}
			} else if (pd == 3) {
				shop();
				break;
			} else if (pd == 4) {
				System.exit(0);
				break;
			}

			else {
				pd = sc.nextInt();
				if (pd == 1) {
					shop();
					break;
				} else if (pd == 2) {
					System.exit(0);
					break;
				} else {
					continue;
				}
			}
		}
	}

	public static void broshop() { // �鿴��Ʒ
		System.out.println("��ѡ����Ҫ�鿴�ķ�ʽ:");
		System.out.println("1.�鿴������Ʒ��Ϣ");
		System.out.println("2.���ȫ����Ʒ��Ϣ");
		System.out.println("3.���������Ʒ��Ϣ");
		System.out.println("4.������һ��");
		System.out.println("5.�˳�ϵͳ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		switch (num) {
		case 1:
			broone();
			break;
		case 2:
			broall();
			break;
		case 3:
			bropart();
			break;
		case 4:
			shop();
			break;
		case 5:
			System.exit(0);
			break;
		default:
			System.err.println("����������������롣���������һ���밴4���˳������밴5");
			int pd = sc.nextInt();
			boolean flag = true;
			while (flag == true) {
				if (pd == 1) {
					broone();
					break;
				} else if (pd == 2) {
					broall();
					break;
				} else if (pd == 3) {
					bropart();
					break;
				} else if (pd == 4) {
					shop();
					break;
				} else if (pd == 5) {
					System.exit(0);
					break;
				} else {
					System.err.println("�������,���������룬����뷵����һ���밴4���˳������밴5");
					pd = sc.nextInt();
					if (pd == 4) {
						shop();
						break;
					} else if (pd == 5) {
						System.exit(0);
						break;
					}
					continue;
				}
			}
		}
	}

	public static void broone() { // �鿴������Ʒ��Ϣ
		System.out.println("��ѡ����Ҫ��ѯ�ķ�ʽ:");
		System.out.println("1.��Ʒ���Ʋ�ѯ��2.��Ʒ��Ų�ѯ��3.������һ�㡢4.�˳�ϵͳ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int j = 0;
		boolean flag = true;
		while (flag == true) {
			if (num == 1) {
				System.out.println("��������Ҫ�鿴����Ʒ����:");
				String name = sc.next();
				for (int i = 0; i < shopmz.length; i++) {
					if (name.equals(shopmz[i])) {
						System.out.println("����Ʒ����ϢΪ:");
						System.out.println("��Ʒ����:" + shopmz[i] + "��Ʒ���:" + shopbh[i] + "��Ʒ�۸�:" + shopjg[i] + "��Ʒ����:"
								+ shopsl[i] + "��Ʒ��˾:" + shopgs[i]);
						j++;
					}
				}
				if (j != 0) {
					System.out.println("���з���������" + j + "����Ϣ�Ѿ����");
					System.out.println("����������ѯ�밴1��������һ���밴2���˳�ϵͳ�밴3");
					num = sc.nextInt();
					if (num == 1) {
						broone();
						break;
					} else if (num == 2) {
						broshop();
						break;
					} else if (num == 3) {
						System.exit(0);
						break;
					} else {
						System.err.println("�����������������");
						num = sc.nextInt();
					}
				}
				if (j == 0) {
					System.err.println("������Ϣ,��������������밴1��������һ���밴,2���˳������밴3");
					num = sc.nextInt();
					boolean flag2 = true;
					while (flag2 == true) {
						if (num == 1) {
							broone();
							break;
						} else if (num == 2) {
							broshop();
							break;
						} else if (num == 3) {
							System.exit(0);
							break;
						} else {
							System.err.println("�����������������");
							num = sc.nextInt();
						}
					}
				}

			} else if (num == 2) {
				System.out.println("��������Ҫ�鿴����Ʒ���:");
				int name = sc.nextInt();
				for (int i = 0; i < shopmz.length; i++) {
					if (name == shopbh[i]) {
						System.out.println("����Ʒ����ϢΪ:");
						System.out.println("��Ʒ����:" + shopmz[i] + "��Ʒ���:" + shopbh[i] + "��Ʒ�۸�:" + shopjg[i] + "��Ʒ����:"
								+ shopsl[i] + "��Ʒ��˾:" + shopgs[i]);
						j++;
					}
				}
				if (j != 0) {
					System.out.println("���з���������" + j + "����Ϣ�Ѿ����");
					System.out.println("����������ѯ�밴1��������һ���밴2���˳�ϵͳ�밴3");
					num = sc.nextInt();
					if (num == 1) {
						broone();
						break;
					} else if (num == 2) {
						broshop();
						break;
					} else if (num == 3) {
						System.exit(0);
						break;
					} else {
						System.err.println("�����������������");
						num = sc.nextInt();
					}
				}
				if (j == 0) {
					System.err.println("������Ϣ,��������������밴1��������һ���밴,2���˳������밴3");
					num = sc.nextInt();
					boolean flag2 = true;
					while (flag2 == true) {
						if (num == 1) {
							broone();
							break;
						} else if (num == 2) {
							broshop();
							break;
						} else if (num == 3) {
							System.exit(0);
							break;
						} else {
							System.err.println("�����������������");
							num = sc.nextInt();
						}
					}
				}

			} else if (num == 3) {
				broshop();
			} else if (num == 4) {
				System.exit(0);
			} else {
				System.err.println("�����������������");
				num = sc.nextInt();
			}
		}
	}

	public static void broall() { // ���ȫ����Ʒ��Ϣ
		int num = 0;
		System.out.println("���潫���������Ʒ��Ϣ����¼��˳��");
		for (int i = 0; i < a; i++) {
			if(shopmz[i]!=null) {
				System.out.println("��Ʒ����:" + shopmz[i] + "��Ʒ���:" + shopbh[i] + "��Ʒ�۸�:" + shopjg[i] + "��Ʒ����:" + shopsl[i]
						+ "��Ʒ��˾:" + shopgs[i]);
				num++;
			}
		}
		System.out.println("����" + num + "����Ϣ�Ѿ�ȫ�������");
		System.out.println("����뷵����һ�㣬�밴1��������˳������밴2");
		Scanner sc = new Scanner(System.in);
		int num2 = sc.nextInt();
		boolean flag = true;
		while (flag == true) {
			if (num2 == 1) {
				broshop();
				flag = false;
			} else if (num2 == 2) {
				System.exit(0);
				flag = false;
			} else {
				System.err.println("�����������������");
				num2 = sc.nextInt();
			}
		}
	}

	public static void bropart() { // ���������Ʒ��Ϣ
		System.out.println("������ѡ�����¹��ܣ�");
		System.out.println("1.���ռ۸�������ҡ�2.ģ�����ҡ�3.������һ�㡢4.�˳�ϵͳ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean flag = true;
		int jgmin = 0; // �۸�������Сֵ
		int jgmax = 0; // �۸�������Сֵ
		int scount = 0;// ������������Ϣ��
		int scount2 = 0;// ������������Ϣ��
		while (flag == true) {
			if (num == 1) { // ���ռ۸��������
				System.out.println("���������������ļ۸�������Сֵ��");
				num = sc.nextInt();
				jgmin = num;
				System.out.println("���������������ļ۸��������ֵ��");
				num = sc.nextInt();
				jgmax = num;
				for (int i = 0; i < shopjg.length; i++) {
					if (shopjg[i] >= jgmin && shopjg[i] <= jgmax) {
						System.out.println("��Ʒ����:" + shopmz[i] + "��Ʒ���:" + shopbh[i] + "��Ʒ�۸�:" + shopjg[i] + "��Ʒ����:"
								+ shopsl[i] + "��Ʒ��˾:" + shopgs[i]);
						scount++;
					}
				}
				System.out.println("����" + scount + "��������������Ϣ���Ѿ�ȫ����ʾ");
				System.out.println("����뷵����һ�㣬�밴1.������˳�ϵͳ���밴2");
				num = sc.nextInt();
				boolean flag2 = true;
				while (flag == true) {
					if (num == 1) {
						bropart();
						flag = false;
					} else if (num == 2) {
						System.exit(0);
						flag = false;
					} else {
						System.err.println("�����������������");
						num = sc.nextInt();
					}
				}
			} else if (num == 2) {// ģ������
				System.out.println("������������ҵ���Ʒ���ƵĹؼ���:");
				String keyword = sc.next();
				for (int i = 0; i < a; i++) {
					boolean result = shopmz[i].contains(keyword);
					if (result == true) {
						System.out.println("��Ʒ����:" + shopmz[i] + "��Ʒ���:" + shopbh[i] + "��Ʒ�۸�:" + shopjg[i] + "��Ʒ����:"
								+ shopsl[i] + "��Ʒ��˾:" + shopgs[i]);
						scount++;
					} else {
						continue;
					}
				}
				System.out.println("����" + scount + "��������������Ϣ���Ѿ�ȫ����ʾ");
				System.out.println("����뷵����һ�㣬�밴1.������˳�ϵͳ���밴2");
				num = sc.nextInt();
				boolean flag2 = true;
				while (flag == true) {
					if (num == 1) {
						bropart();
						flag = false;
					} else if (num == 2) {
						System.exit(0);
						flag = false;
					} else {
						System.err.println("�����������������");
						num = sc.nextInt();
					}
				}

			} else if (num == 3) {
				broshop();
				flag = false;
			} else if (num == 4) {
				System.exit(0);
				flag = false;
			} else {
				System.err.println("����������������룬����뷵����һ���밴5���˳�ϵͳ�밴6");
				num = sc.nextInt();
			}
		}

	}

	public static void user() { // �û��������
		System.out.println("**************************");
		System.out.println("��ѡ����:");
		System.out.println("1.����û�");
		System.out.println("2.ɾ���û�");
		System.out.println("3.�޸��û�");
		System.out.println("4.�鿴�û�");
		System.out.println("5.�˳�ϵͳ");
		System.out.println("**************************");
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
		case 5:
			System.exit(0);
			break;
		default:
			System.err.println("����������������һ���밴1���˳������밴2");
			int pd = sc.nextInt();
			if (pd == 1) {
				menu();
				break;
			} else if (pd == 2) {
				System.exit(0);
				break;
			}
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
