package com;

public class MathTest01 {

	public static void main(String[] args) {

		double d1 = 2.1;
		double d2 = 2.6;
		System.out.println("�üƨ��X (0��100) = " + (int) (Math.random() * 100));

		System.out.println("�L����i�� d1 = " + Math.ceil(d1));
		System.out.println("�L����˥h d2 = " + Math.floor(d2));
		System.out.println("�|�ˤ��J d1 = " + Math.round(d1));
		System.out.println("�|�ˤ��J d2 = " + Math.round(d2));
		System.out.println("2 ��10���� = " + Math.pow(2, 10));
		System.out.println("4 ������� = " + Math.sqrt(4));

	}

}
