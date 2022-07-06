/***********
@File:  	/Rensyu2.java
@Author: 21TE433 HoangTrongVu
- check whether input number is even-odd. 
************/

import java.io.*;

class Rensyu2 {
	public static void main(String[] args) throws IOException {
		System.out.println("®”‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢B");
		
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		
		String str = buff.readLine();
		int num = Integer.parseInt(str);
		
		if (num%2 == 0){
			System.out.println(str + "‚Í‹ô”‚Å‚·B");
		} else {
			System.out.println(str + "‚ÍŠï”‚Å‚·B");
		}
	}
}