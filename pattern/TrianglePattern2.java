// java program to print triangle pattern


/*   a
     a b
     a b c
     a b c d
     a b c d e   */


     class TrianglePattern2
     {
     	public static void main(String[] args)
     	 {
     		for( int i = 1 ; i<=5 ; i++)
     		{
     			char ch = 'a';
     			for(int j = 1 ; j<=i ; j++)
     			{
     				System.out.print(ch+++ " ");
     			}
     			System.out.println();
     		}
     	}
     }