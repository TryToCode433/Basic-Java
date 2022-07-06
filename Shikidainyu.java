/***********
@File:  	/Shikidainyu.java
@Author: 21TE433 HoangTrongVu
- with x from -10 to 10 get y = x^2 -2*x +1 
************/

class Shikidainyu {
	public static void main(String[] args) {
		System.out.println("-10`10‚ğ(y = x^2-2*x+1)‚É‘ã“ü‚·‚é‚Æ");
		int temp = 0;
		for (int x = -10; x <= 10; x++) {
			temp = x*x-2*x+1;
			System.out.println("x = "+ x + "\t y = " + temp);
		}
	}
}