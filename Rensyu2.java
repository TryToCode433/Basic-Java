/***********
@File:  	/Rensyu2.java
@Author: 21TE433 HoangTrongVu
- check whether input number is even-odd. 
************/

import java.io.*;

class Rensyu2 {
	public static void main(String[] args) throws IOException {
		System.out.println("整数を入力してください。");
		
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		
		String str = buff.readLine();
		int num = Integer.parseInt(str);
		
		if (num%2 == 0){
			System.out.println(str + "は偶数です。");
		} else {
			System.out.println(str + "は奇数です。");
		}
	}
}