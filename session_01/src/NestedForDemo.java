
public class NestedForDemo {
	
	public static void main(String[] args) {
		
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				//System.out.println(i+" "+j);
				if((i==2) && (j==2))
				{
					//break;
					continue;//skip the statement
				}
				System.out.println(i+" "+j);
			}
			System.out.println();
		}	
	}
}

//for every value of outer loop inner loop executes completely.

/*
 * for(init; condn; inc/dec)//outer loop
 *  { 
 *  for(init; cond; inc/dec)//innerloop 
 *  {
 * //stmts } 
 * }
 */
