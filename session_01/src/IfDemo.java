import java.util.Scanner;

public class IfDemo {
	
	public static void main(String[] args) {
		
		int num;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number = ");
		num = s.nextInt();
		if(num == 33)
		{
			System.out.println("Are equal");
		}
		else
			System.out.println("Are not equal");
		
	}

}
