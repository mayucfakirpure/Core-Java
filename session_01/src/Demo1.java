
public class Demo1 {
	
	public static void main(String[] args) {
		
		int no = 10;
		System.out.println("no = "+no);
		
		float div =(float) 5/2;
		System.out.println("Div = "+div);
		
		/*float div =(float) 5%2;
		System.out.println("Div = "+div);*/
		
		int x = no++;// first it will assign and then will inc
		System.out.println("x = "+x);//10
		
		int y = ++no;// inc first and the assign
		System.out.println("y = "+y);//12
		
		System.out.println("10/0.0 = "+10/0.0);
		System.out.println("-10/0.0 = "+(-10/0.0));
		
		//System.out.println(10/0);// ArithmeticExcpetion
		
		System.out.println("0.0/0.0 = "+(0.0/0.0));
	}

}

/*
 * / %
 */

/*
 * no++;
 * 
 * ++no;
 */

