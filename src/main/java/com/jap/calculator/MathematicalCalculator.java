package com.jap.calculator;

public class MathematicalCalculator {

	public int add(int num1, int num2) {
		int addition = 0;
		try {
			 addition = num1 + num2;
		}catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
		return addition;



	}

		public int subtract(int num1, int num2) {
			int sub = 0;
			try {
				sub = num1 - num2;


			}catch(Exception e) {
				System.out.println(e);
				e.printStackTrace();
			}
			return sub;
		}

		public int multiply ( int num1, int num2)
		{
			int mul = 0;
			try {
				mul = num1 * num2;
			}catch (Exception e) {
				System.out.println(e);
				e.printStackTrace();
			}
			return mul;
		}
		public int divide ( int num1, int num2)
		{
			//write the code and handle the ArithmeticException
			int div = 0;
			try {
				div = num1 / num2;
			}catch (Exception e) {
				System.out.println(e);
				e.printStackTrace();
			}
			return div;




		}
		public int modulo ( int num1, int num2)
		{
			int modulo = 0;
			try {
				modulo = num1 % num2;
			}catch (Exception e) {
				System.out.println(e);
				e.printStackTrace();
			}
			return modulo;
		}
	}

