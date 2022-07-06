/***********
@File:  	/SumEven.java
@Author: 21TE433 HoangTrongVu
- take sum of even number from 1 to 100
************/

class SumEven {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			/* if ( i % 2 == 0 ) {
				sum += i;
			} */
			sum += (i % 2 == 0 ) ? i : 0;
		}
		System.out.println("1`‚P‚O‚O‚Ì‹ô”‡Œv‚ÍF" + sum);
	}
}