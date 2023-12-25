package assignment;
import java.util.Scanner;

public class StringAndArrays {

	public static void main(String[] args) {
		
		
		// Strings
		String str = "Atharva";
		
		int len = str.length();
		String lstr = str.toLowerCase();
		String ustr = str.toUpperCase();
		String  substr = str.substring(2, 5);
		String replacestr = lstr.replace('a', 'b');
		
		System.out.println(len);
		System.out.println(lstr);
		System.out.println(ustr);
		System.out.println(substr);
		System.out.println(replacestr);
		System.out.println(str.startsWith("Ath"));
		System.out.println(str.endsWith("Ath"));
		System.out.println(str.charAt(3));
		
		
		// Arrays

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int [][] twoarr = new int[n][m];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.println("Enter the number for " + i + "th row and " + j +"th column: ");
				int temp =  sc.nextInt();
				twoarr[i][j]=temp;
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(twoarr[i][j] + " ");
			}
			System.out.println("\r\n");
		}
		sc.close();
		
	}

}
