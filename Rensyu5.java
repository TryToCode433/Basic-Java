/***********
@File:  	/Rensyu5.java
@Author: 21TE433 HoangTrongVu
- Get in put from 1 to 5 and sendback a message.
************/
import java.io.*;

class Rensyu5 {
	public static void main(String[] args) throws IOException {
		System.out.println("���т���͂��Ă��������B");
		
		BufferedReader Buff = new BufferedReader(new InputStreamReader(System.in));	
		
		String str = Buff.readLine();
		// int step = Integer.parseInt(str);
		char chr = str.charAt(0);
		
		switch (chr) {
			case '1':
				System.out.println("�����Ƃ���΂�܂��傤�B");
				break;
			case '2':
				System.out.println("������������΂�܂��傤�B");
				break;
			case '3':
				System.out.println("����ɏ���߂����܂��傤�B");
				break;
			case '4':
				System.out.println("�����ւ�悭�ł��܂����B");
				break;
			case '5':
				System.out.println("�����ւ�D�G�ł��B");
				break;
			default:
				System.out.println("���т�1����5�܂ł�5�i�K�̐��т���͂��Ă��������B");
				break;
		}
	}
}