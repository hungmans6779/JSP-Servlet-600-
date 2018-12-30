package com;

public class MathTest01 {

	public static void main(String[] args) {

		double d1 = 2.1;
		double d2 = 2.6;
		System.out.println("亂數取碼 (0～100) = " + (int) (Math.random() * 100));

		System.out.println("無條件進位 d1 = " + Math.ceil(d1));
		System.out.println("無條件捨去 d2 = " + Math.floor(d2));
		System.out.println("四捨五入 d1 = " + Math.round(d1));
		System.out.println("四捨五入 d2 = " + Math.round(d2));
		System.out.println("2 的10次方 = " + Math.pow(2, 10));
		System.out.println("4 的平方根 = " + Math.sqrt(4));

	}

}
