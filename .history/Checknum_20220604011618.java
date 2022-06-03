

/* Name of the class has to be "Main" only if the class is public. */
class Checknum {
	public static void main (String[] args)
	{
		int count = 0;
		int[] arr = {0, 0, 0};
		
		for (int i = 0; i <= 50; i++) {
			if (i % 2 == 0) arr[count++] = i;
		}
	    System.out.println("Length:"+count+" ");
		// for (int i=0; i<count; i++){
		// 	System.out.print(" "+ arr[i]);
		// }
		
	}
}