/* package whatever; // don't place package name! */
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Checknum
{
	public static void main (String[] args)
	{
		int count = 0;
		int[] a = null;
		int i;
		
		for(i = 0; i <= 50; i++){
			if (i % 2 == 0) {
				a[i] = i;
				count ++;
			}
		}
	System.out.println("Length:"+count+" "+a.length);
		// for (i=0; i<count; i++){
		// 	System.out.print(" "+ arr[i]);
		// }
		
	}
}