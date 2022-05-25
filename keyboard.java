import java.io.*;

class getNum{
	public static void key(){
		
	}
}

class keyboard{
	public static void main(String[] args) throws IOException{
		System.out.println("Put 2 nummber to get sum!");
		BufferedReader keyB = new BufferedReader(new InputStreamReader(System.in));
		
		String str = keyB.readLine();
		String str1 = keyB.readLine();
		
		int num = Integer.parseInt(str);
		int num1 = Integer.parseInt(str1);
//		double doub = Double.parseDouble(str);
		
		System.out.println("Sum\t" + (num + num1) );
	}
}