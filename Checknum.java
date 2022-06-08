/***********
@File:  	Checknum.java
@Author:  HoangTrongVu
-Tim so chia het cho 2 trong khoang [1..50]
-include vao mang arr
-in ra man hinh mang a
************/

class Checknum {
	public static void main (String[] args) {
		int count = 0;
		int[] arr = new int[50/2+1];

		for (int i = 0; i <= 50; i++) {
			if (i % 2 == 0) arr[count++] = i;
		}

	    System.out.print("Co :"+count+"\t so chia het cho 2 [");

		for (int i: arr) {
			if (!(i == 0)) System.out.print(i + " ");
		}
        System.out.println("]");
		
	}
}