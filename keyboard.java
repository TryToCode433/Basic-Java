import java.io.*;

class getNum{
	void key(){
		
	}
}

class keyboard{
	public static void main(String[] args) throws IOException{
		System.out.println("put a nummber");
		BufferedReader keyB = new BufferedReader(new InputStreamReader(System.in));
		
		String str = keyB.readLine();
		
		int num = Integer.parseInt(str);
//		double doub = Double.parseDouble(str);
		
		System.out.println("Putted\t" + num );
	}
}