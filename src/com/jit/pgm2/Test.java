package com.jit.pgm2;

public class Test {

	public static void main(String[] args) {
		Beer b = Beer.RC;
		switch (b) {
		case KF:
			System.out.println("It is childrens brand");
			break;
		case KO:
			System.out.println("It is too light");
			break;
		case RC:
			System.out.println("It is not that much kick");
			break;
		case FC:
			System.out.println("Buy one get one free");
			break;
		default:
			System.out.println("Other branch are not recommended");
			break;
		}
	}

}
