package com.csi.exceptionconcept;

public class ExceptionHandlingConcept {

	public static void main(String[] args) {
		try {
			// System.exit(0);
			int result = 10 / 0;
			System.out.println(result);
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) {
			// e.printStackTrace();
			System.out.println(e);
		} catch (Exception e) {
			// TODO: handle exception
		} finally {

			System.out.println("Always execute");
		}
		isAgeValid(17);

	}

	public static void isAgeValid(int age)throws ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException {
		if (age < 18) {
			try {
				throw new InvalidAgeException("Invalid age");
			} catch (InvalidAgeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("Valid age");
		}
	}

}
