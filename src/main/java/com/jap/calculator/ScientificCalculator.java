package com.jap.calculator;

public class ScientificCalculator {

	public double cielOfANumber(float num) throws CalculatorException {
		//check if num is equal to or less than 0 than throw the userdefined exception with proper message

		if (num <= 0){
			throw new CalculatorException("number should not be equal or less than zero");
	}else{
		num =  num;

		//or else call ceil method of Math class and return the value


	}
	return num;
}
	
	public double floorOfANumber(float num) throws CalculatorException
	{
		//check if num is equal to or less than 0 than throw the userdefined exception with proper message
		if(num<=0){
			throw new CalculatorException("num should not be equal or less than zero");
		}else{
			num = num;
		}
		//or else call floor method of Math class and return the value
		return num;
	}
	
    public long power(int num1, int num2) throws CalculatorException {
		//if num1 is less than num2 than throw the userdefined exception with proper message
		long power = 0;
		if(num1<num2){
			throw new CalculatorException("num1 should not be less than num2");
		}else{
			power = (long)Math.pow(num1,num2);
		}
		//else use Math pow method and return the value


		return power;
    }
    
    public double squareRoot(int num) throws CalculatorException
    {
		double squareRoot = 0;
		//check if num is equal to or less than 0 than throw the userdefined exception with proper message
		if(num <= 0){
			throw new CalculatorException("num should not be less than or equal to zero");
		}else{
			squareRoot = Math.sqrt(num);

		}
			//or else call sqrt method of Math class and return the value

		return squareRoot;
    }

	public static void main(String[] args) {
		ScientificCalculator scientificCalculator = new ScientificCalculator();
		try {
			System.out.println("ciel of a number = " +scientificCalculator.cielOfANumber(10));
		} catch (CalculatorException e) {
			throw new RuntimeException(e);
		}
		//Call all the methods one by one and surround them by try and respective catch blocks.
		try{
			System.out.println("floor of a number = " + scientificCalculator.floorOfANumber(30));
		}catch (CalculatorException e){
			System.out.println(e);
			e.printStackTrace();
		}
		try{
			System.out.println("square of a number = " + scientificCalculator.power(5,2));
		}catch (CalculatorException e){
			System.out.println(e);
			e.printStackTrace();
		}
		try{
			System.out.println("square root of a number = " + scientificCalculator.squareRoot(25));
		}catch (CalculatorException e){
			System.out.println(e);
			e.printStackTrace();
		}
		MathematicalCalculator obj1 = new MathematicalCalculator();
		System.out.println("add = " + obj1.add(2,3));
		System.out.println("substract = " + obj1.subtract(5,2));
		System.out.println("division = " + obj1.divide(25,5));
		System.out.println("modulo = " + obj1.modulo(25,5));

	}
}
