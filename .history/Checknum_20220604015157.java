

/* Name of the class has to be "Main" only if the class is public. */
class Checknum {
	public static void main (String[] args)
	{
		int count = 0;
		int[] arr = new int[50/2+1];
		
		for (int i = 0; i <= 50; i++) {
			if (i % 2 == 0) arr[count++] = i;
		}

	    System.out.print("Co :"+count+"\n so chia het cho 2 [");

		for (int i: arr) {
			if (!(i == 0)) System.out.print(i + " ");
		}
        System.out.println("]");
		
	}
}