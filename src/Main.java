import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String original = "adb FGHJ ABC abc DEGE  ";
		String s01=original.toLowerCase();
		String s02=original.toUpperCase();
		String s03=original.trim();
		String s04=original.substring(2);
		String s05=original.substring(2, 9);
		String s06=original.replace('a', 'x');
		String s07=original.replace("ABC", "DENISE");
		int i = original.indexOf("a");
		int j = original.lastIndexOf("bc");
		
		
		System.out.println(original +"-");
		System.out.println(s01);
		System.out.println(s02);
		System.out.println(s03+"-");
		System.out.println(s04+"-");
		System.out.println(s05);
		System.out.println(s06);
		System.out.println(s07);
		System.out.println(i);
		System.out.println(j);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int higher = max (a,b,c);
		
		showResult(higher);
		 
		sc.close();

	}
	
	public static int max(int x, int y, int z) {
		int aux;
		if (x>y && x>z) {
			aux = x;
		}
		else if(y>z) {
			aux = y;	
		}
		else {
			aux = z;
			
		}
		return aux;
	}
	public static void showResult(int value)
	{
		System.out.println("Higher = "+ value);
		
	}

}
