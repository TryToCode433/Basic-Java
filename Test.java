/***********
@File:  	/Test.java
@Author:  HoangTrongVu
-test environment
************/

class Test {
	public static void  main(String[] args) {
		// int num1 = 5, num2 = 4;
		
		int iNum = 2140;
		System.out.println("out iNum: " + iNum);
		
		double dNum = iNum;
		dNum += 132.568;
		System.out.println("out dNum: " + dNum);
		
		iNum = 0;
		int iNum = (int)dNum; //cast
		System.out.println("out iNum: " + iNum);
		
		// int a = 0, b = 0;
		// a = ++b;
		// System.out.println("out : "+a);
		
		// double t = 5 * 3.14;
		// double div = (double)num1 / num2;
		// System.out.println("5/4 = " + t + ".");
	}
}