/***********
@File:  	/Rensyu5.java
@Author: 21TE433 HoangTrongVu
- Get in put from 1 to 5 and sendback a message.
************/
import java.io.*;

class Rensyu5 {
	public static void main(String[] args) throws IOException {
		System.out.println("成績を入力してください。");
		
		BufferedReader Buff = new BufferedReader(new InputStreamReader(System.in));	
		
		String str = Buff.readLine();
		// int step = Integer.parseInt(str);
		char chr = str.charAt(0);
		
		switch (chr) {
			case '1':
				System.out.println("もっとがんばりましょう。");
				break;
			case '2':
				System.out.println("もう少しがんばりましょう。");
				break;
			case '3':
				System.out.println("さらに上をめざしましょう。");
				break;
			case '4':
				System.out.println("たいへんよくできました。");
				break;
			case '5':
				System.out.println("たいへん優秀です。");
				break;
			default:
				System.out.println("成績は1から5までの5段階の成績を入力してください。");
				break;
		}
	}
}